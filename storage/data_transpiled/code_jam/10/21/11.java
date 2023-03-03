public static final Scanner getScanner ( ) throws IOException {
  final Scanner content = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( content . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    final String [ ] nums = content . nextLine ( ) . split ( " " ) ;
    final String [ ] existing = new String [ Integer . parseInt ( nums [ 0 ] ) ] ;
    final String [ ] new = new String [ Integer . parseInt ( nums [ 1 ] ) ] ;
    existing [ 0 ] = "/" ;
    for ( int j = 0 ;
    j < Integer . parseInt ( nums [ 0 ] ) ;
    j ++ ) {
      existing [ j ] = content . nextLine ( ) . trim ( ) ;
    }
    for ( int j = 0 ;
    j < Integer . parseInt ( nums [ 1 ] ) ;
    j ++ ) {
      new [ Integer . parseInt ( nums [ 2 ] ) ] = content . nextLine ( ) ;
    }
    int tot = 0 ;
    for ( final String item : new ) {
      final String [ ] liste = item . trim ( ) . split ( "/" ) ;
      final int len = liste . length ;
      String string = "" ;
      for ( int j = 0 ;
      j < len ;
      j ++ ) {
        final String val = liste [ j ] ;
        string += "/" ;
        string += val ;
        int done = 0 ;
        for ( final String a : existing ) {
          if ( ( string . equals ( a ) ) ) {
            done = 1 ;
            break ;
          }
        }
        if ( ( done == 0 ) && ( existing [ i ] . equals ( string ) ) ) {
          existing [ i ] = string ;
          tot ++ ;
        }
      }
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + tot ) ;
  }
  return new Scanner ( content ) ;
}
