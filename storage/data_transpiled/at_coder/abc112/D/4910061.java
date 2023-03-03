public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int total = m / n ;
  int answer = 1 ;
  for ( int i = 1 ;
  i <= total ;
  i ++ ) {
    if ( i * i > m ) {
      break ;
    }
    if ( m % i == 0 ) {
      answer = Math . max ( i , answer ) ;
      if ( i >= n ) {
        answer = Math . max ( m / i , answer ) ;
      }
    }
  }
  System . out . println ( answer ) ;
}
