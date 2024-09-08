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
@Table (name = "BorrowedBy")
public class  BorrowedBy {
    @Id @Column(name = "Borrow_ID")
    int borrowID;
    @Column (name = "Book_ID")
    int bookID;
    @Column (name = "Member_ID")
    int memberID;
    @Column (name = "DueDate")
    String dueDate;
    @Column (name = "StartDate")
    String StartDate;

}
