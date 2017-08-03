package demos;
import org.apache.commons.beanutils.BeanUtils;

public class demo {
	public static void main(String[] args){
		String name="刘天博";
		int age=20;
		String birthday="1995-01-24";
		Datamap map=new Datamap();
		BeanUtils.setProperty(map, "name", name);
		BeanUtils.setProperty(map, "age", age);
		BeanUtils.setProperty(map, "birrhday", birthday);
		System.out.println(map);
	}

}
