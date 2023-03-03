public static LinkedList < Integer > inpl ( ) {
  return Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  StringBuilder B = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    B . append ( "." ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String L = input . nextLine ( ) ;
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      B . append ( L . charAt ( j ) ) ;
    }
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < 9 ;
  j ++ ) {
    ans += B . toString ( ) . indexOf ( "x" ) + B . toString ( ) . indexOf ( ".o" ) + B . toString ( ) . indexOf ( "xo" ) ;
  }
  System . out . println ( ans ) ;
  return B ;
}
