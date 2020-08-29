package com.atguigu.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest
{

	@Value("${info.app.name}")
	private String appName;

	@Value("${info.build.artifactId}")
	private String artifactId;

	@Value("${info.build.version}")
	private String version;

	@RequestMapping("/config")
	public String getConfig()
	{
		String str = "appName: " + appName + "\t artifactId:" + artifactId + "\t version: " + version;
		System.out.println("******str: " + str);
		return str;
	}
}
