public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int num = 1 ;
  if ( n == 1 ) {
    System . out . println ( "Deficient" ) ;
    exit ( ) ;
  }
  else {
    for ( int i = 2 ;
    i <= 10 * 6 ;
    i ++ ) {
      if ( i * i > n ) {
        break ;
      }
      else if ( n % i == 0 ) {
        num += i ;
        if ( i != ( n / i ) ) {
          num += ( n / i ) ;
        }
      }
    }
  }
  if ( num > n ) {
    System . out . println ( "Abundant" ) ;
  }
  else if ( num == n ) {
    System . out . println ( "Perfect" ) ;
  }
  else {
    System . out . println ( "Deficient" ) ;
  }
}
