package com.svt.cube.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class View {

  @Id
  @SequenceGenerator(name = "favorite_sequence", sequenceName = "favorite_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "favorite_sequence")
  private Integer id;
  @Column(nullable = true, length = 3)
  private Integer topicId;
  @Column(length = 3)
  private Integer userId;

  public View() {
  }

  public View(Integer topicId, Integer userId) {
    this.topicId = topicId;
    this.userId = userId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }
}
