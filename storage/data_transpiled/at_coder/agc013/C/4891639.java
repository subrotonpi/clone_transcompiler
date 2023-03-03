public static < T > Function < Integer , List < T >> lambda ( int N , int L , int T ) {
  return ( a , m , X , W ) -> lambda ( n -> ( b -> {
    return ( c -> ContainerUtil . find ( b . subList ( c , b . size ( ) + b . subList ( 0 , c ) ) ) ) . orElse ( b . indexOf ( ( X + [ - T , T ] [ W < 2 ] ) ) ) ;
  }
  ) ) ;
}
