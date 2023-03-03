static final String solve ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String raw = in . readLine ( ) ;
  final Map < Integer , String > ints = map ( Integer :: parseInt , raw ) ;
  Scanner scanner = new Scanner ( System . in ) ;
  final String [ ] L = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    final String [ ] M = {
      {
        "G" , 8 , "EIGHT" }
        , {
          "W" , 2 , "TWO" }
          , {
            "Z" , 0 , "ZERO" }
            , {
              "X" , 6 , "SIX" }
              , {
                "U" , 4 , "FOUR" }
                , {
                  "S" , 7 , "SEVEN" }
                  , {
                    "V" , 5 , "FIVE" }
                    , {
                      "O" , 1 , "ONE" }
                      , {
                        "T" , 3 , "THREE" }
                        , {
                          "I" , 9 , "NINE" }
                        }
                        ;
                        String S ;
                        int [ ] count = new int [ M . length ] ;
                        StringBuilder ret = new StringBuilder ( ) ;
                        for ( int i = 0 ;
                        i < S . length ( ) ;
                        i ++ ) {
                          count [ S . charAt ( i ) ] ++ ;
                        }
                        for ( int i = 0 ;
                        i < M . length ;
                        i ++ ) {
                          int c = M [ i ] ;
                          int x = 0 ;
                          String word = L [ c ] ;
                          int n = count [ c ] ;
                          for ( int j = 0 ;
                          j < word . length ( ) ;
                          j ++ ) {
                            int d = word . charAt ( j ) ;
                            count [ d ] -= n ;
                          }
                          ret . append ( L [ x ] ) ;
                          ret . append ( ' ' ) ;
                        }
                        Collections . sort ( ret ) ;
                        return ret . toString ( ) ;
                      }
                      