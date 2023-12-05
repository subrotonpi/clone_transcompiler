public static void input ( ) {
  S = input ( ) ;
  K = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( ! S . charAt ( i ) . equals ( '1' ) ) {
      System . out . println ( S . charAt ( i ) ) ;
      exit ( ) ;
    }
  }
  System . out . println ( '1' ) ;
}
