@ VisibleForTesting static void solve ( ) {
  final String S = input ( ) ;
  String prev2 = "" ;
  String prev = S . substring ( 0 , 1 ) ;
  for ( int i = 1 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == prev ) {
      return ;
    }
    else if ( S . charAt ( i ) == prev2 ) {
      return ;
    }
  }
}
