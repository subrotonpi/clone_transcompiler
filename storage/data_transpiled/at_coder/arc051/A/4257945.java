public static void print ( String input ) {
  int x1 = input . nextInt ( ) ;
  int y1 = input . nextInt ( ) ;
  int r = input . nextInt ( ) ;
  int x2 = input . nextInt ( ) ;
  int y2 = input . nextInt ( ) ;
  int x3 = input . nextInt ( ) ;
  int y3 = input . nextInt ( ) ;
  if ( x2 <= x1 - r && x1 + r <= x3 && y2 <= y1 - r && y1 + r <= y3 ) {
    System . out . println ( "NO" ) ;
    System . out . println ( "YES" ) ;
  }
  else if ( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) <= r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r * r