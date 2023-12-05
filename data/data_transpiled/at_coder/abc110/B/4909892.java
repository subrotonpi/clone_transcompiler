public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  Arrays . sort ( x ) ;
  Arrays . sort ( y ) ;
  int [ ] z = new int [ M ] ;
  if ( X < Y ) {
    for ( int i = X + 1 ;
    i <= Y ;
    i ++ ) z [ i ] = i ;
    for ( int Z : z ) {
      if ( x [ N - 1 ] < Z && y [ 0 ] <= Z ) {
        System . out . println ( "No War" ) ;
        exit ( ) ;
      }
    }
    System . out . println ( "War" ) ;
  }
  else {
    System . out . println ( "War" ) ;
  }
}
