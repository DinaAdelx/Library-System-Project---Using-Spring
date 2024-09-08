package main.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table (name = "Member")
public class Member {
    @Id @Column(name = "Member_ID")
    int memberID;
    @Column (name = "Member_Name")
    String memberName;
    @Column (name = "Member_Address")
    String memberAddress;

}
