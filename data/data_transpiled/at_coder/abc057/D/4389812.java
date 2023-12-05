public static int [ ] [ ] getPairs ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int vlist [ ] [ ] = new int [ 51 ] [ 51 ] ;
  for ( int i = 0 ;
  i < 51 ;
  i ++ ) {
    vlist [ i ] [ 0 ] = 0 ;
  }
  for ( int i = 0 ;
  i < 51 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < b ;
    j ++ ) {
      if ( j == 0 || j == i ) {
        cc [ i ] [ j ] = 1 ;
      }
      else {
        cc [ i ] [ j ] = cc [ i - 1 ] [ j ] + cc [ i - 1 ] [ j ] ;
      }
    }
  }
  double avg = sum ( vlist , 0 , a ) / a ;
  int avaln = 0 , avalp = 0 ;
  return cc ;
}
