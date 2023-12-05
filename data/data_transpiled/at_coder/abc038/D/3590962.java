public static int [ ] [ ] read ( Scanner in ) {
  int N = in . nextInt ( ) ;
  int [ ] [ ] rec = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = in . nextInt ( ) ;
    int h = in . nextInt ( ) ;
    rec [ i ] = new int [ w ] ;
    for ( int j = 0 ;
    j < h ;
    j ++ ) {
      rec [ i ] [ j ] = in . nextInt ( ) ;
    }
  }
  Arrays . sort ( rec , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return ( o2 [ 1 ] < - o2 [ 0 ] ? 1 : - 1 ) ;
    }
  }
  ) ;
  int M = 10 * 5 + 5 ;
  int [ ] data = new int [ M ] ;
  /* update the k numbers */
  while ( k < M ) {
    data [ k ] = Math . max ( data [ k ] , o1 ) ;
    k += data [ k ] & - data [ k ] ;
  }
  /* get the k numbers */
  int ans = 0 ;
  for ( int w = 0 ;
  w < rec . length ;
  w ++ ) {
    int num = rec [ w ] [ h ] ;
    ans = Math . max ( ans , num ) ;
    update ( w , num ) ;
  }
  System . out . println ( ans ) ;
  return rec ;
}
