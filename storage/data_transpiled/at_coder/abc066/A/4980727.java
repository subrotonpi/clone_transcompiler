public static int [ ] A ( ) {
  A = [ int . valueOf ( i ) for i in input ( ) . split ( ) ] ;
  return print ( sum ( A ) - max ( A ) ) ;
}
