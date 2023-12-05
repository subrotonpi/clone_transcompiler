public static int N ( ) {
  int digit = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int i = 1 ;
  i <= digit ;
  i ++ ) {
    count += ( N + 1 ) / ( 10 * i ) * ( 10 * ( i - 1 ) ) ;
    int rest = ( N + 1 ) % ( 10 * i ) ;
    if ( 10 * i < rest ) count += Math . min ( 10 * i , rest - 10 * i ) ;
  }
  return count ;
}
