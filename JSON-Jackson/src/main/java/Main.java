import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        SomeData someData = new SomeData();
        someData.setParam1(1892);
        someData.setParam2(true);
        someData.setParam3("YNWA");

        String result1 = objectMapper.writeValueAsString(someData);
        System.out.println(result1);

        ArrayData arrayData = new ArrayData();
        arrayData.setArr(new int[] {5,1,4,6,78,12,31,0,90,32});

        String result2 = objectMapper.writeValueAsString(arrayData);
        System.out.println(result2);

        InnerObject innerObject = new InnerObject();
        innerObject.setArrayData(arrayData);
        innerObject.setId(12);
        innerObject.setName("Name for inner object");
        innerObject.setSomeData(someData);

        String result3 = objectMapper.writeValueAsString(innerObject);
        System.out.println(result3);

        InnerObject reconstructedInnerObject = objectMapper.readValue(result3, InnerObject.class);
        System.out.println(reconstructedInnerObject.toString());
        System.out.println("---");

    }
}
