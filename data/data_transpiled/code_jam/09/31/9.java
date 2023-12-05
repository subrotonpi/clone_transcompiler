public static long solve ( String message ) {
  long time = 0 ;
  int base = Math . max ( 2 , new HashSet < String > ( message ) . size ( ) ) ;
  IntStream digits = new IntStream ( ) ;
  digits . limit ( base ) . forEach ( i -> {
    System . out . println ( i ) ;
  }
  ) ;
  digits . forEach ( i -> {
    System . out . println ( i ) ;
  }
  ) ;
  Map < String , Integer > symbols = new HashMap < > ( ) ;
  symbols . put ( message . charAt ( 0 ) , 1 ) ;
  for ( String symbol : message . toCharArray ( ) ) {
    time *= base ;
    if ( ! symbols . containsKey ( symbol ) ) {
      symbols . put ( symbol , digits . pop ( ) ) ;
    }
    time += symbols . get ( symbol ) ;
  }
  return time ;
}
