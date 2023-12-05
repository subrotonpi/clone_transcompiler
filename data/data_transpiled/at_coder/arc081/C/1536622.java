public static int ordA ( char a ) {
  int L = 26 ;
  List < Character > S = Collections . list ( input . toCharArray ( ) ) ;
  List < Integer > memo = new ArrayList < > ( ) ;
  int [ ] f = new int [ L ] ;
  int cnt = 0 ;
  for ( int i = 0 , s = 0 ;
  i < S . size ( ) ;
  i ++ ) {
    cnt += ( f [ s ] == 0 ) ? 0 : 1 ;
    f [ s ] ++ ;
    if ( cnt == L ) {
      memo . add ( new Integer ( i ) ) ;
      f = new int [ L ] ;
      cnt = 0 ;
    }
  }
  int [ ] result = new int [ L ] ;
  result [ 0 ] = f . indexOf ( 0 ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    result [ i ] = memo . get ( i ) ;
  }
  return result [ L ] ;
}
