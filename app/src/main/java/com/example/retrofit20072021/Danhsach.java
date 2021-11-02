package com.example.retrofit20072021;

public class Danhsach {

    private String khoahoc;

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Danhsach.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("khoahoc");
        sb.append('=');
        sb.append(((this.khoahoc == null) ? "<null>" : this.khoahoc));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Danhsach) == false) {
            return false;
        }
        Danhsach rhs = ((Danhsach) other);
        return ((this.khoahoc == rhs.khoahoc) || ((this.khoahoc != null) && this.khoahoc.equals(rhs.khoahoc)));
    }

}