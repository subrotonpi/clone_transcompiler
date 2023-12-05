public static int N = Integer . parseInt ( input ) {
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    S [ i ] = input . nextInt ( ) ;
  }
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < Integer , Integer > map = new LinkedHashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    map . put ( S [ i ] , i ) ;
  }
  for ( Integer i : map . keySet ( ) ) {
    if ( map . get ( i ) == Math . max ( map . values ( ) ) ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
  return 0 ;
}
