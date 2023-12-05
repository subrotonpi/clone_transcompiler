public static void input ( ) {
  int N = S . length ( ) ;
  int ans = N ;
  Stack < Character > stack = new Stack < > ( ) ;
  stack . push ( S . charAt ( 0 ) ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( stack . size ( ) != 0 && stack . peek ( ) == 'S' && S . charAt ( i ) == 'T' ) {
      ans -= 2 ;
      stack . pop ( ) ;
    }
    else if ( S . charAt ( i ) == 'S' ) {
      stack . push ( S . charAt ( i ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
