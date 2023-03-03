@ Function public static void main ( String [ ] args ) {
  map ( Integer . parseInt ( input [ 0 ] ) ) ;
  int a = map ( Integer . parseInt ( input [ 1 ] ) ) ;
  int b = map ( Integer . parseInt ( input [ 2 ] ) ) ;
  int c = map ( Integer . parseInt ( input [ 3 ] ) ) ;
  int k = map ( Integer . parseInt ( input [ 4 ] ) ) ;
  int s = map ( Integer . parseInt ( input [ 5 ] ) ) ;
  int t = map ( Integer . parseInt ( input [ 6 ] ) ) ;
  int p = a * s + b * t ;
  if ( ( s + t ) >= k ) {
    p -= ( s + t ) * c ;
  }
  System . out . println ( p ) ;
}
