package factorymethods2.rulesets;

import java.awt.Component;
import java.util.HashMap;

import factorymethods2.RuleSet;
import factorymethods2.windows.AddrWindow;
import factorymethods2.windows.AddressWindow;
import factorymethods2.windows.CustomerProfileWindow;
import factorymethods2.windows.ProfileWindow;

final public class RuleSetFactory 
{
	private RuleSetFactory() 
	{
	}

	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static 
	{
		// assigning the rule set manually, for addressWindow.class, the rule set is AddressRuleSet()
		map.put(AddressWindow.class, new AddressRuleSet());
		map.put(CustomerProfileWindow.class, new CustomerProfileRuleSet());
		
		// Adding new Ruleset for different windows
		map.put(AddrWindow.class, new AddressRuleSet()); // we just assigned new ruleset for new gui Window which is AddrWindow now
		map.put(ProfileWindow.class, new CustomerProfileRuleSet()); //we just assigned new ruleset for new gui Window which is ProfileWindow now
	}

	public static RuleSet getRuleSet(Component c)
	{
		Class<? extends Component> cl = c.getClass();
		if (!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
}
