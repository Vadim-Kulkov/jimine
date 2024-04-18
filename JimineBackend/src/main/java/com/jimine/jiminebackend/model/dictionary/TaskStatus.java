package com.jimine.jiminebackend.model.dictionary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "task_status_id")),
        @AttributeOverride(name = "name", column = @Column(name = "task_status_name"))
})
public class TaskStatus extends BaseDictionary {
}
