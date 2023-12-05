public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < h . length ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input ) ;
  }
  h [ h . length - 1 ] = 0 ;
  int cnt = 0 ;
  for ( int H = 0 ;
  H < Math . max ( h . length , H ) ;
  H ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( h [ i ] > 0 ) {
        h [ i ] -- ;
        if ( h [ i + 1 ] == 0 ) {
          cnt ++ ;
        }
      }
    }
  }
  System . out . println ( cnt ) ;
}
