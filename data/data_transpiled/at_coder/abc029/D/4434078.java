public static int input ( ) {
  int n = input . nextInt ( ) ;
  int cop = n ;
  while ( cop > 10 ) {
    cop /= 10 ;
  }
  int topdigit = cop ;
  int ans = 0 ;
  int denom = 1 ;
  while ( n / denom > 0 ) {
    if ( ( n / denom ) % 10 == 0 ) {
      ans += ( n / ( 10 * denom ) ) * denom ;
    }
    else if ( ( n / denom ) % 10 == 1 ) {
      ans += ( n / ( 10 * denom ) ) * denom + n % denom + 1 ;
    }
    else {
      ans += ( n / ( 10 * denom ) + 1 ) * denom ;
    }
    denom *= 10 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
