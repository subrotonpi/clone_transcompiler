private static void solveCase ( int caseIndex , BufferedReader br ) throws IOException {
  HashMap < Integer , int [ ] > chToBarkMap = new HashMap < > ( ) ;
  chToBarkMap . put ( "0" , new int [ ] {
    0 , 0 , 0 , 0 }
    ) ;
    chToBarkMap . put ( "1" , new int [ ] {
      0 , 0 , 0 , 1 }
      ) ;
      chToBarkMap . put ( "2" , new int [ ] {
        0 , 0 , 1 , 0 }
        ) ;
        chToBarkMap . put ( "3" , new int [ ] {
          0 , 0 , 1 , 1 }
          ) ;
          chToBarkMap . put ( "4" , new int [ ] {
            0 , 1 , 0 , 0 }
            ) ;
            chToBarkMap . put ( "5" , new int [ ] {
              0 , 1 , 0 , 1 }
              ) ;
              chToBarkMap . put ( "6" , new int [ ] {
                0 , 1 , 1 , 0 }
                ) ;
                chToBarkMap . put ( "7" , new int [ ] {
                  0 , 1 , 1 , 1 }
                  ) ;
                  chToBarkMap . put ( "8" , new int [ ] {
                    1 , 0 , 0 , 0 }
                    ) ;
                    chToBarkMap . put ( "9" , new int [ ] {
                      1 , 0 , 0 , 1 }
                      ) ;
                      chToBarkMap . put ( "A" , new int [ ] {
                        1 , 0 , 1 , 0 }
                        ) ;
                        chToBarkMap . put ( "B" , new int [ ] {
                          1 , 0 , 1 , 1 }
                          ) ;
                          chToBarkMap . put ( "C" , new int [ ] {
                            1 , 0 , 0 , 1 }
                            ) ;
                            chToBarkMap . put ( "D" , new int [ ] {
                              1 , 0 , 1 , 0 }
                              ) ;
                              chToBarkMap . put ( "E" , new int [ ] {
                                1 , 1 , 1 , 0 }
                                ) ;
                                int [ ] [ ] result = new int [ chToBarkMap . size ( ) ] [ ] ;
                                for ( int i = 0 ;
                                i < chToBarkMap . size ( ) ;
                                i ++ ) {
                                  result [ i ] = chToBarkMap . get ( chToBarkMap . get ( i ) ) ;
                                }
                                int REMOVED = 5 ;
                                int [ ] [ ] cutSquares = new