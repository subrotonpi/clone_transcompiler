public static int gcd ( int x , int y ) {
  if ( ( x < y ) || ( y < x ) ) x = y ;
  if ( ( y == 0 ) || ( x == 0 ) ) return x ;
  return gcd ( y , x % y ) ;
}
