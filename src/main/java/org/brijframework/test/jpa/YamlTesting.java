package org.brijframework.test.jpa;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
public class YamlTesting {
    public static void main(String[] args) throws IOException {
        
        Yaml yaml = new Yaml();  
        try( InputStream in = Files.newInputStream( Paths.get("E:\\brijframe\\org.brijframework-test\\src\\main\\resources\\application.yml") ) ) {
            @SuppressWarnings("unchecked")
			Map<String, Object> config = yaml.loadAs( in, HashMap.class );
            System.out.println( config.get("roles").getClass() );
        }
    }
}