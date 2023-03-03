public static void input ( ) {
  X = list ( input ) ;
  int S_count = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < X . length ( ) ;
  i ++ ) {
    if ( X . charAt ( i ) == 'S' ) S_count ++ ;
    else {
      if ( S_count > 0 ) {
        ans += 2 ;
        S_count -- ;
      }
    }
  }
  System . out . println ( X . length ( ) - ans ) ;
}
