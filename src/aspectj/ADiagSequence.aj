package aspectj;

public aspect ADiagSequence {

	private int callIndex = 0;
	private boolean needSpacing = false;

	pointcut tracedMethods():
		call(* clients.*.*(..))
		|| call(* orders.*.*(..));

	Object around(): tracedMethods()
	{
		String methodName = thisJoinPoint.getSignature().getName();
		String callString = (++callIndex) + ". " + thisJoinPoint.getSignature().getDeclaringTypeName() +
				"-----" + methodName + "---->";
		
		if(needSpacing){
			space(callIndex, callString.length());
		}
		
		System.out.print(callString);

		Object object = proceed();
		needSpacing = callIndex > 1 ? true: false;
		// Après un retour de methode on revient à la ligne.
		System.out.println();

		space(callIndex, callString.length());

		System.out.println((callIndex--)+" <---- retour "+methodName+" -----");
		return object;
	}


	public void space(int callIndex, int spaceCount){
		// On comble le vide selon l'index de la stack call.
		for (int i = 1; i < callIndex; i++) {
			for(int j = 0; j < spaceCount; j++){
				System.out.print(" ");
			}
		}
	}

}
