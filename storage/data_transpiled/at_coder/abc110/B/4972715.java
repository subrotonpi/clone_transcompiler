public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  String x = input . substring ( 0 , N ) ;
  int [ ] xls = new int [ N ] ;
  for ( int n = 0 ;
  n <= N ;
  n ++ ) {
    xls [ n ] = Integer . parseInt ( x . substring ( n , n + 1 ) ) ;
  }
  String y = input . substring ( 0 , M ) ;
  int [ ] yls = new int [ M ] ;
  for ( int n = 0 ;
  n <= M ;
  n ++ ) {
    yls [ n ] = Integer . parseInt ( y . substring ( n , n + 1 ) ) ;
  }
  Arrays . sort ( xls ) ;
  Arrays . sort ( yls ) ;
  if ( xls [ xls . length - 1 ] >= yls [ 0 ] ) {
    System . out . println ( "War" ) ;
  }
  else if ( yls [ 0 ] <= X ) {
    System . out . println ( "War" ) ;
  }
  else if ( xls [ xls . length - 1 ] >= Y ) {
    System . out . println ( "War" ) ;
  }
  else {
    System . out . println ( "No War" ) ;
  }
}
