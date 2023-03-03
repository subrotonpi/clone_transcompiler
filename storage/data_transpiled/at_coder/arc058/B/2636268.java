public static int solve ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  long count = 0 ;
  int [ ] factorialArray = new int [ H + W ] ;
  for ( int i = 1 ;
  i <= H ;
  i ++ ) {
    factorialArray [ i ] = factorialArray [ i - 1 ] * i % mod ;
  }
  int [ ] inverseFactorialArray = new int [ H + W ] ;
  for ( int i = H + W - 1 ;
  i >= 0 ;
  i -- ) {
    inverseFactorialArray [ i ] = 0 ;
  }
  for ( int i = B ;
  i < W ;
  i ++ ) {
    count += ( ( factorialArray [ H - A + i - 1 ] * inverseFactorialArray [ H - A - 1 ] * inverseFactorialArray [ i ] ) % mod ) * ( ( factorialArray [ A + ( W - i ) - 2 ] * inverseFactorialArray [ A - 1 ] * inverseFactorialArray [ W - i - 1 ] ) % mod ) ;
  }
  System . out . println ( ( int ) ( count % mod ) ) ;
  return 0 ;
}
