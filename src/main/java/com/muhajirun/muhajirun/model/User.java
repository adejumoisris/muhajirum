package com.muhajirun.muhajirun.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseModel{
    private String name;
    private String emailAddress;
    private String passWord;
}
