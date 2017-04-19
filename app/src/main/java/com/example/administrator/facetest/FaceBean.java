package com.example.administrator.facetest;

import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */

public class FaceBean {

    /**
     * result_num : 1
     * result : [{"expression":0,"face_probability":1,"glasses":0,"location":{"left":59,"height":97,"width":102,"top":63},"landmark72":[{"y":80,"x":58},{"y":96,"x":61},{"y":111,"x":65},{"y":127,"x":70},{"y":142,"x":79},{"y":155,"x":95},{"y":159,"x":111},{"y":154,"x":126},{"y":141,"x":141},{"y":125,"x":152},{"y":109,"x":156},{"y":93,"x":159},{"y":78,"x":161},{"y":81,"x":74},{"y":77,"x":79},{"y":76,"x":85},{"y":78,"x":91},{"y":83,"x":96},{"y":84,"x":90},{"y":85,"x":84},{"y":84,"x":78},{"y":80,"x":85},{"y":69,"x":67},{"y":62,"x":74},{"y":62,"x":83},{"y":63,"x":91},{"y":69,"x":98},{"y":68,"x":90},{"y":67,"x":83},{"y":67,"x":75},{"y":82,"x":123},{"y":77,"x":128},{"y":75,"x":133},{"y":76,"x":139},{"y":79,"x":144},{"y":82,"x":140},{"y":83,"x":134},{"y":83,"x":128},{"y":79,"x":133},{"y":69,"x":120},{"y":63,"x":127},{"y":61,"x":135},{"y":62,"x":143},{"y":68,"x":151},{"y":66,"x":143},{"y":67,"x":135},{"y":68,"x":128},{"y":83,"x":103},{"y":92,"x":101},{"y":101,"x":100},{"y":111,"x":97},{"y":111,"x":103},{"y":111,"x":116},{"y":110,"x":122},{"y":101,"x":119},{"y":92,"x":118},{"y":83,"x":116},{"y":105,"x":109},{"y":129,"x":93},{"y":125,"x":101},{"y":124,"x":110},{"y":124,"x":119},{"y":128,"x":128},{"y":135,"x":120},{"y":138,"x":110},{"y":136,"x":100},{"y":129,"x":101},{"y":129,"x":110},{"y":128,"x":119},{"y":130,"x":119},{"y":131,"x":110},{"y":131,"x":102}],"beauty":84.12370300293,"race":"yellow","expression_probablity":0.99939715862274,"rotation_angle":-1,"landmark":[{"y":80,"x":85},{"y":79,"x":133},{"y":105,"x":109},{"y":130,"x":110}],"yaw":-0.16968365013599,"roll":-1.1958487033844,"qualities":{"completeness":0,"blur":0,"occlusion":{"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0},"type":{"cartoon":0.0045023444108665,"human":0.9954976439476},"illumination":0},"gender_probability":0.99999058246613,"age":26.134700775146,"gender":"female","glasses_probability":0.99999892711639,"faceshape":[{"type":"square","probability":0.053837966173887},{"type":"triangle","probability":0.0055206399410963},{"type":"oval","probability":0.46688461303711},{"type":"heart","probability":0.3033527135849},{"type":"round","probability":0.17040407657623}],"race_probability":0.99996650218964,"pitch":3.4711246490479}]
     * log_id : 3192196840
     */

    private int result_num;
    private long log_id;
    private List<ResultBean> result;

    public int getResult_num() {
        return result_num;
    }

