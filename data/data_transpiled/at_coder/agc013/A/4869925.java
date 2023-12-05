public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int [ ] d = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    d [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    d [ i ] = a [ i + 1 ] - a [ i ] ;
  }
  int cnt = 1 ;
  int l = 0 ;
  int r = 0 ;
  int cur = 0 ;
  while ( l < n - 1 ) {
    while ( r < n - 1 && cur * d [ r ] >= 0 ) {
      if ( cur == 0 ) cur = d [ r ] ;
      r ++ ;
    }
    if ( r < n - 1 && cur * d [ r ] < 0 ) cnt ++ ;
    r ++ ;
    l = r ;
    cur = 0 ;
  }
  System . out . println ( cnt ) ;
}
