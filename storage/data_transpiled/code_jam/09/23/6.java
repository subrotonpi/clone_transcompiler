@ Nullable public static List < Pair < Integer , String >> solve ( String input , int size ) {
  return new ArrayList < Pair < Integer , String >> ( ) {
    {
      final int r = 0 ;
      final int c = input . charAt ( 0 ) ;
      final String val = input . substring ( r + 1 , c ) ;
      final String op = input . substring ( c - 1 , c ) ;
      final int [ ] neighbors = new int [ size ] ;
      for ( int i = 0 ;
      i < neighbors . length ;
      i ++ ) {
        neighbors [ i ] = new int [ ] {
          r + 1 , c }
          ;
        }
        neighbors [ i ] = new int [ ] {
          r - 1 , c }
          ;
        }
      }
      ;
      try {
        final File f = new File ( "C-small-attempt0.in" ) ;
        final FileWriter o = new FileWriter ( f ) ;
        final int cases = Integer . parseInt ( f . next ( ) ) ;
        for ( int i = 1 ;
        i < cases ;
        i ++ ) {
          System . out . println ( "Case #" + i + ":" ) ;
          o . write ( "Case #" + i + ":\n" ) ;
          final int gridSize = Integer . parseInt ( f . next ( ) ) ;
          final int [ ] queries = new int [ gridSize ] ;
          for ( int q = 0 ;
          q < queries . length ;
          q ++ ) {
            queries [ q ] = q ;
          }
          for ( int i = 0 ;
          i < queries . length ;
          i ++ ) {
            final int nr = queries [ i ] ;
            final int nc = queries [ i ] ;
            final int child ;
            if ( ( child = findNode ( input , r , c , val , op ) ) != - 1 ) {
              final int index = i ;
              final int index = i ;
              final String expr = op ( index , val , index ) ;
              final Pair < Integer , String > node = new Pair < Integer , String > ( index , expr ) ;
              heappush ( node ) ;
            }
          }
        }
      }
      catch ( final IOException e ) {
        e . printStackTrace ( ) ;
      }
      return successors ;
    }
    