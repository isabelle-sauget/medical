
import java.time.LocalDate;

@Entity
@Table(name = "users")

public class User {
    


@Column(nullable = false, unique = true)
private Long CNP;

private String password;

private String tipUtlizator;

private String email;

private String fullName;

private String nrTelefon;

private String specializare;

private LocalDate dataNasterii;

public User() {}

public User(Long CNP, String password, String email, String fullName, String nrTelefon,
             String specializare, LocalDate dataNasterii, String tipUtlizator) {
        this.CNP = CNP;
        this.password = password;
        this.tipUtlizator = tipUtlizator;
        this.email = email;
        this.fullName = fullName;
        this.nrTelefon = nrTelefon;
        this.specializare = specializare;
        this.dataNasterii = dataNasterii;
    }

public Long getCNP() {
        return CNP;
    }
public void setCNP(Long CNP) {
        this.CNP = CNP;
    }

public String getPassword() {
        return password;
    }
public void setPassword(String password) {
        this.password = password;
    }

public String getTipUtlizator() {
        return tipUtlizator;
    }
public void setTipUtlizator(String tipUtlizator) {
        this.tipUtlizator = tipUtlizator;
    }

    

public String getEmail() {
        return email;
    }
public void setEmail(String email) {
        this.email = email;
    }

public String getFullName() {
        return fullName;
    }
public void setFullName(String fullName) {
        this.fullName = fullName;
    }

public String getNrTelefon() {
        return nrTelefon;
    }
public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

public String getSpecializare() {
        return specializare;
    }
public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

public LocalDate getDataNasterii() {
        return dataNasterii;
    }
public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }





}
