public static void print ( int a ) {
  int [ ] x = Integer . parseInt ( input ( ) ) ;
  double s = sum ( x ) ;
  double inf = Double . parseDouble ( "INF" ) ;
  double m = inf ;
  double S = 0 ;
  for ( int i = 0 ;
  i < a - 1 ;
  i ++ ) {
    s -= x [ i ] ;
    S += x [ i ] ;
    m = Math . min ( m , Math . abs ( s - S ) ) ;
  }
  System . out . println ( m ) ;
}
