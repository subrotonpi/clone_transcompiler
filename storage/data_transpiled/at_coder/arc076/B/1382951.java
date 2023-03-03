static final double [ ] [ ] init ( int N ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  int [ ] [ ] t = new int [ N ] [ N ] ;
  IntStream . range ( 0 , N ) . forEach ( i -> {
    IntStream . range ( 0 , i ) . forEach ( i -> {
      IntStream . range ( 0 , i ) . forEach ( i -> {
        IntStream . range ( 1 , i ) . forEach ( i -> {
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
                                  }
                                  ) ;
                                }
                              }
                            }
                            ) ;
                          }
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
      