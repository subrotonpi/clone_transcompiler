public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > B = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . nextLine ( ) ;
  i ++ ) {
    B . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  LinkedList < Integer > ans = new LinkedList < Integer > ( ) ;
  while ( B . size ( ) > 0 ) {
    for ( int i = B . size ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      int b = B . get ( i ) ;
      if ( i + 1 == b ) {
        ans . add ( i + 1 ) ;
        break ;
      }
    }
    else {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    B . remove ( i ) ;
  }
  for ( int idx = 0 ;
  idx <= N ;
  idx ++ ) {
    int tmp = ans . removeFirst ( ans . removeLast ( ) ) ;
    System . out . println ( tmp ) ;
  }
  return ans . toArray ( new Integer [ N ] ) ;
}
