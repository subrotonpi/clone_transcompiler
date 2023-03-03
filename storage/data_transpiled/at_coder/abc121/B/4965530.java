public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int code = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      code += a [ i ] [ j ] * b [ j ] ;
    }
    if ( code + c > 0 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
