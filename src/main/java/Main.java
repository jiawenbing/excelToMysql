import dao.StudentDao;
import entity.Student;

import java.util.List;

/**
 * @Author: 贾文兵
 * @Date:
 * @Description:
 * @Version:
 */

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Administrator\\Desktop\\资料\\2016级成绩\\2016下.xls";
        StudentDao studentDao = new StudentDao();
        List<Student> list = studentDao.getAllByExcel(fileName);
        for (Student stu : list) {
            int i = 1;
            if (studentDao.InsertData(stu) > 0) {
                System.out.println("插入成功！");
            }
        }
    }
}
