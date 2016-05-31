package Operators;

public final class OperationSingletons {

	private static Addition additionInstance;
	private static Subtraction subtractionInstance;
	private static Multiplication multiplicationInstance;
	private static Division divisionInstance;
	private static Greater greaterInstance;
	private static Lesser lesserInstance;
	private static Equals equalsInstance;
	private static Modulo moduloInstance;
	private static And andInstance;
	private static Or orInstance;

	private OperationSingletons() {}

	public Operation getAdditionInstance() {
		if (additionInstance == null) {
			additionInstance = new Addition(); 
		}

		return additionInstance;
	}

	public Operation getSubtractionInstance() {
		if (subtractionInstance == null) {
			subtractionInstance = new Subtraction(); 
		}

		return subtractionInstance;
	}

	public Operation getMultiplicationInstance() {
		if (multiplicationInstance == null) {
			multiplicationInstance = new Multiplication(); 
		}

		return multiplicationInstance;
	}

	public Operation getDivisionInstance() {
		if (divisionInstance == null) {
			divisionInstance = new Division(); 
		}

		return divisionInstance;
	}

	public Operation getGreaterInstance() {
		if (greaterInstance == null) {
			greaterInstance = new Greater(); 
		}

		return greaterInstance;
	}

	public Operation getLesserInstance() {
		if (lesserInstance == null) {
			lesserInstance = new Lesser(); 
		}

		return lesserInstance;
	}

	public Operation getEqualsInstance() {
		if (equalsInstance == null) {
			equalsInstance = new Equals(); 
		}

		return equalsInstance;
	}

	public Operation getModuloInstance() {
		if (moduloInstance == null) {
			moduloInstance = new Modulo(); 
		}

		return moduloInstance;
	}

	public Operation getAndInstance() {
		if (andInstance == null) {
			andInstance = new And(); 
		}

		return andInstance;
	}

	public Operation getOrInstance() {
		if (orInstance == null) {
			orInstance = new Or(); 
		}

		return orInstance;
	}

}
