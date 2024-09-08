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
@Table(name = "Publisher")
public class Publisher {
    @Id @Column(name = "Publisher_ID")
    int publisherID;
    @Column (name = "Publiser_Name")
    String publisherName;
    @Column (name = "Publisher_Address")
    String publisherAddress;
}
