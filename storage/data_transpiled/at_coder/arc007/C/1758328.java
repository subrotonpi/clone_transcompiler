static final String getExample ( ) {
  final String s = "" ;
  System . out . println ( s ) ;
  final double INF = Double . MAX_VALUE ;
  System . setOut ( new PrintStream ( System . out ) {
    final double [ ] dy = {
      0 , - 1 , 0 , 1 }
      ;
      final double [ ] dx = {
        1 , 0 , - 1 , 0 }
        ;
        @ Override public boolean inside ( int y , int x , int H , int W ) {
          return 0 <= y && y < H && 0 <= x && x < W ;
        }
        @ Override public void main ( String [ ] args ) {
          String s = input . nextLine ( ) ;
          int n = s . length ( ) ;
          String [ ] l = new String [ n ] ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            l [ i ] = s ;
            s = s . substring ( 1 ) + s . charAt ( 0 ) ;
          }
          int ans = INF ;
          for ( int b = 0 ;
          b < 2 * n ;
          b ++ ) {
            String [ ] use = new String [ n ] ;
            for ( int i = 0 ;
            i < n ;
            i ++ ) {
              if ( ( b & 1 << i ) != 0 ) {
                use [ i ] = l [ i ] ;
              }
            }
            for ( int i = 0 ;
            i < n ;
            i ++ ) {
              boolean ok = false ;
              for ( int j = 0 ;
              j < use . length ;
              j ++ ) {
                ok |= use [ j ] . charAt ( i ) == 'o' ;
              }
              if ( ! ok ) {
                break ;
              }
            }
            else {
              ans = Math . min ( ans , use . length ) ;
            }
          }
          System . out . println ( ans ) ;
        }
      }
      ) ;
      if ( s . equals ( "" ) ) {
        System . out . println ( s ) ;
      }
      return s ;
    }
    