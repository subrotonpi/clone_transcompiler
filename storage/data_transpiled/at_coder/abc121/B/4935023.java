public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int [ ] [ ] l = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] [ i ] = Integer . parseInt ( input ) ;
  }
  int cnt = 0 ;
  int tot = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      tot += l [ i ] [ j ] * b [ j ] ;
    }
    tot = tot + c ;
    if ( ( tot > 0 ) && ( tot > 0 ) ) {
      cnt ++ ;
    }
    tot = 0 ;
  }
  System . out . println ( cnt ) ;
}
