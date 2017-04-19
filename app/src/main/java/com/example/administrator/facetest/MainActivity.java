package com.example.administrator.facetest;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.baidu.aip.face.AipFace;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private static final int GET_IMAGE = 1001;
    private Button btnCho;
    private Button btnFace;
    private FaceView ivImage;
    public static final String APP_ID = "9534281";
    public static final String API_KEY = "cWw91H1AI4NlwmaFX3ThIif8";
    public static final String SECRET_KEY = "9p9AmDKFf6RmGFMCtSf5BGLP620r6kFh";
    private AipFace client;
    private Bitmap bitmap;
    private Handler handler;
    private FaceBean face;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        init();
        initHandler();

    }


    private void initViews() {
        btnCho= (Button) findViewById(R.id.btn_Cho);
        btnFace= (Button) findViewById(R.id.btn_Face);
        ivImage= (FaceView) findViewById(R.id.iv_image);
    }



    private void initHandler() {
        handler=new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                Rect rect= (Rect) msg.obj;
                ivImage.drawFace(rect);
                return true;
            }
        });
    }

    private void init() {
        // 初始化一个FaceClient
        client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

/*        ivImage.setDrawingCacheEnabled(true);
        bitmap= ivImage.getDrawingCache();
        ivImage.setDrawingCacheEnabled(false);*/

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clientDetect();
            }
        });

        btnCho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose();
            }
        });

    }

    private void choose() {
        Intent intent=new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,GET_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==GET_IMAGE){
            Uri uri=data.getData();
            ContentResolver content=this.getContentResolver();
            try {
                Bitmap bmp = BitmapFactory.decodeStream(content.openInputStream(uri));
                bitmap=bmp;
                ivImage.setImageBitmap(bitmap);
            } catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    private void clientDetect() {
        final HashMap<String,String> hashMap=new HashMap<>();
        //age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities
        hashMap.put("face_fields","age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities");
        Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.raw.ziyi1);
        final byte[] b=getBitmap(bmp);

        new Thread(new Runnable() {
            @Override
            public void run() {
                JSONObject res=client.detect(b,hashMap);
                Log.e("MainActivity",res.toString());

                Gson gson=new Gson();
                face=gson.fromJson(res.toString(),FaceBean.class);
                int left=face.getResult().get(0).getLocation().getLeft();
                int top=face.getResult().get(0).getLocation().getTop();
                int width=face.getResult().get(0).getLocation().getWidth();
                int height=face.getResult().get(0).getLocation().getHeight();
                //Rect r = new Rect((117/2),(127/2),(117+207)/2,(127+194)/2);
                Rect r = new Rect(left,top,left + width,top + height);

                Message message = Message.obtain();
                message.obj = r;
                handler.sendMessage(message);
            }
        }).start();



    }


    public byte[] getBitmap(Bitmap bmp){
        ByteArrayOutputStream output=new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG,100,output);
        return output.toByteArray();
    }


}
