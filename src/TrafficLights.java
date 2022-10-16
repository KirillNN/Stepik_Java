public class TrafficLights {
    public static void main(String[] args) {
        System.out.println(updateLight("red"));
    }

    public static String updateLight(String current) {
        return switch (current) {
            case "red" -> "green";
            case "green" -> "yellow";
            case "yellow" -> "red";
            default -> "";
        };
    }

}
