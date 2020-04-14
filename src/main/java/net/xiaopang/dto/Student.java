package net.xiaopang.dto;

/**
 * @description: 学生实体类
 * @author: Mr.songbeichang
 * @create: 2020-04-12 23:19
 **/
public class Student {
    private Integer sid;
    private String sname;
    private Integer sage;
    private String saddress;
    private Integer classId;
    private String sgender;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }
}



