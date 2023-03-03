static final void print ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  String S = input . next ( ) ;
  int ans = 0 ;
  int N = S . substring ( 0 , S . length ( ) - 1 ) . length ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( S . charAt ( i - 1 ) == 'U' ) {
      ans += N - i + 2 * ( i - 1 ) ;
    }
    else {
      ans += 2 * ( N - i ) + i - 1 ;
    }
  }
  System . out . println ( ans ) ;
}
