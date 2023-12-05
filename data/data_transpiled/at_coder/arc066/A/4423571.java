public static void inpl ( ) {
  return new LinkedList < Integer > ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = inpl ( ) ;
  Arrays . sort ( A ) ;
  int a ;
  if ( N % 2 == 1 ) {
    a = 1 ;
    if ( A [ 0 ] != 0 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
  }
  else {
    a = 0 ;
  }
  int ans = 1 ;
  for ( int j = a , i = N ;
  j < 2 ;
  j ++ ) {
    if ( A [ i ] == A [ i + 1 ] == 2 * ( j + 1 ) - ( a + 1 ) % 2 ) {
      ans *= 2 ;
    }
    else {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
  }
  System . out . println ( ans % ( 10 * 9 + 7 ) ) ;
}
