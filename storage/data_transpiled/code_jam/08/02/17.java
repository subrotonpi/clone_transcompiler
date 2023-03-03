public static final String sample = "1\n1\n2 2\n12:04 12:05\n12:07 12:10\n12:03 12:06\n12:10 12:11\n" ;
BufferedReader in = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
PrintWriter out = new PrintWriter ( "B-large.out" ) ;
IntStream . range ( 0 , N ) . forEach ( tt -> {
  return Stream . of ( tt . split ( ":" ) ) . map ( x -> Integer . parseInt ( x ) ) . map ( y -> x * 60 + y ) . filter ( x -> x . startsWith ( y ) ) . map ( x -> x * 60 + y ) . filter ( x -> x . endsWith ( y ) ) . findAny ( ) . orElse ( - 1 ) ;
}
) ;
IntStream . range ( 0 , N ) . forEach ( n -> {
  IntStream . range ( 0 , n ) . forEach ( i -> {
    IntStream . range ( 0 , n ) . forEach ( i -> {
      IntStream . range ( 0 , i ) . forEach ( i -> {
        IntStream . range ( 0 , i ) . forEach ( i -> {
          IntStream . range ( 1 , i ) . forEach ( i -> {
            IntStream . range ( 1 , i ) . forEach ( i -> {
              IntStream . range ( 1 , i ) . forEach ( i -> {
                IntStream . range ( 1 , i ) . forEach ( i -> {
                  IntStream . range ( 1 , i ) . forEach ( i -> {
                    IntStream . range ( 1 , i ) . forEach ( i -> {
                      IntStream . range ( 1 , i ) . forEach ( i -> {
                        IntStream . range ( 1 , i ) . forEach ( i -> {
                          IntStream . range ( 1 , i ) . forEach ( i -> {
                            IntStream . range ( 1 , i ) . forEach ( i -> {
                              IntStream . range ( 1 , i ) . forEach ( i -> {
                                IntStream . range ( 1 , i ) . forEach ( i -> {
                                  IntStream . range ( 1 , i ) . forEach ( i -> {
                                    IntStream . range ( 1 , i ) . forEach ( i -> {
                                      IntStream . range ( 1 , i ) ) ;
                                    }
                                  }
                                  ) ;
                                }
                                ) ;
                              }
                              ) ;
                            }
                            ) ;
                          }
                        }
                        ) ;
                      }
                    }
                    ) ;
                  }
                }
                ) ;
              }
              ) ;
            }
            ) ;
          }
          ) ;
        }
        ) ;
        