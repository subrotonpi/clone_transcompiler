static final int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  boolean poped = false ;
  while ( b . size ( ) > 0 ) {
    for ( int i = b . size ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      if ( i + 1 == b . get ( i ) ) {
        ans . add ( b . removeFirst ( i ) ) ;
        poped = true ;
        break ;
      }
    }
    else {
      System . out . println ( - 1 ) ;
      System . exit ( 0 ) ;
    }
  }
  for ( Integer a : new ArrayList < Integer > ( ans ) ) {
    System . out . println ( a ) ;
  }
  return ans . toArray ( new Integer [ 0 ] ) ;
}
