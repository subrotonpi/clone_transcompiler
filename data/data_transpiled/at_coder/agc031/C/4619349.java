static final boolean DBG = ! true ;
final boolean DBG2 = ! true ;
int n = Integer . parseInt ( input . readLine ( ) ) ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
int b = Integer . parseInt ( input . readLine ( ) ) ;
int MAXM = 18 ;
int [ ] r = new int [ MAXM ] ;
int [ ] s = new int [ MAXM ] ;
r [ 0 ] = new int [ MAXM ] ;
r [ 1 ] = new int [ MAXM ] ;
s [ 1 ] = new int [ MAXM ] ;
s [ 2 ] = new int [ MAXM ] ;
int [ ] p1a = new int [ MAXM ] ;
p1a [ 0 ] = 0 ;
p1a [ 1 ] = 1 ;
p1a [ 2 ] = 2 ;
p2a [ 3 ] = 1 ;
p1a [ 4 ] = 0 ;
p1a [ 5 ] = 2 ;
p2a [ 4 ] = 0 ;
p1a [ 5 ] = 1 ;
p2a [ 6 ] = 2 ;
int w ;
int i ;
int j ;
int xpos ;
int ypos ;
int t ;
for ( i = 0 ;
i < 2 * sz ;
i ++ ) {
  hi = ( s [ sz ] [ i ] << ( n - sz ) ) ;
  lo = i % 2 == 0 ? r [ n - sz ] [ j ] : r [ n - sz ] [ 2 * ( n - sz ) - 1 - j ] ;
  z = hi + lo ;
  sw = swiz ( n , z , d ) ;
  if ( DBG ) System . out . println ( "i " + j + " hi " + lo + " z " + z + " " + sw ) ;
  System . out . print ( " " ) ;
}
System . out . println ( "" ) ;
for ( i = 0 ;
i < n ;
i ++ ) {
  int i = i ;
  if ( DBG2 ) System . out . println ( "sw lp i " + i + " xp " + ( xpos >>> 1 ) + " yp " + ( ypos >>> 1 ) + " t " + t ) ;
  if ( i == 0 ) {
    t = ( ( z >>> 1 ) & 1 ) << i ;
    xpos ++ ;
  }
  else {
    t = ( ( z >>> 1 ) & 1