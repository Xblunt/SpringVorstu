package dev.vorstu.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShortUser {
    private Long user_id;
    private String name;
    private String surname;
    private String username;
}
