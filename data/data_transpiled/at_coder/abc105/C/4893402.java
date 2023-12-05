static final int input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  if ( N == 0 ) {
    System . out . println ( "0" ) ;
    System . exit ( 0 ) ;
  }
  String ans = "" ;
  while ( N != 0 ) {
    if ( N % 2 == 1 ) {
      ans = "1" + ans ;
      if ( N > 0 ) N = N / 2 * ( - 1 ) ;
      else N = N / - 2 + 1 ;
    }
    else {
      ans = "0" + ans ;
      N /= - 2 ;
    }
  }
  System . out . println ( ans ) ;
  return N ;
}
