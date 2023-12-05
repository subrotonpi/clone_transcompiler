public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  /* Solution to the number of numbers */
  int answer = 1 ;
  for ( int i = 1 ;
  i <= ( int ) ( M * 0.5 ) ;
  i ++ ) {
    if ( M % i == 0 ) {
      if ( M / i >= N ) answer = Math . max ( answer , i ) ;
      if ( i >= N ) answer = Math . max ( answer , M / i ) ;
    }
  }
  return answer ;
}
