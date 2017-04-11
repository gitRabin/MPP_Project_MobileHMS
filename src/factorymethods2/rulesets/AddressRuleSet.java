package factorymethods2.rulesets;

import java.awt.Component;

import factorymethods2.RuleSet;
import factorymethods2.windows.AddrWindow;
import factorymethods2.windows.AddressWindow;

final public class AddressRuleSet implements RuleSet
{
	// package level access
	AddressRuleSet()
	{
	}

	@Override
	public void applyRules(Component ob) throws RuleException
	{
		AddrWindow addr = (AddrWindow) ob;

		numericRule(addr);
		// comment
		//throw new RuleException("An address rule has been violated!");

	}
	
		
	
	private void numericRule(AddrWindow addr) throws RuleException 
	{
		String zip = addr.getZipValue();
		 try 
		 {
		 Integer.parseInt(zip);
		 
		 } 
		 catch(NumberFormatException e) 
		 {
		 throw new RuleException("Zip must be numeric");
		 }
	}

}
