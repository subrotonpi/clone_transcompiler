public static int Q = Integer . parseInt ( input ) {
  int [ ] [ ] l_r = new int [ Q ] [ ] ;
  for ( int i = 0 ;
  i < l_r . length ;
  i ++ ) {
    l_r [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  boolean [ ] prime = new boolean [ 10 * 10 * 5 + 1 ] ;
  int [ ] Csum = new int [ 10 * 10 * 5 + 1 ] ;
  for ( int i = 2 ;
  i < 10 * 10 * 5 + 1 ;
  i ++ ) {
    if ( ! prime [ i ] ) {
      for ( int j = i * 2 ;
      j < 10 * 10 * 5 + 1 ;
      j += i ) {
        prime [ j ] = true ;
      }
    }
  }
  int cnt = 0 ;
  for ( int i = 3 ;
  i < 10 * 10 * 5 + 1 ;
  i += 2 ) {
    if ( ( ! prime [ i ] ) && ( ! prime [ ( i + 1 ) / 2 ] ) ) {
      cnt ++ ;
    }
    Csum [ i ] = cnt ;
  }
  for ( int i = 0 ;
  i < l_r . length ;
  i ++ ) {
    System . out . println ( Csum [ l_r [ i ] [ 1 ] ] - Csum [ l_r [ i ] [ 0 ] - 2 ] ) ;
  }
  return 0 ;
}
