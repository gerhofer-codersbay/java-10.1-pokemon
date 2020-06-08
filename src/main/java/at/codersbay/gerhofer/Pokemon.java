package at.codersbay.gerhofer;

public class Pokemon {

    private Integer number;
    private String name;
    private Integer attack;
    private Integer defense;
    private Integer speed;
    private Double weight;
    private Integer generation;
    private boolean isLegendary;
    private Integer hitPoints;
    private String classification;

    public Pokemon(
            Integer number,
            String name,
            Integer attack,
            Integer defense,
            Integer speed,
            Double weight,
            Integer generation,
            boolean isLegendary,
            Integer hitPoints,
            String classification
    ) {
        this.number = number;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.weight = weight;
        this.generation = generation;
        this.isLegendary = isLegendary;
        this.hitPoints = hitPoints;
        this.classification = classification;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Pokemon{ " +
                "number=" + number +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", weight=" + weight +
                ", generation=" + generation +
                ", isLegendary=" + isLegendary +
                ", hitPoints=" + hitPoints +
                ", classification='" + classification + '\'' +
                '}';
    }
}
