public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) p [ i ] = i ;
  int [ ] q = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) q [ p [ i ] - 1 ] = i ;
  int A = 0 ;
  int B = 10 * 9 + 1 ;
  int [ ] ans_a = new int [ N ] ;
  int [ ] ans_b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A += q [ i ] ;
    if ( i != 0 ) B -= q [ i - 1 ] ;
  }
  A = 0 ;
  B = 10 * 9 ;
  return ans_a ;
}
