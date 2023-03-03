public static void Rectangle ( ) throws IOException {
  int x1 = coords . x ;
  int y1 = coords . y ;
  int x2 = coords . x ;
  int y2 = coords . y ;
  Rectangle rect = new Rectangle ( coords ) ;
  for ( Rectangle rect2 : rectangles ) {
    if ( rect . neighbour ( rect2 ) ) {
      rect . neighbours . add ( rect2 ) ;
      rect2 . neighbours . add ( rect ) ;
    }
  }
  Rectangle [ ] regions = new Rectangle [ 4 ] ;
  for ( int i = 0 ;
  i < regions . length ;
  i ++ ) {
    if ( ! regions [ i ] . visited ) {
      regions [ i ] = new Region ( rectangles [ i ] ) ;
    }
  }
  int ans = 0 ;
  for ( Region region : regions ) {
    if ( ! region . visited ) {
      regions [ i ] . visited = true ;
    }
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
}
