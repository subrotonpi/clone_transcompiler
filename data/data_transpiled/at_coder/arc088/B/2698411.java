public static int [ ] S ( String input ) {
  int n = S . length ;
  if ( new HashSet < > ( ) . size ( ) == 1 ) {
    System . out . println ( S . length ( ) ) ;
  }
  else {
    int ans = 1000000 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( S . charAt ( i ) != S . charAt ( i + 1 ) ) {
        int m = Math . max ( n - i - 1 , i + 1 ) ;
        if ( m < ans ) {
          ans = m ;
        }
      }
    }
    System . out . println ( ans ) ;
  }
  return S ;
}
