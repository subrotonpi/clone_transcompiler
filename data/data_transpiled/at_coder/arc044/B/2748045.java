public static long powMod ( long a , long b , long P ) {
  if ( b == 0 ) return 1 ;
  Stack < Long > stk = new Stack < > ( ) ;
  while ( b > 1 ) {
    stk . push ( b % 2 ) ;
    b /= 2 ;
  }
  long c = a % P ;
  while ( stk . size ( ) > 0 ) {
    long t = stk . pop ( ) ;
    c = ( c * c ) % P ;
    if ( t == 1 ) {
      c = ( c * a ) % P ;
    }
  }
  return c ;
}
int N = Integer . parseInt ( input ( ) ) ;
int [ ] A = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input ( ) ) ;
}
final long P = 10 * 9 + 7 ;
/* count */
long [ ] S = new long [ Math . max ( A . length + 1 , N ) ] ;
for ( int a = 0 ;
a < A . length ;
a ++ ) {
  S [ a ] ++ ;
}
if ( A [ 0 ] != 0 || S [ 0 ] != 1 ) return 0 ;
long cnt = 1 ;
for ( int i = 1 ;
i < S . length ;
i ++ ) {
  if ( S [ i ] == 0 ) return 0 ;
  long path1 = powMod ( ( powMod ( 2 , S [ i - 1 ] , P ) - 1 ) % P , S [ i ] , P ) ;
  long path2 = powMod ( 2 , S [ i ] * ( S [ i ] - 1 ) / 2 , P ) % P ;
  cnt = cnt * path1 * path2 % P ;
}
return cnt ;
}
