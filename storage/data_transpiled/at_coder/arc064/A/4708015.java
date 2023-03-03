public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int tot = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i - 1 ] + a [ i ] > k ) {
      int c = Math . min ( a [ i ] , a [ i ] + a [ i - 1 ] - k ) ;
      tot += c ;
      a [ i ] -= c ;
      if ( a [ i - 1 ] + a [ i ] > k ) {
        int d = a [ i - 1 ] - k ;
        tot += d ;
        a [ i - 1 ] -= d ;
      }
    }
  }
  System . out . println ( tot ) ;
}
