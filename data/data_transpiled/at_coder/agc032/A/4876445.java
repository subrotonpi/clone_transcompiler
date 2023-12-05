public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int k = N - i ;
    for ( int j = 0 ;
    j < k ;
    j ++ ) {
      int l = k - j ;
      if ( b . get ( l - 1 ) == l ) {
        a . add ( l ) ;
        b . remove ( l - 1 ) ;
        break ;
      }
    }
    if ( b . size ( ) == k ) {
      break ;
    }
  }
  if ( b . size ( ) == 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( a . get ( i ) ) ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return a . toArray ( ) ;
}
