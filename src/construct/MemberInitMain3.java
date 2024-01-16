package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 40, 80);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 30, 70);

        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("이름 :" + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
