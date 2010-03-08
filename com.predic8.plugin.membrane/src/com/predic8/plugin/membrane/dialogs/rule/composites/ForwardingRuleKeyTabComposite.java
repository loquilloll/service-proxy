/* Copyright 2009 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */
package com.predic8.plugin.membrane.dialogs.rule.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.predic8.plugin.membrane.components.RuleKeyGroup;

public class ForwardingRuleKeyTabComposite extends Composite {

	private RuleKeyGroup ruleKeyGroup;
	
	public ForwardingRuleKeyTabComposite(Composite parent) {
		super(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginTop = 12;
		gridLayout.marginLeft = 12;
		gridLayout.marginBottom = 12;
		gridLayout.marginRight = 12;
		setLayout(gridLayout);
		
		ruleKeyGroup = new RuleKeyGroup(this, SWT.NONE);
		
	}

	public RuleKeyGroup getRuleKeyGroup() {
		return ruleKeyGroup;
	}
	
}