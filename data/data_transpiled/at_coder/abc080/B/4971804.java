public static int N = Integer . parseInt ( input ) {
  int Nsum = 0 ;
  int n = N ;
  while ( n > 0 ) {
    int y = n % 10 ;
    Nsum += y ;
    n = n / 10 ;
  }
  if ( N % Nsum == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return Nsum ;
}
