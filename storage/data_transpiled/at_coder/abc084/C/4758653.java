public static int [ ] [ ] train ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] train = new int [ N ] [ N ] ;
  for ( int cnt = 0 ;
  cnt < N - 1 ;
  cnt ++ ) {
    int [ ] l = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    train [ cnt ] = l ;
  }
  @ SuppressWarnings ( "unused" ) int [ ] [ ] L = new int [ N ] [ N ] ;
  for ( int place = 0 ;
  place < N ;
  place ++ ) {
    int now = 0 ;
    for ( int i = place ;
    i < N - 1 ;
    i ++ ) {
      int k = Math . max ( 0 , Math . ceil ( ( now - L [ i ] [ 1 ] ) / L [ i ] [ 2 ] ) ) ;
      now = L [ i ] [ 1 ] + L [ i ] [ 2 ] * k ;
      now += L [ i ] [ 0 ] ;
    }
    System . out . println ( now ) ;
  }
  return train ;
}
