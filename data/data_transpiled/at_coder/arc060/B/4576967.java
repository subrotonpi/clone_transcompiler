public static int f ( int _b , int _n ) {
  int ret = 0 ;
  while ( _n > 0 ) {
    ret += _n % _b ;
    _n = _n / _b ;
  }
  return ret ;
}
final int INF = 10 * 12 ;
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int s = Integer . parseInt ( input . nextLine ( ) ) ;
int ans = INF ;
if ( n >= s ) {
  int maxDigits = Integer . numberOfLeadingZeros ( Integer . numberOfTrailingZeros ( n ) ) - 2 ;
  for ( int k = maxDigits ;
  k >= 2 ;
  k -- ) {
    int minB = Math . max ( 2 , - ( ( int ) - ( n * ( 1 / k ) ) ) ) ;
    int maxB = ( int ) ( ( n - s + 1 ) * ( 1 / ( k - 1 ) ) ) ;
    for ( int b = minB ;
    b <= maxB ;
    b += 1 ) {
      if ( f ( b , n ) == s ) {
        ans = b ;
        break ;
      }
    }
    if ( ans != INF ) {
      for ( int a1 = 1 ;
      a1 <= s ;
      a1 ++ ) {
        if ( ( n - s ) < ( a1 - 1 ) * a1 ) break ;
        if ( ( n - s ) % a1 == 0 ) {
          break ;
        }
        if ( ( n - s ) < ans ) ans = b ;
      }
    }
  }
  if ( ans == INF ) ans = - 1 ;
  System . out . println ( ans ) ;
  return ans ;
}
