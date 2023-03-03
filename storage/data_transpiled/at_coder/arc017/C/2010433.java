@ VisibleForTesting static int [ ] readLongArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ws = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ws [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = N / 2 ;
  int [ ] res1 = new int [ H ] ;
  for ( int b = 0 ;
  b < 1 << H ;
  b ++ ) {
    int w = 0 ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) if ( ( b & ( 1 << i ) ) != 0 ) w += ws [ i ] ;
    res1 [ b ] = w ;
  }
  int [ ] res2 = new int [ N ] ;
  for ( int b = 0 ;
  b < N ;
  b ++ ) res2 [ b ] = res2 [ b ] ;
  int [ ] ctr = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ctr [ i ] = res1 [ i ] ;
  return ctr ;
}
