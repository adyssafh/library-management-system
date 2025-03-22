package lms;

import java.util.List;

public class StaffMember extends Member {
    public String position;

    public StaffMember(int memberId, String name, String position) {
        super(memberId, name);
        this.position = position;
    }

}
