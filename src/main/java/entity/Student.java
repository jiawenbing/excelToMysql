package entity;

/**
 * @Author: 贾文兵
 * @Date:
 * @Description:
 * @Version:
 */

public class Student {
    private String courseNumber;
    private String courseName;
    private String stuNumber;
    private String stuName;
    private String score;

    public Student() {
    }

    public Student(String courseNumber, String courseName, String stuNumber, String stuName, String score) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.stuNumber = stuNumber;
        this.stuName = stuName;
        this.score = score;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
