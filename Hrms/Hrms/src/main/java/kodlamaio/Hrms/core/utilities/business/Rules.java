package kodlamaio.Hrms.core.utilities.business;

import kodlamaio.Hrms.core.utilities.results.Result;

public class Rules {

	public static Result Run(Result...logics)
    {
		for (var logic : logics) {
			if (!logic.isSuccess()) {
				return logic;
			}
		}
		return null;
    }

}
