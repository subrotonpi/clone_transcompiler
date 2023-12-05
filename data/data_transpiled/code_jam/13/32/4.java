static final void solve ( int testCase ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
    }
    @ Override public String toString ( ) {
      return "" ;
    }
    @ Override public void puts ( String s ) {
      System . out . print ( s ) ;
    }
    @ Override public String direction ( int x , int y ) {
      if ( x > 0 ) return "E" ;
      if ( x < 0 ) return "W" ;
      if ( y > 0 ) return "N" ;
      if ( y < 0 ) return "S" ;
      return "" ;
    }
    @ Override public int movesReq ( int x , int y ) {
      int mandis = Math . abs ( x ) + Math . abs ( y ) ;
      int dis = 0 ;
      int moves = 0 ;
      while ( mandis > dis || dis % 2 != mandis % 2 ) {
        moves ++ ;
        dis += moves ;
      }
      return moves ;
    }
    @ Override public List < String > solutions ( int x , int y , int num ) {
      if ( num == 0 && x == 0 && y == 0 ) {
        List < String > list = new ArrayList < String > ( ) ;
      }
      else if ( movesReq ( x , y ) <= num ) {
        for ( String d : new String [ ] {
          "E" , x - num , y }
          ) {
            int xp = Math . abs ( x ) ;
            int yp = Math . abs ( y ) ;
            for ( String s : new solutions ( xp , yp , num - 1 ) ) {
              list . add ( s + d ) ;
            }
          }
          return list ;
        }
        return null ;
      }
      @ Override public void solve ( int testCase ) {
        int x = Integer . parseInt ( input ( ) ) ;
        int y = Integer . parseInt ( input ( ) ) ;
        int num = movesReq ( x , y ) ;
        for ( String s : new solutions ( x , y , num ) ) {
          System . out . println ( s ) ;
          break ;
        }
      }
    }
    ) ;
    for ( int testCase = 1 ;
    testCase <= 1 + Integer . MAX_VALUE ;
    testCase ++ ) {
      puts ( "Case #" + testCase + ": " ) ;
      solve ( testCase ) ;
    }
  }
  