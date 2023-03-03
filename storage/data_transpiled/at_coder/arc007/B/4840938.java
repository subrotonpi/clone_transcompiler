public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    a [ i ] = i ;
  }
  int d = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    if ( c != d ) {
      a [ a . length - 1 ] = d ;
      d = c ;
    }
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
}
