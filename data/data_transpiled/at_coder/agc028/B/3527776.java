public static long congruence ( long x , long y ) {
  if ( x < y ) {
    final long a = congruence ( y , x ) ;
    return ( b == 0 ? 0 : a ) ;
  }
  long z = x % y ;
  if ( z == 0 ) {
    return ( 0 ) ;
  }
  final long c = congruence ( y , z ) ;
  final long d = congruence ( y , z ) ;
  return ( d == 0 ? 0 : ( c - ( int ) ( x / y ) * d ) % 1000000007 ) ;
}
final long [ ] inverseSum = new long [ 100001 ] ;
for ( int i = 2 ;
i < 100001 ;
i ++ ) {
  inverseSum [ i ] = ( inverseSum [ i - 1 ] + congruence ( 1000000007 , i ) [ 1 ] ) % 1000000007 ;
}
int N = Integer . parseInt ( input ( ) ) ;
final long [ ] A = Lists . newArrayList ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input ( ) ) ;
}
long N_factorial = 1 ;
long ans = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  ans = ( ans + ( inverseSum [ i + 1 ] + inverseSum [ N - i ] - 1 ) * A [ i ] * N_factorial ) % 1000000007 ;
}
System . out . println ( ans ) ;
return ans ;
}
