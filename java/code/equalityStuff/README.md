## Equality in Java

- ==
    - when comparing primitives compares values
    - when comparing objects it compares memory address, shallow equality 
    - use when comparing int, double, boolean
- .equals()
    - when comparing objects compares logical equality
    - use when comparing String, Integer, ArrayList etc.
- java caches ints from -128 to 127 so....
    - Integer a = 100; Integer b = 100; a==b //returns true
    - BUUUUUUUTTTTTT...
    - Integer a = 200; Integer b = 200; a==b //returns false


