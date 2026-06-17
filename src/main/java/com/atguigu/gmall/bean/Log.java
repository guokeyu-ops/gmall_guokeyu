package com.atguigu.gmall.bean;

public class Log {
    private Common common;
    private Start start;
    private Page page;
    private Displays[] displays;
    private Actions[] actions;
    private Err err;
    private Long ts;

    public Common getCommon() { return common; }
    public void setCommon(Common common) { this.common = common; }
    public Start getStart() { return start; }
    public void setStart(Start start) { this.start = start; }
    public Page getPage() { return page; }
    public void setPage(Page page) { this.page = page; }
    public Displays[] getDisplays() { return displays; }
    public void setDisplays(Displays[] displays) { this.displays = displays; }
    public Actions[] getActions() { return actions; }
    public void setActions(Actions[] actions) { this.actions = actions; }
    public Err getErr() { return err; }
    public void setErr(Err err) { this.err = err; }
    public Long getTs() { return ts; }
    public void setTs(Long ts) { this.ts = ts; }

    public static class Common {
        private String ar, ba, ch, is_new, md, mid, os, sid, uid, vc;
        public String getAr() { return ar; }
        public void setAr(String ar) { this.ar = ar; }
        public String getBa() { return ba; }
        public void setBa(String ba) { this.ba = ba; }
        public String getCh() { return ch; }
        public void setCh(String ch) { this.ch = ch; }
        public String getIs_new() { return is_new; }
        public void setIs_new(String is_new) { this.is_new = is_new; }
        public String getMd() { return md; }
        public void setMd(String md) { this.md = md; }
        public String getMid() { return mid; }
        public void setMid(String mid) { this.mid = mid; }
        public String getOs() { return os; }
        public void setOs(String os) { this.os = os; }
        public String getSid() { return sid; }
        public void setSid(String sid) { this.sid = sid; }
        public String getUid() { return uid; }
        public void setUid(String uid) { this.uid = uid; }
        public String getVc() { return vc; }
        public void setVc(String vc) { this.vc = vc; }
    }

    public static class Start {
        private String entry;
        private Long loading_time, open_ad_id, open_ad_ms, open_ad_skip_ms;
        public String getEntry() { return entry; }
        public void setEntry(String entry) { this.entry = entry; }
        public Long getLoading_time() { return loading_time; }
        public void setLoading_time(Long loading_time) { this.loading_time = loading_time; }
        public Long getOpen_ad_id() { return open_ad_id; }
        public void setOpen_ad_id(Long open_ad_id) { this.open_ad_id = open_ad_id; }
        public Long getOpen_ad_ms() { return open_ad_ms; }
        public void setOpen_ad_ms(Long open_ad_ms) { this.open_ad_ms = open_ad_ms; }
        public Long getOpen_ad_skip_ms() { return open_ad_skip_ms; }
        public void setOpen_ad_skip_ms(Long open_ad_skip_ms) { this.open_ad_skip_ms = open_ad_skip_ms; }
    }

    public static class Page {
        private Long during_time;
        private String item, item_type, last_page_id, page_id, from_pos_id, from_pos_seq, refer_id;
        public Long getDuring_time() { return during_time; }
        public void setDuring_time(Long during_time) { this.during_time = during_time; }
        public String getItem() { return item; }
        public void setItem(String item) { this.item = item; }
        public String getItem_type() { return item_type; }
        public void setItem_type(String item_type) { this.item_type = item_type; }
        public String getLast_page_id() { return last_page_id; }
        public void setLast_page_id(String last_page_id) { this.last_page_id = last_page_id; }
        public String getPage_id() { return page_id; }
        public void setPage_id(String page_id) { this.page_id = page_id; }
        public String getFrom_pos_id() { return from_pos_id; }
        public void setFrom_pos_id(String from_pos_id) { this.from_pos_id = from_pos_id; }
        public String getFrom_pos_seq() { return from_pos_seq; }
        public void setFrom_pos_seq(String from_pos_seq) { this.from_pos_seq = from_pos_seq; }
        public String getRefer_id() { return refer_id; }
        public void setRefer_id(String refer_id) { this.refer_id = refer_id; }
    }

    public static class Displays {
        private String display_type, item, item_type, pos_seq, pos_id;
        public String getDisplay_type() { return display_type; }
        public void setDisplay_type(String display_type) { this.display_type = display_type; }
        public String getItem() { return item; }
        public void setItem(String item) { this.item = item; }
        public String getItem_type() { return item_type; }
        public void setItem_type(String item_type) { this.item_type = item_type; }
        public String getPos_seq() { return pos_seq; }
        public void setPos_seq(String pos_seq) { this.pos_seq = pos_seq; }
        public String getPos_id() { return pos_id; }
        public void setPos_id(String pos_id) { this.pos_id = pos_id; }
    }

    public static class Actions {
        private String action_id, item, item_type;
        private Long ts;
        public String getAction_id() { return action_id; }
        public void setAction_id(String action_id) { this.action_id = action_id; }
        public String getItem() { return item; }
        public void setItem(String item) { this.item = item; }
        public String getItem_type() { return item_type; }
        public void setItem_type(String item_type) { this.item_type = item_type; }
        public Long getTs() { return ts; }
        public void setTs(Long ts) { this.ts = ts; }
    }

    public static class Err {
        private Long error_code;
        private String msg;
        public Long getError_code() { return error_code; }
        public void setError_code(Long error_code) { this.error_code = error_code; }
        public String getMsg() { return msg; }
        public void setMsg(String msg) { this.msg = msg; }
    }
}