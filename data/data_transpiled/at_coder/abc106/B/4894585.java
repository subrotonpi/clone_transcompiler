public static int getFactors ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  /*Set<Integer> f = new HashSet<>();*/
  for ( int i = 1 ;
  i <= ( int ) ( ( n * 0.5 ) ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      f . add ( i ) ;
    }
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( getFactors ( i ) == 8 && i % 2 == 1 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
