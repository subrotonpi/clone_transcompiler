public static int solve ( ) {
  Scanner r = new Scanner ( System . in ) ;
  int T ;
  int ans ;
  int t ;
  s = r . nextInt ( ) ;
  StringBuilder stk = new StringBuilder ( ) ;
  ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char ch = s . charAt ( i ) ;
    if ( stk . length ( ) > 0 && ch == stk . charAt ( stk . length ( ) - 1 ) ) {
      stk . deleteCharAt ( stk . length ( ) - 1 ) ;
      ans += 10 ;
    }
    else {
      stk . append ( ch ) ;
    }
  }
  ans += 5 * stk . length ( ) / 2 ;
  return ans ;
}
