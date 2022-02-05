package com.relevel.emailserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Draft {

    @Id
    private long draft_id;
}
