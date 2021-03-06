package com.svt.cube.controller;

import com.svt.cube.entity.Tag;
import com.svt.cube.service.TagService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/tag")
public class TagController {

  private final TagService tagService;

  @Autowired
  public TagController(TagService tagService) {
    this.tagService = tagService;
  }

  @CrossOrigin
  @GetMapping
  // @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_MODERATOR') or
  // hasRole('ROLE_ADMIN') or hasRole('ROLE_SUPERADMIN')")
  public List<Tag> getAllTags() {
    return tagService.getAllTags();
  }

  @CrossOrigin
  @GetMapping("/{id}")
  // @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_MODERATOR') or
  // hasRole('ROLE_ADMIN') or hasRole('ROLE_SUPERADMIN')")
  public List<Tag> getFamilyTagsTags(@PathVariable Integer id) {
    return tagService.getFamilyTagsTags(id);
  }

  @CrossOrigin
  @PostMapping
  // @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_SUPERADMIN')")
  public Tag createTag(@RequestBody Tag tag) {
    return tagService.createTag(tag);
  }

  @CrossOrigin
  @DeleteMapping("/{id}")
  // @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_SUPERADMIN')")
  public void deleteTag(@PathVariable Integer id) {
    tagService.deleteTag(id);
  }

  @CrossOrigin
  @PutMapping("/{id}")
  // @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_SUPERADMIN')")
  public void modifyTag(@PathVariable Integer id, @RequestBody Tag tag) {
    tagService.modifyTag(tag);
  }

}
