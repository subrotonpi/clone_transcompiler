public static boolean input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  boolean ans = true ;
  String [ ] [ ] miria = {
    {
      "@" , "a" }
      , {
        "@" , "t" }
        , {
          "@" , "c" }
          , {
            "@" , "o" }
            , {
              "@" , "d" }
              , {
                "@" , "e" }
                , {
                  "@" , "r" }
                  , {
                    "a" , "@" }
                    , {
                      "t" , "@" }
                      , {
                        "c" , "@" }
                        , {
                          "o" , "@" }
                          , {
                            "d" , "@" }
                            , {
                              "e" , "@" }
                              , {
                                "r" , "@" }
                                , {
                                  "@" , "@" }
                                }
                                ;
                                for ( int i = 0 ;
                                i != s . length ( ) ;
                                i ++ ) {
                                  if ( s . charAt ( i ) != t . charAt ( i ) ) {
                                    String [ ] akagi = {
                                      s . substring ( i , i + 1 ) , t . substring ( i + 1 ) }
                                      ;
                                      if ( ! miria [ i ] [ 0 ] . equals ( akagi [ 0 ] ) ) {
                                        ans = false ;
                                      }
                                    }
                                  }
                                  if ( ans ) {
                                    System . out . println ( "You can win" ) ;
                                  }
                                  else {
                                    System . out . println ( "You will lose" ) ;
                                  }
                                  return ans ;
                                }
                                