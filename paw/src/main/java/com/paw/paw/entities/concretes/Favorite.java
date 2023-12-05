package com.paw.paw.entities.concretes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name = "favorites")
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {
          @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
          @Column(name = "id")
          private int id;

          @Column(name = "advertid")
          private int advertid;

          @Column(name = "userid")
          private int userid;
    
}
