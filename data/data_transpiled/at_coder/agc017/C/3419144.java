@ VisibleForTesting static int [ ] [ ] createCoveringPairs ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ M ] ;
  List < Integer > src = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    src . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Counter < Integer > ctr = new ClassicCounter < > ( A ) ;
  int [ ] cover = new int [ 2 * N + 1 ] ;
  for ( Map . Entry < Integer , Integer > e : ctr . entrySet ( ) ) {
    for ( int i = e . getKey ( ) ;
    i >= e . getValue ( ) ;
    i -- ) cover [ i + N ] ++ ;
  }
  int ans = cover . length > N + 1 ? 0 : cover [ N ] ;
  for ( int x = 0 ;
  x < src . length ;
  x ++ ) {
    int y = src . get ( x ) ;
    ctr . setCount ( A [ x - 1 ] -- ) ;
    int ai = A [ x - 1 ] + N - ctr . getCount ( A [ x - 1 ] ) ;
    cover [ ai ] -- ;
    if ( ai > N && cover [ ai ] == 0 ) ans ++ ;
    A [ x - 1 ] = y ;
    int bi = y + N - ctr . getCount ( y ) ;
    if ( bi > N && cover [ bi ] == 0 ) ans -- ;
    cover [ bi ] ++ ;
    ctr . setCount ( y ++ ) ;
    System . out . println ( ans ) ;
  }
  return new int [ ] [ ] {
  }
  ;
}
