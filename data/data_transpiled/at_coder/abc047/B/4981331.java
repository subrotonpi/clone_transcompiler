public static int [ ] [ ] [ ] createCells ( String input ) {
  int W = Integer . parseInt ( input ) ;
  int H = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] [ ] cells = new int [ W ] [ H ] ;
  List < List < Integer >> lists = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lists . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  for ( List < Integer > ls : lists ) {
    int x = ls . get ( 0 ) ;
    int y = ls . get ( 1 ) ;
    int a = ls . get ( 2 ) ;
    if ( a == 1 ) {
      for ( int h = 0 ;
      h < H ;
      h ++ ) {
        for ( int w = 0 ;
        w < x ;
        w ++ ) {
          cells [ h ] [ w ] = 1 ;
        }
      }
    }
    else {
      for ( int h = H - y ;
      h < H ;
      w ++ ) {
        for ( int w = 0 ;
        w < W ;
        w ++ ) {
          cells [ h ] [ w ] = 1 ;
        }
      }
    }
  }
  int count = 0 ;
  for ( int [ ] [ ] rows : cells ) {
    count += rows . count ( 0 ) ;
  }
  System . out . println ( count ) ;
  return cells ;
}
