package com.example.retrofit20072021;
public class Demo4 {

    private String khoahoc;
    private String hocphi;

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getHocphi() {
        return hocphi;
    }

    public void setHocphi(String hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Demo4.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("khoahoc");
        sb.append('=');
        sb.append(((this.khoahoc == null) ? "<null>" : this.khoahoc));
        sb.append(',');
        sb.append("hocphi");
        sb.append('=');
        sb.append(((this.hocphi == null) ? "<null>" : this.hocphi));
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
        result = ((result * 31) + ((this.khoahoc == null) ? 0 : this.khoahoc.hashCode()));
        result = ((result * 31) + ((this.hocphi == null) ? 0 : this.hocphi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Demo4) == false) {
            return false;
        }
        Demo4 rhs = ((Demo4) other);
        return (((this.khoahoc == rhs.khoahoc) || ((this.khoahoc != null) && this.khoahoc.equals(rhs.khoahoc))) && ((this.hocphi == rhs.hocphi) || ((this.hocphi != null) && this.hocphi.equals(rhs.hocphi))));
    }

}