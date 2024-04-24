package Model;


import java.io.FileReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.ClassPojo;



public class Class1 {
public static void main(String[] args) throws Exception{
	

	FileReader file =new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\employee.json");



	ObjectMapper mapper =new ObjectMapper();



	JsonNode jsonNode = mapper.readTree(file);


	jsonNode=jsonNode.get("Employee");


ClassPojo emp = mapper.treeToValue(jsonNode,ClassPojo.class);


String reqbody = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);

System.out.println(reqbody);
}
}