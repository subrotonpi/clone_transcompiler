static int n ( int a , int b , int ... s ) {
  int n = Integer . parseInt ( ( input . nextLine ( ) + " " + input . nextLine ( ) ) ) ;
  int c = s . length ;
  c ( ) ;
  int d = s [ s . length - 1 ] , m = 10 * 9 + 7 ;
  if ( ~ - a > 0 ) {
    while ( ( s [ 0 ] < d ) * b ) s [ 0 ] *= a ;
    b -- ;
  }
  for ( int x : s ) System . out . println ( x * pow ( a , b / n , m ) % m ) ;
  return c ;
}
