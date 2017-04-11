package factorymethods2;

import java.awt.Component;

import factorymethods2.rulesets.RuleException;

public interface RuleSet 
{
	// if any class implements RuleSet then it must have applyRules() method over ridden
	public void applyRules(Component ob) throws RuleException;
	
}
