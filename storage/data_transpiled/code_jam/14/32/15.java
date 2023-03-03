@ Nullable private static String getDiamondString ( ) {
  final int MOD = 1000000007 ;
  final int ncases = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  {
    final Set < String > set = new HashSet < String > ( ) ;
    String last = null ;
    for ( String s : set ) {
      if ( s . length ( ) != last . length ( ) ) {
        if ( set . contains ( s ) ) return false ;
        set . add ( s ) ;
        last = s ;
      }
    }
    {
      final char [ ] [ ] chars = isMap . keySet ( ) . toArray ( new String [ 0 ] [ ] ) ;
      for ( char [ ] chars : chars ) {
        if ( chars . length > 0 ) {
          final char [ ] chars = chars [ 0 ] ;
          if ( chars . length > 0 ) {
            final char [ ] chars = chars ;
            if ( chars . length > 0 ) {
              final char [ ] chars = chars ;
              if ( chars . length > 0 ) {
                final char [ ] chars = chars ;
                if ( chars . length > 0 ) {
                  chars [ 0 ] = chars [ 1 ] ;
                }
              }
            }
          }
        }
      }
    }
    final char [ ] [ ] cars = isMap . get ( ) ;
    for ( int i = 0 ;
    i < cars . length ;
    i ++ ) {
      final char [ ] chars = isMap . get ( ) . toArray ( new char [ 0 ] [ ] ) ;
      final char [ ] chars = isMap . get ( ) . toArray ( new char [ 0 ] ) ;
      int poss = chars . length ;
      poss *= chars . length ;
      poss = poss % MOD ;
      if ( poss > 0 ) {
        final char [ ] chars = chars ;
        if ( chars . length > 0 ) {
          final char [ ] chars = chars ;
          if ( chars . length > 0 ) {
            chars = chars ;
          }
        }
      }
    }
    final char [ ] chars = isMap . get ( ) . toArray ( new char [ 0 ] ) ;
    final char [ ] chars = isMap . get ( ) . toArray ( new char [ 0 ] ) ;
    int fail = 0 ;
    for ( char [ ] chars : chars ) {
      if ( chars . length > 0 ) {
        chars [ 0 ] = chars [ 0 ] ;
      }
    }
    if ( fail > 0 ) {
      System . out . println ( "Case #" + ( ncases + 1 ) + ": " + 0 ) ;
      