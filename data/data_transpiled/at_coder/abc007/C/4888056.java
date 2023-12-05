@ VisibleForTesting static boolean isIn ( int maxRow , int maxCol , int row , int col ) {
  if ( row >= 0 && row < maxRow && col >= 0 && col < maxCol ) {
    return true ;
  }
  else {
    return false ;
  }
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] start = new int [ r ] ;
  int [ ] goal = new int [ r ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    start [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] goal = new int [ r ] ;
  for ( int i = 0 ;
  i < goal . length ;
  i ++ ) {
    goal [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  System . out . println ( visit [ goal [ 0 ] ] [ goal [ 1 ] ] ) ;
  start [ 0 ] -- ;
  start [ 1 ] -- ;
  goal [ 0 ] -- ;
  goal [ 1 ] -- ;
  ArrayList < ArrayList < Integer >> maze = new ArrayList < > ( ) ;
  ArrayList < ArrayList < Integer >> visit = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    maze . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    maze . add ( new ArrayList < > ( ) ) ;
  }
  Queue < ArrayList < Integer >> qu = new ArrayDeque < > ( ) ;
  for ( int i = 0 ;
  i < start . length ;
  i ++ ) {
    maze . add ( new ArrayList < > ( ) ) ;
  }
  qu . add ( start [ 0 ] ) ;
  visit . get ( start [ 1 ] ) . add ( 0 ) ;
  while ( qu . size ( ) > 0 ) {
    ArrayList < Integer > now = qu . poll ( ) ;
    int [ ] right = new int [ ] {
      now . get ( 0 ) , now . get ( 1 ) + 1 }
      ;
      int [ ] left = new int [ ] {
        now . get ( 0 ) , now . get ( 1 ) - 1 }
        ;
        int [ ] up = new int [ ] {
          now . get ( 0 ) - 1 , now . get ( 1 ) }
          ;
          int [ ] down = new int [ ] {
            now . get ( 1 ) +