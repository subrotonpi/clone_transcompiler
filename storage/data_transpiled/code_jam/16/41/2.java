public static String [ ] winsOver ( ) {
  final HashMap < String , String > winsOver = new HashMap < String , String > ( ) {
    {
      put ( "R" , "S" ) ;
      put ( "S" , "P" ) ;
      put ( "P" , "R" ) ;
    }
  }
  ;
  {
    if ( foo . length ( ) == 1 ) {
      return foo ;
    }
    final String l = reorder ( foo . substring ( 0 , foo . length ( ) / 2 ) ) ;
    final String r = reorder ( foo . substring ( foo . length ( ) / 2 ) ) ;
    return reorder ( new String [ ] {
      l , r }
      ) ;
    }
    {
      final StringBuilder lineup = new StringBuilder ( start ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        final StringBuilder newLineup = new StringBuilder ( ) ;
        for ( final char c : lineup ) {
          newLineup . append ( c ) ;
          newLineup . append ( winsOver . get ( c ) ) ;
        }
        lineup = newLineup ;
      }
      return reorder ( lineup . toString ( ) ) ;
    }
    {
      final int n = Integer . parseInt ( input . nextLine ( ) ) ;
      final int r = Integer . parseInt ( input . nextLine ( ) ) ;
      final int p = Integer . parseInt ( input . nextLine ( ) ) ;
      final int s = Integer . parseInt ( input . nextLine ( ) ) ;
      final Set < String > ress = new HashSet < String > ( ) ;
      for ( final String c : winsOver . keySet ( ) ) {
        final String foo = reverse ( n , c ) ;
        if ( foo . indexOf ( "R" ) == r && foo . indexOf ( "P" ) == p && foo . indexOf ( "S" ) == s ) {
          ress . add ( foo ) ;
        }
      }
      if ( ress . size ( ) == 0 ) {
        return "IMPOSSIBLE" ;
      }
      else {
        return Collections . min ( ress ) ;
      }
    }
  }
  