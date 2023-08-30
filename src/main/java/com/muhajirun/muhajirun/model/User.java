package com.muhajirun.muhajirun.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseModel{
    @Id
    private Long id;
    private String name;
    private String emailAddress;
    private String passWord;
}
