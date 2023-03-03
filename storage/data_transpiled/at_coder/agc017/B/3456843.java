public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int dMin = - D * i + C * ( N - 1 - i ) ;
    int dMax = - C * i + D * ( N - 1 - i ) ;
    if ( A + dMin <= B && B <= A + dMax ) {
      System . out . println ( "YES" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return N ;
}
