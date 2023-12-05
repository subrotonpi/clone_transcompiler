public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input ) ;
  }
  int s = Arrays . stream ( t ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  int m = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    System . out . println ( s - t [ a - 1 ] + b ) ;
  }
}
