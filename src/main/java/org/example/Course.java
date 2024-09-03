package org.example;

import java.util.List;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
