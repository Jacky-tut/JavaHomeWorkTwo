import java.util.Arrays;
public class Task1 {
    public static void main(String[] args){
        String sql =  "select * from students where ";
        String json =  "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] jsonArray = json
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "")
                .replaceAll(":", " ")
                .replace("name", "")
                .replace("country", "")
                .replace("city", "")
                .split(",");

        System.out.println(Arrays.toString(jsonArray));
        StringBuilder builder = new StringBuilder();
        builder.append(jsonArray[0]).append(", ").append(jsonArray[1]).append(", ").append(jsonArray[2]);
        System.out.print(builder);
    }
}
