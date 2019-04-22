package dao;

import entity.Student;
import jxl.Sheet;
import jxl.Workbook;
import utils.JavaConnectionMysql;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 贾文兵
 * @Date:
 * @Description:
 * @Version:
 */

public class StudentDao {
    // 插入数据
    public int InsertData(Student student) {
        int res = 0;
        try{
            Connection conn = JavaConnectionMysql.getConn();
            String sql_insert = "insert into student_score(courseNumber,courseName,stuNumber,stuName,score) values(?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql_insert);
            ps.setString(1, student.getCourseNumber());
            ps.setString(2, student.getCourseName());
            ps.setString(3, student.getStuNumber());
            ps.setString(4, student.getStuName());
            ps.setString(5, student.getScore());
            res = ps.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //从excel表中读取所有数据
    public List<Student> getAllByExcel(String file) {
        ArrayList<Student> list = new ArrayList<Student>();
        try {
            // 打开Excel文件
            Workbook workbook = Workbook.getWorkbook(new File(file));
            // 打开对应的工作表
            Sheet sheet = workbook.getSheet(0);
            // 工作表中记录列数
            int cols = sheet.getColumns();
            // 工作表中记录列数
            int rows = sheet.getRows();

            for (int i = 1; i < rows; i++) { //行
                Student student = new Student();
                for (int j = 0; j < 7; ) {
                    // getCell()函数中参数一为列索引   参数二为行索引
                    student.setCourseNumber(sheet.getCell(j++, i).getContents());
                    student.setStuNumber(sheet.getCell(j++, i).getContents());
                    student.setScore(sheet.getCell(j++, i).getContents());
                    j++;
                    student.setStuName(sheet.getCell(j++, i).getContents());
                    j++;
                    student.setCourseName(sheet.getCell(j++, i).getContents());
                }
                list.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
