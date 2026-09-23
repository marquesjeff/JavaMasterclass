//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println(convertToCentimeters(6, 0));

}

public static double convertToCentimeters(int heightInches) {

    double heightCentimeters = heightInches * 2.54;
    return heightCentimeters;

}
public static double convertToCentimeters(int heightFeet, int heightInches) {
    int feetToInches = heightFeet * 12;
    int totalHeight = feetToInches + heightInches;
    double totalHeightCentimeters = convertToCentimeters(totalHeight);
    return totalHeightCentimeters;

}
