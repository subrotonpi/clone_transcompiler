public static int N = Integer . parseInt ( input ) {
  int sum = 0 ;
  int tmp = N ;
  while ( tmp > 0 ) {
    sum += tmp % 10 ;
    tmp = tmp / 10 ;
  }
  if ( N % sum == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return sum ;
}
