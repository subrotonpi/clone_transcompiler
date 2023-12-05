public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] w = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input ) ;
  }
  room = new int [ n ] ;
  room [ 0 ] = w [ 0 ] ;
  w [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < w . length ;
  i ++ ) {
    int wi = w [ i ] ;
    int num = 0 ;
    for ( int j = 0 ;
    j < num ;
    j ++ ) {
      wi = room [ j ] ;
    }
  }
}
