static void print ( String s ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  int t = 0 ;
  while ( scanner . hasNextLine ( ) ) {
    if ( scanner . nextLine ( ) . isEmpty ( ) ) {
      continue ;
    }
    final int [ ] v = map . get ( scanner . nextLine ( ) . split ( "\\s+" ) [ 0 ] ) ;
    final int m = ( 1 << v [ 0 ] ) - 1 ;
    t ++ ;
    final String [ ] r = {
      "OFF" , "ON" }
      ;
      r [ v [ 1 ] & m == m ] = v [ 1 ] & m ;
      System . out . println ( "Case #" + t + ": " + r [ 0 ] ) ;
    }
  }
  