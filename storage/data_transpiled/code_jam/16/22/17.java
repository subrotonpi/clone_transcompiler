@ VisibleForTesting static String [ ] [ ] options ( final String TEST ) {
  final String IN = "B-" + TEST + ".in" ;
  final String OUT = "B-" + TEST + ".out" ;
  final String [ ] [ ] result = new String [ ] [ ] {
    {
      rc , rj }
    }
    ;
    final Scanner fin = new Scanner ( new File ( IN ) ) ;
    final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
    final int t = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      final String c = fin . nextLine ( ) . trim ( ) ;
      final String j = fin . nextLine ( ) . trim ( ) ;
      final String res = run ( c , j ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + res ) ;
    }
    if ( className . equals ( "java.util.concurrent.atomic.AtomicInteger" ) ) {
      return result ;
    }
    final String [ ] [ ] options = {
      "" }
      ;
      if ( c . length ( ) == 0 ) {
        result [ 0 ] = options [ 0 ] , options [ 1 ] , options [ 2 ] }
        ;
        if ( c . length ( ) == 0 ) {
          result [ 1 ] [ 0 ] = options [ 0 ] ;
          result [ 0 ] [ 1 ] = options [ 1 ] [ 0 ] ;
          result [ 1 ] [ 1 ] = options [ 2 ] [ 0 ] ;
          result [ 2 ] [ 1 ] = options [ 3 ] [ 1 ] ;
          result [ 3 ] [ 2 ] = options [ 4 ] [ 2 ] ;
          result [ 4 ] [ 3 ] = options [ 5 ] [ 3 ] ;
          result [ 5 ] [ 1 ] = options [ 6 ] [ 2 ] ;
          result [ 6 ] [ 2 ] = options [ 7 ] [ 1 ] ;
          result [ 7 ] [ 0 ] = options [ 8 ] [ 2 ] ;
          result [ 8 ] [ 1 ] = options [ 9 ] [ 3 ] [ 4 ] ;
          result [ 9 ] [ 2 ] = options [ 8 ] [ 3 ] [ 4 ] ;
          result [ 10 ] [ 1 ] = options [ 8 ] [ 2 ] ;
          result [ 11 ] [ 2 ] = options [ 8 ] [ 3 ] [ 4 ] ;
          result [ 12 ] [ 3 ] = options [ 12 ]