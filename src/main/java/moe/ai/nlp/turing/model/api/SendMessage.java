package moe.ai.nlp.turing.model.api;

import lombok.Data;

@Data
public class SendMessage {

    /**
     * reqType : 0
     * perception : {"inputText":{"text":"附近的酒店"},"inputImage":{"url":"imageUrl"},"inputMedia":{"url":"imageUrl"},"selfInfo":{"location":{"city":"北京","province":"北京","street":"信息路"}}}
     * userInfo : {"apiKey":"","userId":"","groupId":"","userIdName":""}
     */

    private int reqType;
    private PerceptionBean perception;
    private UserInfoBean userInfo;

    public int getReqType() {
        return reqType;
    }

    public void setReqType(int reqType) {
        this.reqType = reqType;
    }

    public PerceptionBean getPerception() {
        return perception;
    }

    public void setPerception(PerceptionBean perception) {
        this.perception = perception;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }
    @Data
    public static class PerceptionBean {
        /**
         * inputText : {"text":"附近的酒店"}
         * inputImage : {"url":"imageUrl"}
         * inputMedia : {"url":"imageUrl"}
         * selfInfo : {"location":{"city":"北京","province":"北京","street":"信息路"}}
         */

        private InputTextBean inputText;
        private InputImageBean inputImage;
        private InputMediaBean inputMedia;
        private SelfInfoBean selfInfo;

        public InputTextBean getInputText() {
            return inputText;
        }

        public void setInputText(InputTextBean inputText) {
            this.inputText = inputText;
        }

        public InputImageBean getInputImage() {
            return inputImage;
        }

        public void setInputImage(InputImageBean inputImage) {
            this.inputImage = inputImage;
        }

        public InputMediaBean getInputMedia() {
            return inputMedia;
        }

        public void setInputMedia(InputMediaBean inputMedia) {
            this.inputMedia = inputMedia;
        }

        public SelfInfoBean getSelfInfo() {
            return selfInfo;
        }

        public void setSelfInfo(SelfInfoBean selfInfo) {
            this.selfInfo = selfInfo;
        }
        @Data
        public static class InputTextBean {
            /**
             * text : 附近的酒店
             */

            private String text;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
        @Data
        public static class InputImageBean {
            /**
             * url : imageUrl
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
        @Data
        public static class InputMediaBean {
            /**
             * url : imageUrl
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
        @Data
        public static class SelfInfoBean {
            /**
             * location : {"city":"北京","province":"北京","street":"信息路"}
             */

            private LocationBean location;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }
            @Data
            public static class LocationBean {
                /**
                 * city : 北京
                 * province : 北京
                 * street : 信息路
                 */

                private String city;
                private String province;
                private String street;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }
            }
        }
    }
    @Data
    public static class UserInfoBean {
        /**
         * apiKey :
         * userId :
         * groupId :
         * userIdName :
         */

        private String apiKey;
        private String userId;
        private String groupId;
        private String userIdName;

        public UserInfoBean(String apiKey, String userId) {
            this.apiKey = apiKey;
            this.userId = userId;
        }

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getUserIdName() {
            return userIdName;
        }

        public void setUserIdName(String userIdName) {
            this.userIdName = userIdName;
        }
    }
}
