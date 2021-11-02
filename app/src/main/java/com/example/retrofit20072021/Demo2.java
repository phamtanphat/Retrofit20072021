package com.example.retrofit20072021;

import java.util.List;

public class Demo2 {

    private List<Danhsach> danhsach = null;

    public List<Danhsach> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(List<Danhsach> danhsach) {
        this.danhsach = danhsach;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Demo2.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("danhsach");
        sb.append('=');
        sb.append(((this.danhsach == null) ? "<null>" : this.danhsach));
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
        result = ((result * 31) + ((this.danhsach == null) ? 0 : this.danhsach.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Demo2) == false) {
            return false;
        }
        Demo2 rhs = ((Demo2) other);
        return ((this.danhsach == rhs.danhsach) || ((this.danhsach != null) && this.danhsach.equals(rhs.danhsach)));
    }

}