public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] index = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    index [ a [ i ] ] = i ;
  }
  int [ ] l = new int [ n ] ;
  int [ ] r = new int [ n ] ;
  int ans = 0 ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    int m = index [ i ] ;
    ans += i * ( r [ m ] - m + 1 ) * ( m - l [ m ] + 1 ) ;
    if ( l [ m ] > 0 ) {
      r [ l [ m ] - 1 ] = r [ m ] ;
    }
    if ( r [ m ] < n - 1 ) {
      l [ r [ m ] + 1 ] = l [ m ] ;
    }
  }
  System . out . println ( ans ) ;
}
