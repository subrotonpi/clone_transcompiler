public static long getInverseElement ( @ IntRange ( from = 0 , to = 10 * * 9 + 7 ) long input , int mod ) {
  long ans = 1 ;
  for ( int i = Integer . numberOfTrailingZeros ( input ) - 2 ;
  i >= 1 ;
  i -- ) {
    if ( input . charAt ( i ) == '1' ) {
      ans = ans * input % mod ;
    }
    input = input * input % mod ;
  }
  return ans ;
  if ( Class . isEnum ( ) ) {
    int N = Integer . parseInt ( input . toString ( ) ) ;
    int K = Integer . parseInt ( input . toString ( ) ) ;
    mod = 1777777777 ;
    long n1 = 1 , n2 = 1 ;
    for ( int i = N ;
    i > N - K ;
    i -- ) {
      n1 = n1 * input % mod ;
    }
    for ( int i = K ;
    i > 1 ;
    i -- ) {
      n2 = n2 * input % mod ;
    }
    n1 = n1 * getInverseElement ( n2 , mod ) % mod ;
    long m1 = 1 , m2 = 0 ;
    for ( int i = 3 ;
    i <= K ;
    i ++ ) {
      m1 = ( i - 1 ) * ( m1 + m2 ) % mod ;
      m2 = m1 ;
    }
    System . out . println ( n1 * m1 % mod ) ;
  }
  return ans ;
}
