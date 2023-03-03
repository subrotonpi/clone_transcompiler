@ VisibleForTesting static Iterable < String > combinations ( ) {
  final String BUTTONS [ ] = {
    "A" , "B" , "X" , "Y" }
    ;
    final List < String > LR_PATTERNS = Lists . newArrayList ( ) ;
    for ( String s : BUTTONS ) {
      LR_PATTERNS . add ( s ) ;
    }
    return new Iterable < String > ( ) {
      @ Override public Iterator < String > iterator ( ) {
        return new Iterator < String > ( ) {
          int N = Integer . parseInt ( input ( ) ) ;
          @ Override public boolean hasNext ( ) {
            return N > 0 ;
          }
          @ Override public String next ( ) {
            String commands = input ( ) . replaceAll ( "\\s+" , "" ) ;
            int minimum = commands . length ( ) ;
            for ( int i = 0 ;
            i < LR_PATTERNS . size ( ) ;
            i ++ ) {
              String l = LR_PATTERNS . get ( i ) ;
              for ( int j = 0 ;
              j < LR_PATTERNS . size ( ) ;
              j ++ ) {
                String r = LR_PATTERNS . get ( j ) ;
                if ( i == j ) {
                  continue ;
                }
                int tmp = commands . replace ( l . concat ( "" ) . concat ( l ) , 'L' ) . replace ( r . concat ( r ) , 'R' ) . length ( ) ;
                if ( tmp < minimum ) {
                  minimum = tmp ;
                }
              }
            }
            System . out . println ( minimum + "" ) ;
            return commands . iterator ( ) ;
          }
        }
        ;
      }
    }
    ;
  }
  