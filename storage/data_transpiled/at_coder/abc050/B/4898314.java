public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) t [ i ] = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int s = Integer . parseInt ( t [ i ] ) ;
    int p = Integer . parseInt ( input ) ;
    int x = Integer . parseInt ( input ) ;
    System . out . println ( s - t [ p - 1 ] + x ) ;
  }
}
