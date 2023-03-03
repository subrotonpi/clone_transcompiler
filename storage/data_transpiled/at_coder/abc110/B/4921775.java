public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int M = Integer . parseInt ( input [ 1 ] ) ;
  int X = Integer . parseInt ( input [ 2 ] ) ;
  int Y = Integer . parseInt ( input [ 3 ] ) ;
  int x = Integer . parseInt ( input [ 4 ] ) ;
  int y = Integer . parseInt ( input [ 5 ] ) ;
  boolean f ;
  if ( X < Y && max ( x ) < min ( y ) ) f = true ;
  else f = false ;
  if ( f ) System . out . println ( "No War" ) ;
  else System . out . println ( "War" ) ;
}
