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
@Table(name = "Book")
public class Book {
    @Id @Column(name="Book_ID")
    int bookID;
    @Column(name = "Publisher_ID")
    int publisherID;
    @Column(name = "Book_Title")
    String bookTitle;
    @Column (name = "Book_Copy")
    int bookCopy;
    @Column (name = "Book_Author")
    String bookAuthor;



}
