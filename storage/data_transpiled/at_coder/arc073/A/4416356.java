public static void main ( String input , int n , int T ) {
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) t [ i ] = Integer . parseInt ( input ) ;
  Arrays . sort ( t ) ;
  int time = t [ t . length - 1 ] ;
  for ( int a = 1 ;
  a <= n ;
  a ++ ) {
    if ( t [ a ] - t [ a - 1 ] > T ) {
      time -= ( t [ a ] - t [ a - 1 ] ) - T ;
    }
  }
  System . out . println ( time + T ) ;
}
