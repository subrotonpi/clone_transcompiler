@ Function public static int readInt = lambda ( ) {
  IntStream . range ( 0 , k ) . filter ( x -> x . length ( ) > 0 ) . parallel ( ) . forEach ( x -> x . forEach ( x -> x . forEach ( x :: add ) ) ) ;
  IntStream . range ( 0 , k ) . forEach ( n -> xrange ( 1 , n + 1 ) . forEach ( x -> {
    IntStream . range ( 0 , k ) . forEach ( dd -> {
      if ( naivePsuedoSymm ( dd , k , k - i - 1 ) ) return k - i - 1 ;
    }
    ) ;
  }
  ) ;
  throw new IllegalStateException ( "OOPS" ) ;
}
