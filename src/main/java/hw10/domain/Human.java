package hw10.domain;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Human {

    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<String,String> schedule;
    public Family family;
    private DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Human() { }

    public Human(String name, String surname, String birthDate, int iq){
        this.name=name;
        this.surname=surname;
        this.birthDate = LocalDate.parse(birthDate, dateTimeFormatter).
                atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.iq=iq;
    }

    public Human(String name, String surname, String birthDate, int iq, Map<String, String> schedule){
        this.name=name;
        this.surname=surname;
        this.birthDate = LocalDate.parse(birthDate, dateTimeFormatter).
                atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.iq=iq;
        this.schedule=schedule;
    }

    public Human(String name) {
        this.name=name;
    }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public long getBirthDate() {
        return birthDate;
    }

    public int getIq() { return iq; }

    public Map<String, String> getSchedule() { return schedule; }

    public void setName(String name) { this.name = name; }

    public void setSurname(String surname) { this.surname = surname; }

    public void setBirthDate(long birthDate) { this.birthDate = birthDate; }

    public void setIq(int iq) { this.iq = iq; }


    public void setSchedule(Map<String,String> schedule) { this.schedule = schedule; }

    public Family getFamily() {
        return family;
    }

   public void setFamily(Family family) {
        this.family = family;
    }

   public String birthDateToString() {
        return LocalDate.ofInstant(Instant.ofEpochMilli(birthDate), ZoneId.systemDefault()).format(dateTimeFormatter);
   }

    public String describeAge() {
        StringBuilder s = new StringBuilder();
        LocalDate localDate = LocalDate.ofInstant(Instant.ofEpochMilli(birthDate), ZoneId.systemDefault());
        Period period = Period.between(localDate,LocalDate.now());
        s.append("Year:" + period.getYears());
        s.append(", Month:" + period.getMonths());
        s.append(", Days:" + period.getDays());
        return s.toString();
    }

    @Override
    public String toString(){
        return String.format("Human{name='%s', surname='%s', year='%s', iq=%d', Schedule=%s",
                name, surname, birthDateToString(), iq, schedule);
    }

}
