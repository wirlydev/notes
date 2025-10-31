## Equality in Java

- Shallow Equality > to the two items being compared point to the same place in memory, are they literally pointing to the same object
- Deep Equality > do the two items being compared have the same value, for example comparing two strings with content equal to each other


- ==
    - when comparing primitives compares values
    - when comparing objects does shallow comparison 
    - use when comparing int, double, boolean
- .equals()
    - every class inherits it from the Object class
    - when comparing objects compares logical equality
    - use when comparing String, Integer, ArrayList etc.
- java caches ints from -128 to 127 so....
    - Integer a = 100; Integer b = 100; a==b //returns true
    - BUUUUUUUTTTTTT...
    - Integer a = 200; Integer b = 200; a==b //returns false

- double 
    - a real number with a decimal point that can appear anywhere
    
