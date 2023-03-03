@ VisibleForTesting static int [ ] [ ] map ( Scanner input ) {
  int H = input . nextInt ( ) ;
  int W = input . nextInt ( ) ;
  int N = input . nextInt ( ) ;
  Map < Point , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    a = a - 1 ;
    b = b - 1 ;
    for ( int i = Math . max ( 0 , a - 2 ) ;
    i <= Math . min ( H - 3 , a ) ;
    i ++ ) {
      for ( int j = Math . max ( 0 , b - 2 ) ;
      j <= Math . min ( W - 3 , b ) ;
      j ++ ) {
        map . put ( new Point ( i , j ) , map . getOrDefault ( new Point ( i , j ) , 0 ) + 1 ) ;
      }
    }
  }
  Map < Point , Integer > nums = new HashMap < > ( map . values ( ) ) ;
  System . out . println ( ( H - 2 ) * ( W - 2 ) - Integer . valueOf ( nums . values ( ) . size ( ) ) ) ;
  for ( int i = 1 ;
  i < 10 ;
  i ++ ) {
    if ( nums . containsKey ( i ) ) {
      System . out . println ( nums . get ( i ) ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return nums . values ( ) . toArray ( new Integer [ 0 ] [ ] ) ;
}
