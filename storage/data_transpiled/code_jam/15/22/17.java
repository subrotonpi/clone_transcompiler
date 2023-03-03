@ functools . VisibleForTesting static void solve ( ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new FileWriter ( "B-large.out" ) ) ;
  Function < String , Integer > input = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return inf . readLine ( ) . trim ( ) ;
    }
  }
  ;
  Function < String , Integer > print = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String input ) {
      return ouf . apply ( input ) ;
    }
  }
  ;
  @ Override public void solve ( ) {
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    int n = input . readLine ( ) ;
    if ( r > c ) {
      r = c ;
      c = r ;
    }
    if ( n <= ( r * c ) / 2 + ( r * c ) % 2 ) {
      System . out . println ( 0 ) ;
      return ;
    }
    int free = r * c - n ;
    int cur = ( r - 1 ) * c + ( c - 1 ) * r ;
    int [ ] [ ] ways ;
    if ( r == 1 ) {
      if ( c % 2 == 0 ) {
        ways = new int [ ] [ ] {
          new int [ ] {
            2 }
            , new int [ ] {
              1 }
            }
            ;
          }
          else {
            ways = new int [ ] [ ] {
              new int [ ] {
                2 }
                , new int [ ] {
                  2 }
                  , new int [ ] {
                    2 }
                    , new int [ ] {
                      2 }
                      , 2 }
                      ;
                    }
                  }
                  else {
                    ways = new int [ ] [ ] {
                      4 }
                      ;
                    }
                  }
                }
                