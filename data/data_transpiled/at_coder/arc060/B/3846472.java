public static int sumDigit ( int b , int n ) {
  if ( n < b ) {
    return n ;
  }
  return sumDigit ( b , n / b ) + n % b ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int S = Integer . parseInt ( input . nextLine ( ) ) ;
if ( S > N ) {
  System . out . println ( - 1 ) ;
}
else if ( S == N ) {
  System . out . println ( N + 1 ) ;
}
else {
  int sqrt = ( int ) Math . pow ( N , 0.5 ) ;
  for ( b = 2 ;
  b <= sqrt ;
  b ++ ) {
    if ( sumDigit ( b , N ) == S ) {
      System . out . println ( b ) ;
      quit ( ) ;
    }
  }
  for ( int k = 1 ;
  k <= sqrt ;
  k ++ ) {
    if ( ( N - S ) % k == 0 ) {
      b = ( N - S ) / k + 1 ;
      if ( sumDigit ( b , N ) == S ) {
        System . out . println ( b ) ;
        quit ( ) ;
      }
    }
  }
  System . out . println ( - 1 ) ;
}
