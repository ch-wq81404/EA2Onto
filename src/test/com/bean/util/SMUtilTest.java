package test.com.bean.util;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;
import java.io.File;

import com.bean.UML.*;
import com.util.*;
import org.junit.Test;

public class SMUtilTest {

	@Test
	public void test() {
		XMI xmi = ParseUtil.parseXMI(new File("src\\resource\\autocar.xml"));
      List<UMLTransition> allTransitions = SMUtil.getAllTransitions(xmi);
      System.out.println(allTransitions.stream().map(UMLTransition::getSource).collect(Collectors.toList()));
	}

}
