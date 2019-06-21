package org.brijframework.fillDepand;

import java.util.LinkedHashSet;

import org.brijframework.factories.Factory;
import org.brijframework.meta.factories.asm.ClassMetaSetupFactoryImpl;
import org.brijframework.model.factories.meta.json.JsonMetaSetupFactory;
import org.brijframework.support.util.SupportUtil;

public class FillDepand {

	public static void main(String[] args) {
		LinkedHashSet<Class<? extends Factory>> classList =new LinkedHashSet<>();
		classList.add(ClassMetaSetupFactoryImpl.class);
		classList.add(JsonMetaSetupFactory.class);
		
		System.out.println(SupportUtil.getDepandOnSortedClassFactoryList(classList));
	}
}
