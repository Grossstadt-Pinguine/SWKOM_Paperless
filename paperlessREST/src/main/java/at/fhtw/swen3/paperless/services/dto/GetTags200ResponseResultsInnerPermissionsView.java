package at.fhtw.swen3.paperless.services.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetTags200ResponseResultsInnerPermissionsView
 */

@JsonTypeName("GetTags_200_response_results_inner_permissions_view")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-03T13:46:03.125613Z[Etc/UTC]")
public class GetTags200ResponseResultsInnerPermissionsView {

  @Valid
  private List<Object> users = new ArrayList<>();

  @Valid
  private List<Object> groups = new ArrayList<>();

  public GetTags200ResponseResultsInnerPermissionsView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetTags200ResponseResultsInnerPermissionsView(List<Object> users, List<Object> groups) {
    this.users = users;
    this.groups = groups;
  }

  public GetTags200ResponseResultsInnerPermissionsView users(List<Object> users) {
    this.users = users;
    return this;
  }

  public GetTags200ResponseResultsInnerPermissionsView addUsersItem(Object usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @NotNull 
  @Schema(name = "users", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("users")
  public List<Object> getUsers() {
    return users;
  }

  public void setUsers(List<Object> users) {
    this.users = users;
  }

  public GetTags200ResponseResultsInnerPermissionsView groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public GetTags200ResponseResultsInnerPermissionsView addGroupsItem(Object groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @NotNull 
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("groups")
  public List<Object> getGroups() {
    return groups;
  }

  public void setGroups(List<Object> groups) {
    this.groups = groups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTags200ResponseResultsInnerPermissionsView getTags200ResponseResultsInnerPermissionsView = (GetTags200ResponseResultsInnerPermissionsView) o;
    return Objects.equals(this.users, getTags200ResponseResultsInnerPermissionsView.users) &&
        Objects.equals(this.groups, getTags200ResponseResultsInnerPermissionsView.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTags200ResponseResultsInnerPermissionsView {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

