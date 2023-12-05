public static int N = Integer . parseInt ( input ) {
  int N = input . nextInt ( ) ;
  int T = 0 , A = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t >= T && a >= A ) {
      T = t ;
      A = a ;
    }
    else if ( T / t < A / a ) {
      if ( A % a == 0 ) {
        T = A / a * t ;
      }
      else {
        A = ( A / a + 1 ) * a ;
        T = T / a * t ;
      }
    }
  }
  return T + A ;
}
