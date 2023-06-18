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
        System.out.println(builder);

        String jsonStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] jsonStrArray = jsonStr
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .replace(":", " ")
                .replace("", "")
                .replace("}", "")
                .replace("{", "")
                .replace("фамилия", "")
                .replace("предмет", "")
                .replace("оценка", "")
                .split(",");

        StringBuilder builderOne = new StringBuilder();
        builderOne
                .append("Студент")
                .append(jsonStrArray[0])
                .append(" получил")
                .append(jsonStrArray[1])
                .append(" по предмету")
                .append(jsonStrArray[2]);
        StringBuilder builderTwo = new StringBuilder();
        builderTwo
                .append("Студент")
                .append(jsonStrArray[3])
                .append(" получил")
                .append(jsonStrArray[4])
                .append(" по предмету")
                .append(jsonStrArray[5]);
        StringBuilder builderThree = new StringBuilder();
        builderThree
                .append("Студент")
                .append(jsonStrArray[6])
                .append(" получил")
                .append(jsonStrArray[7])
                .append(" по предмету")
                .append(jsonStrArray[8]);
        System.out.println(Arrays.toString(jsonStrArray));
        System.out.println(builderOne);
        System.out.println(builderTwo);
        System.out.println(builderThree);
    }
}
