@ VisibleForTesting static void bisect ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) d [ i ] = Integer . parseInt ( input ( ) ) ;
  int [ ] a = new int [ n ] , d = new int [ n ] , mod = 10 * * 9 + 7 , ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = n - bisect ( d , d [ i ] * 2 - 1 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans = ( ans + bisect ( d , d [ i ] / 2 ) * a [ Math . min ( n - 1 , bisect ( d , i ) * 2 - 1 ) ] ) % mod ;
  System . out . println ( ans ) ;
}
