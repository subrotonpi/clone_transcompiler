public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] s = eval ( input ) ;
  int [ ] [ ] a = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n - 2 ;
  i ++ ) {
    for ( int j = 1 ;
    j < m - 1 ;
    j ++ ) {
      a [ i + 1 ] [ j ] = s [ i ] [ j ] ;
      for ( int x = ( i + 1 ) , y = ( j - 1 ) ;
      x < ( i + 2 ) ;
      x ++ , y ++ ) {
        s [ x ] [ y ] -= s [ i ] [ j ] ;
      }
    }
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( ( i ) + " " ) ;
  }
}
