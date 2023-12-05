public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int s = 0 ;
  for ( int i = 1 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i == 0 ) s += i + n / i ;
  }
  if ( ( n * 0.5 ) . isInteger ( ) ) s -= ( int ) ( n * 0.5 ) ;
  if ( s > n * 2 ) System . out . println ( "Abundant" ) ;
  else if ( s < n * 2 ) System . out . println ( "Deficient" ) ;
  else System . out . println ( "Perfect" ) ;
}
