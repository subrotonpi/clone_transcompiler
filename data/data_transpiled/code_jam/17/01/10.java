static final int getRank ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    String [ ] line = input . nextLine ( ) . split ( " " ) ;
    String s = line [ 0 ] ;
    int k = Integer . parseInt ( line [ 1 ] ) ;
    int len = s . length ( ) ;
    int n = len ;
    int count = 0 ;
    for ( int i = 0 ;
    i < n - k + 1 ;
    i ++ ) {
      if ( s . charAt ( i ) == 1 ) {
        count ++ ;
        len -- ;
      }
    }
    if ( Integer . bitCount ( s ) > 0 ) {
      count = Rank . IMPOSSIBLE ;
    }
    System . out . println ( "Case #" + test + ": " + count ) ;
  }
  return T ;
}
