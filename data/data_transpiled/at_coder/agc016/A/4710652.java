static void input ( ) {
  s = list ( input ) ;
  int ans = 10 * 5 ;
  for ( int i : new HashSet < > ( Collections . singletonList ( s ) ) ) {
    List < Integer > q = s . subList ( 0 , s . size ( ) ) ;
    int cnte = 0 ;
    while ( new HashSet < > ( q ) . size ( ) > 1 ) {
      List < Integer > new = new ArrayList < > ( q . size ( ) - 1 ) ;
      for ( int j = 0 ;
      j < q . size ( ) - 1 ;
      j ++ ) {
        if ( q . get ( j ) == i || q . get ( j + 1 ) == i ) {
          new . add ( j ) ;
        }
        else {
          new . add ( j ) ;
        }
      }
      q = new ArrayList < > ( ) ;
      cnte ++ ;
    }
    if ( cnte < ans ) {
      ans = cnte ;
    }
  }
  System . out . println ( ans ) ;
}
