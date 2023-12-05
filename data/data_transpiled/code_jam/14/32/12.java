static final String getShortestString ( ) {
  final int P = 1000000007 ;
  final List < String > alpha = Collections . singletonList ( "" ) ;
  try {
    final Scanner in = new Scanner ( System . in ) ;
    final File out = new File ( "out.txt" ) ;
    final int t = in . nextInt ( ) ;
    int n = in . nextInt ( ) ;
    int i = 0 , j = 1 ;
    try {
      final int ns = in . nextInt ( ) ;
      final String line = in . nextLine ( ) ;
      final int [ ] test = new int [ ns ] ;
      for ( i = 1 ;
      i < test . length ;
      ++ i ) {
        final int c = in . nextInt ( ) ;
        if ( test [ i ] != test [ i - 1 ] ) {
          us [ test [ i - 1 ] ] = 1 ;
          if ( us [ test [ i ] ] == 1 ) {
            res = 0 ;
            break ;
          }
        }
      }
      System . out . println ( t > 0 ? "Case #" + ( t + 1 ) : " " + res ) ;
    }
    catch ( final Exception e ) {
      System . out . println ( t + 1 + ": " + e ) ;
      exit ( ) ;
    }
    final String [ ] aa = new String [ n ] ;
    for ( final String s : a ) {
      final char c = s . charAt ( 0 ) ;
      boolean full = true ;
      for ( final char y : s . toCharArray ( ) ) {
        if ( y != c ) {
          full = false ;
        }
      }
      if ( full ) {
        d [ c ] ++ ;
      }
      else {
        aa [ 0 ] = s ;
        d [ s ] ++ ;
      }
    }
    final String [ ] a = aa ;
    for ( final String s : alpha ) {
      for ( int i = 1 ;
      i <= d [ s ] . length ( ) ;
      ++ i ) {
        res = ( res * i ) % P ;
      }
      d [ s ] = d [ s ] . length ( ) > 0 ? 1 : 0 ;
    }
    boolean pos = true ;
    int k = 0 ;
    for ( final String s : alpha ) {
      if ( d [ s ] . length ( ) > 1 || d [ s ] . length ( ) > 2 ) {
        pos = false ;
      }
      k += ( d [ s ] . length ( ) > 0 ? d [ s ] [ 2 ] : 0 ) ;
    }
    final int n = a . length ;
    if ( ! pos || ( k