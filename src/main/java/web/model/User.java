package web.model;

import javax.validation.constraints.*;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "users_schema")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "field cannot be empty")
    @Size(max = 35, message = "the permissible size has been exceeded")
    @Column(name = "name")
    private String firstName;

    @NotBlank(message = "field cannot be empty")
    @Size(max = 35, message = "the permissible size has been exceeded")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "the number must consist of six digits")
    @Max(value = 1000000, message = "the number must consist of six digits")
    @Min(value = 100000, message = "the number must consist of six digits")
    @Column(name = "phone_number")
    private Integer phoneNumber;

    @NotBlank(message = "field cannot be empty")
    @Size(max = 45, message = "the permissible size has been exceeded")
    @Column(name = "department")
    private String department;

    public User() {
    }

    public User(String firstName, String lastName, String department, Integer phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
