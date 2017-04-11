package factorymethods2.rulesets;

import java.awt.Component;

import factorymethods2.RuleSet;
import factorymethods2.windows.CustomerProfileWindow;

final public class CustomerProfileRuleSet implements RuleSet {
	// package level access
	CustomerProfileRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		CustomerProfileWindow custProf = (CustomerProfileWindow) ob;
		// check data

	}

}
