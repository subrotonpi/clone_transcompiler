public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int M = Integer . parseInt ( input [ 1 ] ) ;
  int X = Integer . parseInt ( input [ 2 ] ) ;
  int Y = Integer . parseInt ( input [ 3 ] ) ;
  int x = Integer . parseInt ( input [ 4 ] ) ;
  int y = Integer . parseInt ( input [ 5 ] ) ;
  int x_max = Integer . parseInt ( input [ 6 ] ) ;
  int y_min = Integer . parseInt ( input [ 7 ] ) ;
  if ( x_max >= y_min || x_max >= Y || y_min <= X ) {
    System . out . println ( "War" ) ;
  }
  else {
    System . out . println ( "No War" ) ;
  }
}