    public void setResult_num(int result_num) {
        this.result_num = result_num;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * expression : 0
         * face_probability : 1
         * glasses : 0
         * location : {"left":59,"height":97,"width":102,"top":63}
         * landmark72 : [{"y":80,"x":58},{"y":96,"x":61},{"y":111,"x":65},{"y":127,"x":70},{"y":142,"x":79},{"y":155,"x":95},{"y":159,"x":111},{"y":154,"x":126},{"y":141,"x":141},{"y":125,"x":152},{"y":109,"x":156},{"y":93,"x":159},{"y":78,"x":161},{"y":81,"x":74},{"y":77,"x":79},{"y":76,"x":85},{"y":78,"x":91},{"y":83,"x":96},{"y":84,"x":90},{"y":85,"x":84},{"y":84,"x":78},{"y":80,"x":85},{"y":69,"x":67},{"y":62,"x":74},{"y":62,"x":83},{"y":63,"x":91},{"y":69,"x":98},{"y":68,"x":90},{"y":67,"x":83},{"y":67,"x":75},{"y":82,"x":123},{"y":77,"x":128},{"y":75,"x":133},{"y":76,"x":139},{"y":79,"x":144},{"y":82,"x":140},{"y":83,"x":134},{"y":83,"x":128},{"y":79,"x":133},{"y":69,"x":120},{"y":63,"x":127},{"y":61,"x":135},{"y":62,"x":143},{"y":68,"x":151},{"y":66,"x":143},{"y":67,"x":135},{"y":68,"x":128},{"y":83,"x":103},{"y":92,"x":101},{"y":101,"x":100},{"y":111,"x":97},{"y":111,"x":103},{"y":111,"x":116},{"y":110,"x":122},{"y":101,"x":119},{"y":92,"x":118},{"y":83,"x":116},{"y":105,"x":109},{"y":129,"x":93},{"y":125,"x":101},{"y":124,"x":110},{"y":124,"x":119},{"y":128,"x":128},{"y":135,"x":120},{"y":138,"x":110},{"y":136,"x":100},{"y":129,"x":101},{"y":129,"x":110},{"y":128,"x":119},{"y":130,"x":119},{"y":131,"x":110},{"y":131,"x":102}]
         * beauty : 84.12370300293
         * race : yellow
         * expression_probablity : 0.99939715862274
         * rotation_angle : -1
         * landmark : [{"y":80,"x":85},{"y":79,"x":133},{"y":105,"x":109},{"y":130,"x":110}]
         * yaw : -0.16968365013599
         * roll : -1.1958487033844
         * qualities : {"completeness":0,"blur":0,"occlusion":{"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0},"type":{"cartoon":0.0045023444108665,"human":0.9954976439476},"illumination":0}
         * gender_probability : 0.99999058246613
         * age : 26.134700775146
         * gender : female
         * glasses_probability : 0.99999892711639
         * faceshape : [{"type":"square","probability":0.053837966173887},{"type":"triangle","probability":0.0055206399410963},{"type":"oval","probability":0.46688461303711},{"type":"heart","probability":0.3033527135849},{"type":"round","probability":0.17040407657623}]
         * race_probability : 0.99996650218964
         * pitch : 3.4711246490479
         */

        private int expression;
        private int face_probability;
        private int glasses;
        private LocationBean location;
        private double beauty;
        private String race;
        private double expression_probablity;
        private int rotation_angle;
        private double yaw;
        private double roll;
        private QualitiesBean qualities;
        private double gender_probability;
        private double age;
        private String gender;
        private double glasses_probability;
        private double race_probability;
        private double pitch;
        private List<Landmark72Bean> landmark72;
        private List<LandmarkBean> landmark;
        private List<FaceshapeBean> faceshape;

        public int getExpression() {
            return expression;
        }

        public void setExpression(int expression) {
            this.expression = expression;
        }

        public int getFace_probability() {
            return face_probability;
        }

        public void setFace_probability(int face_probability) {
            this.face_probability = face_probability;
        }

        public int getGlasses() {
            return glasses;
        }

        public void setGlasses(int glasses) {
            this.glasses = glasses;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public double getBeauty() {
            return beauty;
        }

        public void setBeauty(double beauty) {
            this.beauty = beauty;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public double getExpression_probablity() {
            return expression_probablity;
        }

        public void setExpression_probablity(double expression_probablity) {
            this.expression_probablity = expression_probablity;
        }

        public int getRotation_angle() {
            return rotation_angle;
        }

        public void setRotation_angle(int rotation_angle) {
            this.rotation_angle = rotation_angle;
        }

        public double getYaw() {
            return yaw;
        }

        public void setYaw(double yaw) {
            this.yaw = yaw;
        }

        public double getRoll() {
            return roll;
        }

        public void setRoll(double roll) {
            this.roll = roll;
        }

        public QualitiesBean getQualities() {
            return qualities;
        }

        public void setQualities(QualitiesBean qualities) {
            this.qualities = qualities;
        }

        public double getGender_probability() {
            return gender_probability;
        }

        public void setGender_probability(double gender_probability) {
            this.gender_probability = gender_probability;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getGlasses_probability() {
            return glasses_probability;
        }

        public void setGlasses_probability(double glasses_probability) {
            this.glasses_probability = glasses_probability;
        }

        public double getRace_probability() {
            return race_probability;
        }

        public void setRace_probability(double race_probability) {
            this.race_probability = race_probability;
        }

        public double getPitch() {
            return pitch;
        }

        public void setPitch(double pitch) {
            this.pitch = pitch;
        }

        public List<Landmark72Bean> getLandmark72() {
            return landmark72;
        }

        public void setLandmark72(List<Landmark72Bean> landmark72) {
            this.landmark72 = landmark72;
        }

        public List<LandmarkBean> getLandmark() {
            return landmark;
        }

        public void setLandmark(List<LandmarkBean> landmark) {
            this.landmark = landmark;
        }

        public List<FaceshapeBean> getFaceshape() {
            return faceshape;
        }

        public void setFaceshape(List<FaceshapeBean> faceshape) {
            this.faceshape = faceshape;
        }

        public static class LocationBean {
            /**
             * left : 59
             * height : 97
             * width : 102
             * top : 63
             */

            private int left;
            private int height;
            private int width;
            private int top;

            public int getLeft() {
                return left;
            }

            public void setLeft(int left) {
                this.left = left;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getTop() {
                return top;
            }

            public void setTop(int top) {
                this.top = top;
            }
        }

        public static class QualitiesBean {
            /**
             * completeness : 0
             * blur : 0
             * occlusion : {"left_eye":0,"left_cheek":0,"nose":0,"right_eye":0,"chin":0,"mouth":0,"right_cheek":0}
             * type : {"cartoon":0.0045023444108665,"human":0.9954976439476}
             * illumination : 0
             */

            private int completeness;
            private int blur;
            private OcclusionBean occlusion;
            private TypeBean type;
            private int illumination;

            public int getCompleteness() {
                return completeness;
            }

            public void setCompleteness(int completeness) {
                this.completeness = completeness;
            }

            public int getBlur() {
                return blur;
            }

            public void setBlur(int blur) {
                this.blur = blur;
            }

            public OcclusionBean getOcclusion() {
                return occlusion;
            }

            public void setOcclusion(OcclusionBean occlusion) {
                this.occlusion = occlusion;
            }

            public TypeBean getType() {
                return type;
            }

            public void setType(TypeBean type) {
                this.type = type;
            }

            public int getIllumination() {
                return illumination;
            }

            public void setIllumination(int illumination) {
                this.illumination = illumination;
            }

            public static class OcclusionBean {
                /**
                 * left_eye : 0
                 * left_cheek : 0
                 * nose : 0
                 * right_eye : 0
                 * chin : 0
                 * mouth : 0
                 * right_cheek : 0
                 */

                private int left_eye;
                private int left_cheek;
                private int nose;
                private int right_eye;
                private int chin;
                private int mouth;
                private int right_cheek;

                public int getLeft_eye() {
                    return left_eye;
                }

                public void setLeft_eye(int left_eye) {
                    this.left_eye = left_eye;
                }

                public int getLeft_cheek() {
                    return left_cheek;
                }

                public void setLeft_cheek(int left_cheek) {
                    this.left_cheek = left_cheek;
                }

                public int getNose() {
                    return nose;
                }

                public void setNose(int nose) {
                    this.nose = nose;
                }

                public int getRight_eye() {
                    return right_eye;
                }

                public void setRight_eye(int right_eye) {
                    this.right_eye = right_eye;
                }

                public int getChin() {
                    return chin;
                }

                public void setChin(int chin) {
                    this.chin = chin;
                }

                public int getMouth() {
                    return mouth;
                }

                public void setMouth(int mouth) {
                    this.mouth = mouth;
                }

                public int getRight_cheek() {
                    return right_cheek;
                }

                public void setRight_cheek(int right_cheek) {
                    this.right_cheek = right_cheek;
                }
            }

            public static class TypeBean {
                /**
                 * cartoon : 0.0045023444108665
                 * human : 0.9954976439476
                 */

                private double cartoon;
                private double human;

                public double getCartoon() {
                    return cartoon;
                }

                public void setCartoon(double cartoon) {
                    this.cartoon = cartoon;
                }

                public double getHuman() {
                    return human;
                }

                public void setHuman(double human) {
                    this.human = human;
                }
            }
        }

        public static class Landmark72Bean {
            /**
             * y : 80
             * x : 58
             */

            private int y;
            private int x;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }

        public static class LandmarkBean {
            /**
             * y : 80
             * x : 85
             */

            private int y;
            private int x;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }

        public static class FaceshapeBean {
            /**
             * type : square
             * probability : 0.053837966173887
             */

            private String type;
            private double probability;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public double getProbability() {
                return probability;
            }

            public void setProbability(double probability) {
                this.probability = probability;
            }
        }
    }
}
