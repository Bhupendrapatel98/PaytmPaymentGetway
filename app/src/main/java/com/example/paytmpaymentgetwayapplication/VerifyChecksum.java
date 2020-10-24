package com.example.paytmpaymentgetwayapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VerifyChecksum {


        @SerializedName("return")
        @Expose
        private Boolean _return;
        @SerializedName("message")
        @Expose
        private Message message;

    @Override
    public String toString() {
        return "VerifyChecksum{" +
                "_return=" + _return +
                ", message=" + message +
                '}';
    }

    public Boolean getReturn() {
            return _return;
        }

        public void setReturn(Boolean _return) {
            this._return = _return;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }



    public class Message {

        @SerializedName("MID")
        @Expose
        private String mID;
        @SerializedName("ORDER_ID")
        @Expose
        private String oRDERID;
        @SerializedName("CUST_ID")
        @Expose
        private String cUSTID;
        @SerializedName("INDUSTRY_TYPE_ID")
        @Expose
        private String iNDUSTRYTYPEID;
        @SerializedName("CHANNEL_ID")
        @Expose
        private String cHANNELID;
        @SerializedName("EMAIL")
        @Expose
        private String eMAIL;
        @SerializedName("MOBILE_NO")
        @Expose
        private String mOBILENO;
        @SerializedName("TXN_AMOUNT")
        @Expose
        private String tXNAMOUNT;
        @SerializedName("WEBSITE")
        @Expose
        private String wEBSITE;
        @SerializedName("CALLBACK_URL")
        @Expose
        private String cALLBACKURL;
        @SerializedName("CHECKSUMHASH")
        @Expose
        private String cHECKSUMHASH;
        @SerializedName("PAYTM_TXN_ID")
        @Expose
        private String pAYTMTXNID;

        @Override
        public String toString() {
            return "Message{" +
                    "mID='" + mID + '\'' +
                    ", oRDERID='" + oRDERID + '\'' +
                    ", cUSTID='" + cUSTID + '\'' +
                    ", iNDUSTRYTYPEID='" + iNDUSTRYTYPEID + '\'' +
                    ", cHANNELID='" + cHANNELID + '\'' +
                    ", eMAIL='" + eMAIL + '\'' +
                    ", mOBILENO='" + mOBILENO + '\'' +
                    ", tXNAMOUNT='" + tXNAMOUNT + '\'' +
                    ", wEBSITE='" + wEBSITE + '\'' +
                    ", cALLBACKURL='" + cALLBACKURL + '\'' +
                    ", cHECKSUMHASH='" + cHECKSUMHASH + '\'' +
                    ", pAYTMTXNID='" + pAYTMTXNID + '\'' +
                    '}';
        }

        public String getMID() {
            return mID;
        }

        public void setMID(String mID) {
            this.mID = mID;
        }

        public String getORDERID() {
            return oRDERID;
        }

        public void setORDERID(String oRDERID) {
            this.oRDERID = oRDERID;
        }

        public String getCUSTID() {
            return cUSTID;
        }

        public void setCUSTID(String cUSTID) {
            this.cUSTID = cUSTID;
        }

        public String getINDUSTRYTYPEID() {
            return iNDUSTRYTYPEID;
        }

        public void setINDUSTRYTYPEID(String iNDUSTRYTYPEID) {
            this.iNDUSTRYTYPEID = iNDUSTRYTYPEID;
        }

        public String getCHANNELID() {
            return cHANNELID;
        }

        public void setCHANNELID(String cHANNELID) {
            this.cHANNELID = cHANNELID;
        }

        public String getEMAIL() {
            return eMAIL;
        }

        public void setEMAIL(String eMAIL) {
            this.eMAIL = eMAIL;
        }

        public String getMOBILENO() {
            return mOBILENO;
        }

        public void setMOBILENO(String mOBILENO) {
            this.mOBILENO = mOBILENO;
        }

        public String getTXNAMOUNT() {
            return tXNAMOUNT;
        }

        public void setTXNAMOUNT(String tXNAMOUNT) {
            this.tXNAMOUNT = tXNAMOUNT;
        }

        public String getWEBSITE() {
            return wEBSITE;
        }

        public void setWEBSITE(String wEBSITE) {
            this.wEBSITE = wEBSITE;
        }

        public String getCALLBACKURL() {
            return cALLBACKURL;
        }

        public void setCALLBACKURL(String cALLBACKURL) {
            this.cALLBACKURL = cALLBACKURL;
        }

        public String getCHECKSUMHASH() {
            return cHECKSUMHASH;
        }

        public void setCHECKSUMHASH(String cHECKSUMHASH) {
            this.cHECKSUMHASH = cHECKSUMHASH;
        }

        public String getPAYTMTXNID() {
            return pAYTMTXNID;
        }

        public void setPAYTMTXNID(String pAYTMTXNID) {
            this.pAYTMTXNID = pAYTMTXNID;
        }

    }



}
