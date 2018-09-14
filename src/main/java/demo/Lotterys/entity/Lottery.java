package demo.Lotterys.entity;

import javax.persistence.*;

@Entity
public class Lottery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column()
    private String issue;
    @Column
    private String type;
    @Column
    private String number;
    @Column
    private String chance;

    public Lottery(Integer id, String name, String issue, String type, String number, String chance) {
        this.id = id;
        this.name = name;
        this.issue = issue;
        this.type = type;
        this.number = number;
        this.chance = chance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getChance() {
        return chance;
    }

    public void setChance(String chance) {
        this.chance = chance;
    }
}
