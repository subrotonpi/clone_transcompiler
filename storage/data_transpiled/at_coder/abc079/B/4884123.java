public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] l = new int [ 87 ] ;
  l [ 0 ] = 2 ;
  l [ 1 ] = 1 ;
  for ( int i = 2 ;
  i < 87 ;
  i ++ ) {
    l [ i ] = l [ i - 1 ] + l [ i - 2 ] ;
  }
  System . out . println ( l [ n ] ) ;
}
