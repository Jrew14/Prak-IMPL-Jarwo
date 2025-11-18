
public class Course {

    private String CourseName;
    private String CourseId;
    private String CourseCategory;

    public String getId() {
        return CourseId; // mengembalikan nilai id Course
    }

    public void setId(String id) {
        this.CourseId = id; // set id Course
    }

    public String getName() {
        return CourseName; // Mengembalikan Nama Course
    }

    public void setName(String name) {
        this.CourseName = name; // set Nama Course
    }

    public String getCategory() {
        return CourseCategory; // Mengembalikan kategori Course
    }

    public void setCategory(String category) {
        this.CourseCategory = category; // set Kategori Course
    }
}
