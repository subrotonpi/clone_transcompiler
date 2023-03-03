private static final String FILE_NAME_BASE = "C-large" ;
final int NUM_PROCESSES = 4 ;
final double MEM_LIMIT_GB = 1.5 ;
final int RECURSION_LIMIT = 1000 ;
final Scanner in = new Scanner ( System . in ) ;
final int maxSame = in . nextInt ( ) ;
final int numOld = in . nextInt ( ) ;
final int maxValue = in . nextInt ( ) ;
final int [ ] oldCoins = copyOf ( Ints . parseInt ( in . nextLine ( ) ) ) ;
assert oldCoins . length == numOld ;
return oldCoins ;
}
