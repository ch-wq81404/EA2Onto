package test.com.bean.mapper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.util.XMIUtil;

public class BDDMapperTest {

	@Test
	public void test() {
		HashMap<String, String> rlt = new HashMap<String, String>();
		rlt.put("sourceI", null);
		if(rlt!=null){
			System.out.println(rlt.containsValue(null));
		}
		else System.out.println("rlt!=null");
			
	}

}
