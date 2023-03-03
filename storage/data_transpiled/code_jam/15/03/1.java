private static HashMap < String , String > multq = new HashMap < String , String > ( ) {
  private static final long serialVersionUID = - 5743792688163846L ;
  {
    put ( new String [ ] {
      "1" , "1" , "1" }
      ) ;
      put ( new String [ ] {
        "1" , "i" , "i" }
        ) ;
        put ( new String [ ] {
          "1" , "j" , "j" }
          ) ;
          put ( new String [ ] {
            "1" , "k" , "k" }
            ) ;
            put ( new String [ ] {
              "i" , "1" , "i" }
              ) ;
              put ( new String [ ] {
                "i" , "i" , "-1" }
                ) ;
                put ( new String [ ] {
                  "i" , "j" , "k" }
                  ) ;
                  put ( new String [ ] {
                    "i" , "k" , "-j" }
                    ) ;
                    put ( new String [ ] {
                      "1" , "j" , "j" }
                      ) ;
                      put ( new String [ ] {
                        "j" , "i" , "-k" }
                        ) ;
                        put ( new String [ ] {
                          "j" , "1" , "j" }
                          ) ;
                          put ( new String [ ] {
                            "j" , "j" , "-1" }
                            ) ;
                            put ( new String [ ] {
                              "j" , "k" , "i" }
                              ) ;
                              put ( new String [ ] {
                                "k" , "1" , "k" }
                                ) ;
                                put ( new String [ ] {
                                  "k" , "i" , "j" }
                                  ) ;
                                  put ( new String [ ] {
                                    "k" , "k" , "-1" }
                                    ) ;
                                  }
                                }
                                int t = input . nextInt ( ) ;
                                for ( int j = 0 ;
                                j < xrange ;
                                j ++ ) {
                                  long l = Integer . parseInt ( input . nextLine ( ) ) ;
                                  int x = input . nextInt ( ) ;
                                  String s = input . nextLine ( ) ;
                                  if ( x >= 12 ) x = 8 + x % 4 ;
                                  s = s * x ;
                                  int state = 0 ;
                                  String p = "1" ;
                                  for ( String q : s . split ( " " ) ) {
                                    p = multq . get ( new String ( p ) ) ;
                                    switch ( state ) {
                                      case 0 : if ( p . equals ( "i" ) ) state = 1 ;
                                      break ;
                                      case 1 : if ( p . equals ( " k