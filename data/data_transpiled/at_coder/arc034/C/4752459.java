@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > map ) {
  int [ ] d = new int [ map . size ( ) ] ;
  int mod = 10 * 9 + 7 ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = b + 1 ;
  i <= a ;
  i ++ ) {
    int x = i ;
    for ( int j = 2 ;
    j <= ( int ) ( x * .5 ) ;
    j ++ ) {
      while ( x % j == 0 ) {
        x /= j ;
        d [ j ] ++ ;
      }
    }
    if ( x > 1 ) {
      d [ x ] ++ ;
    }
  }
  long ans = 1 ;
  for ( int x : d ) {
    ans = ans * ( d [ x ] + 1 ) % mod ;
  }
  System . out . println ( ans ) ;
}
