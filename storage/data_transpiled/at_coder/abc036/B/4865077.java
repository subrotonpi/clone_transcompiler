public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Collections . singletonList ( input ) ) ;
  }
  int [ ] [ ] ans = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      ans [ j ] [ N - i - 1 ] = L . get ( i ) . get ( j ) ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( Arrays . toString ( ans [ i ] ) ) ;
  }
}
