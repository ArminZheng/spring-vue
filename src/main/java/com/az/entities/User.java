package com.az.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
// Entity + Table = Entity("tb_user")
@Entity // This is an entity class. 
// Specify which table it corresponds to.
@Table(name = "tb_user") // if omitted, it represents the class name in lowercase.
public class User {

    /**
     * This is a primary key.
     * <p>
     * IDENTITY: Relies on the database to auto-generate unique keys, typically through an
     * auto-increment feature.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增
    private Integer id;

    /**
     * table column
     */
    @Column(name = "last_name", length = 50)
    private String lastName;

    /**
     * Omit. The default column name is the attribute name.
     */
    @Column
    private String email;

}
