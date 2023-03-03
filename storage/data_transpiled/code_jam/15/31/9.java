static final Scanner getScanner ( ) throws FileNotFoundException {
  final Scanner in = new Scanner ( new File ( "A-large.in" ) ) ;
  final int lines = in . nextInt ( ) ;
  int idx = 1 ;
  while ( in . hasNextLine ( ) ) {
    final int r = in . nextInt ( ) ;
    final int c = in . nextInt ( ) ;
    final int w = in . nextInt ( ) ;
    final int perRow = c / w ;
    if ( c % w != 0 ) {
      System . out . println ( "Case #" + idx + ": " + perRow * r + w ) ;
    }
    else {
      System . out . println ( "Case #" + idx + ": " + perRow * r + w - 1 ) ;
    }
    idx ++ ;
  }
}
