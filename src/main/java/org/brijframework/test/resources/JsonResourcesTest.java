package org.brijframework.test.resources;

import java.io.IOException;
import java.net.URISyntaxException;

import org.brijframework.resources.Resource;
import org.brijframework.resources.factory.json.JsonResourceFactory;

public class JsonResourcesTest {

	public static void main(String[] args) throws IOException, URISyntaxException {
		Resource resource=JsonResourceFactory.factory().getResource("model.json");
		System.out.println(new String(resource.getContent()));
	}
}
