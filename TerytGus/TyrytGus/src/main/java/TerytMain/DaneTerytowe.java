package TerytMain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "terc_urzedowy_2022_06_10")
@NoArgsConstructor
public class DaneTerytowe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String RODZ;
    private String NAZWA;
    private String NazwaDod;
    private String WOJ;
    private String POW;
    private String GMI;
    private String STAN_NA;

    public DaneTerytowe(long id, String RODZ, String NAZWA, String nazwaDod, String WOJ, String POW, String GMI, String STAN_NA) {
        this.id = id;
        this.RODZ = RODZ;
        this.NAZWA = NAZWA;
        NazwaDod = nazwaDod;
        this.WOJ = WOJ;
        this.POW = POW;
        this.GMI = GMI;
        this.STAN_NA = STAN_NA;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRODZ() {
        return RODZ;
    }

    public void setRODZ(String RODZ) {
        this.RODZ = RODZ;
    }

    public String getNAZWA() {
        return NAZWA;
    }

    public void setNAZWA(String NAZWA) {
        this.NAZWA = NAZWA;
    }

    public String getNazwaDod() {
        return NazwaDod;
    }

    public void setNazwaDod(String nazwaDod) {
        NazwaDod = nazwaDod;
    }

    public String getWOJ() {
        return WOJ;
    }

    public void setWOJ(String WOJ) {
        this.WOJ = WOJ;
    }

    public String getPOW() {
        return POW;
    }

    public void setPOW(String POW) {
        this.POW = POW;
    }

    public String getGMI() {
        return GMI;
    }

    public void setGMI(String GMI) {
        this.GMI = GMI;
    }

    public String getSTAN_NA() {
        return STAN_NA;
    }

    public void setSTAN_NA(String STAN_NA) {
        this.STAN_NA = STAN_NA;
    }

    @Override
    public String toString() {
        return "DaneTerytowe{" +
                "id=" + id +
                ", RODZ='" + RODZ + '\'' +
                ", NAZWA='" + NAZWA + '\'' +
                ", NazwaDod='" + NazwaDod + '\'' +
                ", WOJ='" + WOJ + '\'' +
                ", POW='" + POW + '\'' +
                ", GMI='" + GMI + '\'' +
                ", STAN_NA='" + STAN_NA + '\'' +
                '}';
    }
}


//TUTAJ NIC NIE TRZEBA ZMIENIAĆ, TO JEST OD DEFINIOWANIA DLA PROGRAMU STRUKTURY ODCZYTYWANIA PLIKÓW Z BAZY DANYCH DLA SPRING BOOTA