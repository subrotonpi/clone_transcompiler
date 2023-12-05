static final int [ ] [ ] getMatchingValues ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( new LinkedList < > ( ) ) ;
  }
  Collections . sort ( l ) ;
  int ans = 0 ;
  int tot = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < l . get ( i ) . size ( ) ;
    j ++ ) {
      ans ++ ;
      tot += l . get ( i ) . get ( j ) ;
      if ( ( m <= ans ) && ( m <= ans ) ) {
        System . out . println ( tot ) ;
        System . exit ( 0 ) ;
      }
    }
  }
  return l . toArray ( new List [ 0 ] [ ] ) ;
}
