public static void drawLine ( int sx , int sy , int tx , int ty ) {
  int i ;
  int dx = tx - sx ;
  int dy = ty - sy ;
  for ( i = 0 ;
  i < dx ;
  i ++ ) {
    s += 'R' ;
  }
  for ( i = 0 ;
  i < dy ;
  i ++ ) {
    s += 'U' ;
  }
  for ( i = 0 ;
  i < dx ;
  i ++ ) {
    s += 'L' ;
  }
  for ( i = 0 ;
  i < dy ;
  i ++ ) {
    s += 'D' ;
  }
  System . out . println ( s ) ;
}
