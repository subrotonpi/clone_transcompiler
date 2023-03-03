@ VisibleForTesting static String from ( String input ) throws IOException {
  final BufferedReader in = new BufferedReader ( new FileReader ( input ) ) ;
  final PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( output ) ) ) ;
  final int trials = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( trials ) ;
  i ++ ) {
    final int [ ] nums = new int [ 2 ] ;
    for ( String s : split ( in . readLine ( ) ) ) nums [ i ] = Integer . parseInt ( s ) ;
    final int C = nums [ 0 ] ;
    final int D = nums [ 1 ] ;
    final int [ ] Locs = new int [ C ] ;
    final int [ ] V = new int [ C ] ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      nums = new int [ 2 ] ;
      for ( String s : split ( in . readLine ( ) ) ) nums [ i ] = Integer . parseInt ( s ) ;
      Locs [ j ] = nums [ 0 ] ;
      V [ j ] = nums [ 1 ] ;
    }
    final int [ ] [ ] sums = new int [ C ] [ C ] ;
    for ( int x = 0 ;
    x < C ;
    x ++ ) {
      sums [ x ] [ x ] = V [ x ] ;
    }
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < C ;
      k ++ ) {
        sums [ j ] [ k ] = sums [ j ] [ k - 1 ] + sums [ k ] [ k ] ;
      }
    }
    double best = - 1 ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      for ( int k = j ;
      k < C ;
      k ++ ) {
        final int vendors = sums [ j ] [ k ] ;
        final double minspread = ( vendors - 1.0 ) * D ;
        final double currspread = ( double ) ( Locs [ k ] - Locs [ j ] ) ;
        final double maxtime = ( minspread - currspread ) / 2.0 ;
        if ( maxtime > best ) best = maxtime ;
      }
    }
    final String s = "Case #" + ( i + 1 ) + ": " + best + "\n" ;
    out . println ( s ) ;
  }
  in . close ( ) ;
  out . close ( ) ;
  return s ;
}
