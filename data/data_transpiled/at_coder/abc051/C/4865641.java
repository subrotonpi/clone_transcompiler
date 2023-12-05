public static void print ( int sx , int sy , int tx , int ty ) {
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    int dx = tx - sx ;
    int dy = ty - sy ;
    int p1 = dy * 'U' + dx * 'R' ;
    int p2 = dy * 'D' + dx * 'L' ;
    int p3 = 'D' + ( dx + 1 ) * 'R' + ( dy + 1 ) * 'U' + 'L' ;
    int p4 = 'U' + ( dx + 1 ) * 'L' + ( dy + 1 ) * 'D' + 'R' ;
    System . out . println ( p1 + p2 + p3 + p4 ) ;
  }
}
