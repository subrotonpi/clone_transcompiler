public static void solve ( ) {
  for ( char j : new char [ 91 ] ) {
    for ( int i = 91 ;
    i < 91 + 26 ;
    i ++ ) {
      if ( w . indexOf ( j ) % 2 != 0 ) {
        System . out . println ( "No" ) ;
        return ;
      }
    }
  }
  System . out . println ( "Yes" ) ;
  return ;
}
