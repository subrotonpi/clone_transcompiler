public static void enter ( int n ) {
  int cnt = 0 ;
  int ch = 0 ;
  char [ ] * w , i ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    for ( j = 0 ;
    j < i ;
    j ++ ) {
      switch ( w [ j ] ) {
        case 'I' : cnt ++ ;
        break ;
        case 'D' : cnt -- ;
        break ;
      }
      if ( cnt > ch ) {
        ch = cnt ;
      }
    }
  }
  System . out . println ( ch ) ;
}
