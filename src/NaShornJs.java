import java.io.FileReader;
import java.io.FileNotFoundException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NaShornJs {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		// TODO Auto-generated method stub
		ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");
		se.eval(new FileReader("D:\\HCL\\27.08.2021\\src\\sample.js"));

	}

}
