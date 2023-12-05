public static void print ( int sx , int sy , int tx , int ty ) {
  String s = Integer . toString ( input . nextInt ( ) ) ;
  int dx = tx - sx ;
  int dy = ty - sy ;
  s += 'R' + 'U' + 'L' + 'D' + 'R' ;
  System . out . println ( s ) ;
}
