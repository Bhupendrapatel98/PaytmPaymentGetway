package com.example.paytmpaymentgetwayapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GenerateChecksum {

        @SerializedName("return")
        @Expose
        private Boolean _return;
        @SerializedName("data")
        @Expose
        private Data data;
        @SerializedName("CHECKSUMHASH")
        @Expose
        private String CHECKSUMHASH;

        public Boolean getReturn() {
            return _return;
        }

    @Override
    public String toString() {
        return "GenerateChecksum{" +
                "_return=" + _return +
                ", data=" + data +
                ", CHECKSUMHASH='" + CHECKSUMHASH + '\'' +
                '}';
    }

    public void setReturn(Boolean _return) {
            this._return = _return;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public String getCHECKSUMHASH() {
            return CHECKSUMHASH;
        }

        public void setCHECKSUMHASH(String CHECKSUMHASH) {
            this.CHECKSUMHASH = CHECKSUMHASH;
        }



    public class Data {


        @SerializedName("MID")
        @Expose
        private String MID;
        @SerializedName("ORDER_ID")
        @Expose
        private String ORDERID;
        @SerializedName("CUST_ID")
        @Expose
        private String CUSTID;
        @SerializedName("INDUSTRY_TYPE_ID")
        @Expose
        private String INDUSTRYTYPEID;
        @SerializedName("CHANNEL_ID")
        @Expose
        private String CHANNELID;
        @SerializedName("TXN_AMOUNT")
        @Expose
        private String TXNAMOUNT;
        @SerializedName("WEBSITE")
        @Expose
        private String WEBSITE;
        @SerializedName("EMAIL")
        @Expose
        private String EMAIL;
        @SerializedName("MOBILE_NO")
        @Expose
        private String MOBILENO;
        @SerializedName("CALLBACK_URL")
        @Expose
        private String CALLBACKURL;

        @Override
        public String toString() {
            return "Data{" +
                    "mID='" + MID + '\'' +
                    ", ORDERID='" + ORDERID + '\'' +
                    ", CUSTID='" + CUSTID + '\'' +
                    ", INDUSTRYTYPEID='" + INDUSTRYTYPEID + '\'' +
                    ", CHANNELID='" + CHANNELID + '\'' +
                    ", TXNAMOUNT='" + TXNAMOUNT + '\'' +
                    ", WEBSITE='" + WEBSITE + '\'' +
                    ", EMAIL='" + EMAIL + '\'' +
                    ", MOBILENO='" + MOBILENO + '\'' +
                    ", CALLBACKURL='" + CALLBACKURL + '\'' +
                    '}';
        }

        public String getmID() {
            return MID;
        }

        public void setmID(String mID) {
            this.MID = mID;
        }

        public String getORDERID() {
            return ORDERID;
        }

        public void setORDERID(String ORDERID) {
            this.ORDERID = ORDERID;
        }

        public String getCUSTID() {
            return CUSTID;
        }

        public void setCUSTID(String CUSTID) {
            this.CUSTID = CUSTID;
        }

        public String getINDUSTRYTYPEID() {
            return INDUSTRYTYPEID;
        }

        public void setINDUSTRYTYPEID(String INDUSTRYTYPEID) {
            this.INDUSTRYTYPEID = INDUSTRYTYPEID;
        }

        public String getCHANNELID() {
            return CHANNELID;
        }

        public void setCHANNELID(String CHANNELID) {
            this.CHANNELID = CHANNELID;
        }

        public String getTXNAMOUNT() {
            return TXNAMOUNT;
        }

        public void setTXNAMOUNT(String TXNAMOUNT) {
            this.TXNAMOUNT = TXNAMOUNT;
        }

        public String getWEBSITE() {
            return WEBSITE;
        }

        public void setWEBSITE(String WEBSITE) {
            this.WEBSITE = WEBSITE;
        }

        public String getEMAIL() {
            return EMAIL;
        }

        public void setEMAIL(String EMAIL) {
            this.EMAIL = EMAIL;
        }

        public String getMOBILENO() {
            return MOBILENO;
        }

        public void setMOBILENO(String MOBILENO) {
            this.MOBILENO = MOBILENO;
        }

        public String getCALLBACKURL() {
            return CALLBACKURL;
        }

        public void setCALLBACKURL(String CALLBACKURL) {
            this.CALLBACKURL = CALLBACKURL;
        }
    }

}
