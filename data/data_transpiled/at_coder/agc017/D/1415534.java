static final String [ ] [ ] read ( ) {
  final String [ ] [ ] a = new String [ 10 ] [ 5 + 5 ] ;
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
      read ( ) ;
    }
    @ Override public int [ ] readIntList ( ) {
      return new int [ ] {
        Integer . parseInt ( input ( ) ) }
        ;
      }
      @ Override public int [ ] readIntList ( ) {
        return new int [ ] {
          Integer . parseInt ( input ( ) ) }
          ;
        }
        @ Override public String [ ] readStrList ( ) {
          return new String [ ] {
            input ( ) }
            ;
          }
          @ Override public String [ ] readStr ( ) {
            return new String [ ] {
              input ( ) }
              ;
            }
          }
          ;
          int [ ] [ ] a = null ;
          {
            int [ ] dfs = new int [ ] {
              root , parent }
              ;
              int res = 0 ;
              for ( int i = 0 ;
              i < a [ root ] . length ;
              i ++ ) {
                if ( a [ root ] [ i ] != parent ) {
                  res ^= 1 + dfs [ i ] [ root ] ;
                }
              }
              return a ;
            }
            private int [ ] readTree ( boolean check ) {
              int n , p ;
              if ( check ) {
                n = gen . nextInt ( ) ;
                p = new int [ n - 1 ] ;
                for ( int i = 0 ;
                i < n - 1 ;
                i ++ ) {
                  p [ i ] = readIntList ( ) ;
                }
              }
              else {
                n = readInt ( ) ;
                p = new int [ n ] ;
                for ( int i = 0 ;
                i < p . length ;
                i ++ ) {
                  p [ i ] = readIntList ( ) ;
                }
                for ( int i = 0 ;
                i < p . length ;
                i ++ ) {
                  int x = p [ i ] ;
                  x -- ;
                  y -- ;
                  a [ x ] [ p [ i ] ] = y ;
                  a [ y ] [ p [ i ] ] = x ;
                }
              }
              return a ;
            }
            private int [ ] [ ] gen ( ) {
              int n = random . nextInt ( 5 ) + 30 ;
              List < Integer > inside = new ArrayList < > ( 1 ) ;
              List < Integer > outside = new LinkedList < > ( 2 ) ;
              List < Integer > p = new ArrayList < > ( ) ;
              for ( int i = 0 ;
              i < n - 1 ;
              i ++ ) {
                int x = random . nextInt ( inside . size