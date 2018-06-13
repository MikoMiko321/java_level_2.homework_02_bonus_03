package geekbrains.java_level_2.homework_02_bonus_03;

public enum BMI {
    UNDERWEIGHT(0), NORMAL(18.5), OVERWEIGHT(25), OBESITY(30);

    private final double categoryMinValue;

    BMI(double categoryMinValue) {
        this.categoryMinValue = categoryMinValue;
    }

    public static BMI getBMI(double value) {
    BMI found = UNDERWEIGHT;
        for (BMI bmi : values()) {
            if (value >= bmi.categoryMinValue) {
                found = bmi;
            }
        }
    return found;
    }
}
