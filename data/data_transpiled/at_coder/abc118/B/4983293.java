public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > k_a = map . get ( input . nextLine ( ) ) ;
    A . add ( Collections . unmodifiableList ( k_a ) ) ;
  }
  int [ ] LIKE = new int [ M + 1 ] ;
  for ( int i = 0 ;
  i < LIKE . length ;
  i ++ ) {
    LIKE [ i ] = 0 ;
  }
  int ans = 0 ;
  for ( int x : LIKE ) {
    if ( x == N ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
