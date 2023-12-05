public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  A = [ int [ ] . valueOf ( i ) for i in input ( ) . split ( ) ] ;
  return N - ( max ( A ) - min ( A ) ) ;
}
