package cn.izouxiang.likeviewdemo;

/**
 * Created by zouxiang on 2016/12/1.
 */

public class SSEntity {
    public String name;
    public String content = "今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!";
    public boolean isLike;
    public int likeNum;
    public int commentNum;

    public SSEntity(String name, boolean isLike, int likeNum, int commentNum) {
        this.name = name;
        this.isLike = isLike;
        this.likeNum = likeNum;
        this.commentNum = commentNum;
    }
}
