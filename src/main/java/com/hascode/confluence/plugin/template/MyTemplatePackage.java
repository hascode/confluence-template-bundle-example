package com.hascode.confluence.plugin.template;

import java.util.ArrayList;
import java.util.List;

import com.atlassian.confluence.pages.templates.PageTemplate;
import com.atlassian.confluence.plugin.templates.export.TemplatePackage;
import com.atlassian.confluence.plugin.templates.export.TemplatePackageException;

public class MyTemplatePackage implements TemplatePackage {

	@Override
	public List<PageTemplate> getAvailableTemplates()
			throws TemplatePackageException {
		List<PageTemplate> templates = new ArrayList<PageTemplate>();
		PageTemplate t = new PageTemplate();
		t.setName("Some sample template");
		t.setContent("This is a test");
		t.setDescription("This sample template prints some sample text");
		t.setLabels("test");
		templates.add(t);

		return templates;
	}

	@Override
	public String getPackageName() {
		return "A nice template package bundle";
	}

}