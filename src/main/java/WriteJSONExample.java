import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // First employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "John");
        employeeDetails.put("lastName", "Doe");
        employeeDetails.put("website", "johndoe.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        // Second employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Barbara");
        employeeDetails2.put("lastName", "Brylska");
        employeeDetails2.put("website", "barbarabrylska.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        // Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        // Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {

            // We can write any JSONArray or JSONObject instance to the file
            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
