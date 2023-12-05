static final int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  b . add ( N ) ;
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  while ( b . size ( ) > 0 ) {
    boolean poped = false ;
    for ( int i = b . size ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      if ( i + 1 == b . get ( i ) ) {
        ans . add ( b . remove ( i ) ) ;
        poped = true ;
        break ;
      }
    }
    if ( ! poped ) {
      System . out . println ( - 1 ) ;
      System . exit ( 0 ) ;
    }
  }
  Collections . reverse ( ans ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans . toArray ( new Integer [ 0 ] ) ;
}
