# Problema

### Fazer um método que copia os elementos de uma lista para uma outra lista que pode ser mais genérica que a primeira.


<code>
        List<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(5); 

         Exemplo covariança
        List<? extends Number> list = intList;
        Number x = list.get(0);

        list.add(20);

        Exemplo contravariança - Não aceita o metodo get apesar de ser um objeto
        List<Object> myObjects = new ArrayList<>();

        myObjects.add("Maria");
        myObjects.add("Alex")

        List<? super Number> myNums = myObjects;
        myNums.add(0);
        myNums.add(3.14);

        Number x = myNums.get(0);</code>