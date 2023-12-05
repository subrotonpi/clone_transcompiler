public static void input ( Scanner s ) {
  int n = s . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = s . nextInt ( ) ;
  }
  int ans = 1000 ;
  for ( int x : a ) {
    int t = 0 ;
    int l = 0 ;
    int r = 0 ;
    while ( l < n ) {
      while ( r < n && s . charAt ( r ) != x ) {
        r ++ ;
      }
      t = Math . max ( t , r - l ) ;
      l = r + 1 ;
      r = l ;
    }
    ans = Math . min ( ans , t ) ;
  }
  System . out . println ( ans ) ;
}
