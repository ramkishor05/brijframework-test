package org.brijframework.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

import com.google.auto.service.AutoService;

@SupportedAnnotationTypes("org.brijframework.support.mapper.Mapper")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class MyProcessor extends AbstractProcessor {

	@Override
	public synchronized void init(ProcessingEnvironment env){ 
		System.out.println("=========init================");
	}

	@Override
	public boolean process(Set<? extends TypeElement> annoations, RoundEnvironment env) {
		System.out.println("=========process================"+annoations);
		return false; 
   }

	@Override
	public Set<String> getSupportedAnnotationTypes() {
		return null; 
	}

	@Override
	public SourceVersion getSupportedSourceVersion() {
		return null; 
	}

}