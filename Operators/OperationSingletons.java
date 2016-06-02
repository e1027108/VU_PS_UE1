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
	private static Apply applyInstance;
	private static Copy copyInstance;
	private static Negation negationInstance;
	private static Read_block readBlockInstance;
	private static Read_integer readIntegerInstance;
	private static Delete deleteInstance;

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
	
	public Operation getApplyInstance() {
		if (applyInstance == null) {
			applyInstance = new Apply(); 
		}

		return applyInstance;
	}
	
	public Operation getCopyInstance() {
		if (copyInstance == null) {
			copyInstance = new Copy(); 
		}

		return copyInstance;
	}
	
	public Operation getDeleteInstance() {
		if (deleteInstance == null) {
			deleteInstance = new Delete(); 
		}

		return deleteInstance;
	}
	
	public Operation getNegationInstance() {
		if (negationInstance == null) {
			negationInstance = new Negation(); 
		}

		return negationInstance;
	}
	
	public Operation readIntegerInstance() {
		if (readIntegerInstance == null) {
			readIntegerInstance = new Read_integer(); 
		}

		return readIntegerInstance;
	}

	public Operation readBlockInstance() {
		if (readBlockInstance == null) {
			readBlockInstance = new Read_block(); 
		}

		return readBlockInstance;
	}
	
}
