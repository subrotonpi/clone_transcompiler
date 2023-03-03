@ Function public static void f ( ) {
  map = Integer . parseInt ( input ( ) ) ;
  n = f . nextInt ( ) ;
  a = f . nextInt ( ) ;
  b = f . nextInt ( ) ;
  s = new LinkedList < Integer > ( ) ;
  c = s . sort ;
  c ( ) ;
  d = s . peek ( ) ;
  m = 10 * 9 + 7 ;
  if ( ~ - a ) {
    while ( ( s . peek ( ) < d ) * b ) s . peek ( ) ;
    b -- ;
  }
  for ( int x : s ) System . out . println ( x * pow ( a , b / n , m ) % m ) ;
}
