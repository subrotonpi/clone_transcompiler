public static void input ( ) {
  int N = Integer . parseInt ( input ) ;
  String S1 = input . substring ( 0 , 1 ) ;
  String S2 = input . substring ( 0 , 1 ) ;
  int MOD = 10 * 9 + 7 ;
  StringBuilder sb = new StringBuilder ( ) ;
  int ans ;
  int i ;
  boolean before ;
  if ( N > 1 && S1 . charAt ( 0 ) == S1 . charAt ( 1 ) ) {
    ans = 6 ;
    i = 2 ;
    before = 0 ;
  }
  else {
    ans = 3 ;
    i = 1 ;
    before = 1 ;
  }
  while ( ( i = sb . indexOf ( S2 , i ) ) != - 1 ) {
    if ( i < N - 1 && S1 . charAt ( i ) == S1 . charAt ( i + 1 ) ) {
      ans *= before ? 2 : 3 ;
      i += 2 ;
      before = 0 ;
    }
    else {
      ans *= before ? 2 : 1 ;
      i += 1 ;
      before = 1 ;
    }
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
}
