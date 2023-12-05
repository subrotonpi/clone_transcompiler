static final int getLen ( ) {
  int mod = 10 * 9 + 7 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String S1 = input . nextLine ( ) ;
  String S2 = input . nextLine ( ) ;
  StringBuffer H = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S1 . charAt ( i ) == S2 . charAt ( i ) ) {
      H . append ( 't' ) ;
    }
    else {
      H . append ( 'Y' ) ;
    }
  }
  H . deleteCharAt ( H . length ( ) - 1 ) ;
  int K = H . length ( ) ;
  if ( K == 1 ) {
    System . out . println ( 3 * N ) ;
    System . exit ( 0 ) ;
  }
  int ans ;
  char prev = 'y' ;
  for ( int i = 1 ;
  i < H . length ( ) ;
  i ++ ) {
    if ( prev == 'y' ) {
      if ( H . charAt ( i ) == 'y' ) {
        ans = ans * 3 % mod ;
      }
    }
    else {
      ans = ans * 2 % mod ;
    }
    prev = H . charAt ( i ) ;
  }
  System . out . println ( ans % mod ) ;
  return N ;
}
