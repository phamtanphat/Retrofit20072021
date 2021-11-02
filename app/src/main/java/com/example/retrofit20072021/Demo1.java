package com.example.retrofit20072021;

import java.util.Objects;

public class Demo1 {

    private String monhoc;
    private String noihoc;
    private String website;
    private String fanpage;
    private String logo;

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public String getNoihoc() {
        return noihoc;
    }

    public void setNoihoc(String noihoc) {
        this.noihoc = noihoc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFanpage() {
        return fanpage;
    }

    public void setFanpage(String fanpage) {
        this.fanpage = fanpage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Demo1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("monhoc");
        sb.append('=');
        sb.append(((this.monhoc == null) ? "<null>" : this.monhoc));
        sb.append(',');
        sb.append("noihoc");
        sb.append('=');
        sb.append(((this.noihoc == null) ? "<null>" : this.noihoc));
        sb.append(',');
        sb.append("website");
        sb.append('=');
        sb.append(((this.website == null) ? "<null>" : this.website));
        sb.append(',');
        sb.append("fanpage");
        sb.append('=');
        sb.append(((this.fanpage == null) ? "<null>" : this.fanpage));
        sb.append(',');
        sb.append("logo");
        sb.append('=');
        sb.append(((this.logo == null) ? "<null>" : this.logo));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.monhoc == null) ? 0 : this.monhoc.hashCode()));
        result = ((result * 31) + ((this.logo == null) ? 0 : this.logo.hashCode()));
        result = ((result * 31) + ((this.website == null) ? 0 : this.website.hashCode()));
        result = ((result * 31) + ((this.noihoc == null) ? 0 : this.noihoc.hashCode()));
        result = ((result * 31) + ((this.fanpage == null) ? 0 : this.fanpage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Demo1) == false) {
            return false;
        }
        Demo1 rhs = ((Demo1) other);
        return (((((Objects.equals(this.monhoc, rhs.monhoc)) && (Objects.equals(this.logo, rhs.logo))) && (Objects.equals(this.website, rhs.website))) && (Objects.equals(this.noihoc, rhs.noihoc))) && (Objects.equals(this.fanpage, rhs.fanpage)));
    }

}