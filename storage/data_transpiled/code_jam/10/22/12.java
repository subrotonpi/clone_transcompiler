public static void fin ( Scanner fin ) throws IOException {
  int testCount = Integer . parseInt ( fin . nextLine ( ) . replaceAll ( " " , "" ) ) ;
  for ( int c = xrange ( testCount ) ;
  c < testCount ;
  c ++ ) {
    int n = Integer . parseInt ( fin . nextLine ( ) . replaceAll ( " " , "" ) ) ;
    int k = Integer . parseInt ( fin . nextLine ( ) . replaceAll ( " " , "" ) ) ;
    int b = Integer . parseInt ( fin . nextLine ( ) . replaceAll ( " " , "" ) ) ;
    int t = Integer . parseInt ( fin . nextLine ( ) . replaceAll ( " " , "" ) ) ;
    int [ ] positions = new int [ n ] ;
    int [ ] speeds = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      positions [ i ] = Integer . parseInt ( fin . nextLine ( ) . replaceAll ( " " , "" ) ) ;
      speeds [ i ] = Integer . parseInt ( fin . nextLine ( ) . replaceAll ( " " , "" ) ) ;
    }
    Arrays . sort ( positions ) ;
    Arrays . sort ( speeds ) ;
    int fastChicks = 0 ;
    int slowChicks = 0 ;
    int neededSwaps = 0 ;
    for ( int i : xrange ( n ) ) {
      if ( positions [ i ] + speeds [ i ] * t >= b ) {
        fastChicks ++ ;
        neededSwaps += slowChicks ;
      }
      else {
        slowChicks ++ ;
      }
      if ( fastChicks == k ) break ;
    }
    if ( fastChicks < k ) System . out . println ( "Case #" + ( c + 1 ) + ": IMPOSSIBLE" ) ;
    else System . out . println ( "Case #" + ( c + 1 ) + ": " + neededSwaps ) ;
  }
}
