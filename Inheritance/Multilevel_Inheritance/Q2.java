/*Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
 */
class Course {
    protected String courseName;
    protected int duration; // days

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String details() {
        return "Course: " + courseName + ", Duration: " + duration + " days";
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String details() {
        return "Online " + courseName + " on " + platform + " (" + (isRecorded ? "Recorded" : "Live") + "), " + duration + " days";
    }
}

class PaidOnlineCourse extends OnlineCourse {
    protected double fee;
    protected double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double finalFee() {
        return Math.max(0.0, fee - discount);
    }

    @Override
    public String details() {
        return "Paid " + courseName + " on " + platform + " (" + (isRecorded ? "Recorded" : "Live") + "), " + duration + " days, Fee: " + fee + ", Discount: " + discount + ", Final: " + finalFee();
    }
}

public class Q2 {
    public static void main(String[] args) {
        Course c1 = new Course("DSA Basics", 30);
        OnlineCourse c2 = new OnlineCourse("Cloud Fundamentals", 21, "Coursera", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Full-Stack Dev", 45, "Udemy", true, 4999.0, 1000.0);

        System.out.println(c1.details());
        System.out.println(c2.details());
        System.out.println(c3.details());

        Course[] catalog = {
            c1,
            new OnlineCourse("Kubernetes 101", 14, "YouTube", false),
            new PaidOnlineCourse("DevOps Bootcamp", 60, "Udemy", true, 7999.0, 1500.0)
        };

        for (Course c : catalog) {
            System.out.println(c.details());
        }
    }
}
