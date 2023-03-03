public static int gcd ( int a , int b ) {
  if ( b == 0 ) {
    return a ;
  }
  return gcd ( b , a % b ) ;
}
{
  int [ ] inpl = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inpl [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < Integer , Integer > H = new LinkedHashMap < Integer , Integer > ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dot = new int [ N ] ;
  int mod = 998244353 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = inpl [ i ] ;
    int y = inpl [ i ] ;
    dot [ i ] = new Integer ( x ) ;
    dot [ i ] = new Integer ( y ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      int x1 = dot [ i ] ;
      int y1 = dot [ j ] ;
      int x2 = dot [ i ] ;
      int y2 = dot [ j ] ;
      int A = y1 - y2 ;
      int B = x2 - x1 ;
      int C = y1 * x2 - x1 * y2 ;
      if ( A < 0 ) {
        A *= - 1 ;
        B *= - 1 ;
        C *= - 1 ;
      }
      int gcdabc = gcd ( gcd ( A , B ) , C ) ;
      H . put ( A , B , C ) ;
    }
  }
  int ans = ( 2 * N - N - 1 ) % mod ;
  for ( int i : H . values ( ) ) {
    int j = ( int ) ( ( 1 + ( 1 + 8 * j ) * ( 1 / 2 ) ) / 2 ) ;
    ans -= ( 2 * j - i - 1 ) % mod ;
  }
  System . out . println ( ans % mod ) ;
  return ans ;
}
