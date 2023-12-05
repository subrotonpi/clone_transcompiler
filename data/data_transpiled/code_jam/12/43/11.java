static final double EPS = 1e-9 ;
int [ ] heights = new int [ N ] ;
final double EPS = 1e-9 ;
int end ;
for ( int i : xrange ( 0 , end + 1 ) ) heights [ i ] += amount ;
/* extend end */
for ( int i : xrange ( start , end ) ) {
  heights [ i ] += heights [ i ] ;
}
/* more */
int more = ( int ) Math . floor ( end + 1 + EPS ) ;
/* extrapolate start */
for ( int i : xrange ( start , end ) ) {
  if ( high [ i ] > end ) {
    impossible = true ;
    return more ;
  }
}
/* solve end */
int more = ( int ) Math . floor ( end + 1 + EPS ) ;
for ( int i : xrange ( end , start ) ) {
  if ( high [ i ] > end ) {
    impossible = true ;
    return more ;
  }
}
if ( start + 1 >= end ) return more ;
List < Integer > peaks = new ArrayList < Integer > ( ) ;
peaks . add ( start ) ;
int x = start ;
while ( x < end ) {
  x = high [ x ] ;
  peaks . add ( x ) ;
}
assert ( x == end ) ;
int P = peaks . size ( ) ;
double slope = 0 ;
for ( int i : xrange ( P - 1 ) ) {
  /* solve end */
  int a = peaks . get ( i ) ;
  int b = peaks . get ( i + 1 ) ;
  int aHeight = more ;
  for ( int j : xrange ( a + 1 , b ) ) aHeight = Math . max ( aHeight , extrapolate ( b , j , a , heights [ b ] , heights [ j ] ) ) ;
  /* extend a = aHeight - heights[a] = 0 */
  for ( int j : xrange ( b - a , b ) ) {
    /* extend b = high[j] - heights[j] = 0 */
    heights [ j ] = 0 ;
  }
}
/* solve end */
for ( int i : xrange ( 1 , Integer . parseInt ( readLine ( ) ) ) ) {
  /* solve end */
  int N = Integer . parseInt ( readLine ( ) ) ;
  high = ArrayUtil . toIntArray ( high ) ;
  heights = new int [ N ] ;
  