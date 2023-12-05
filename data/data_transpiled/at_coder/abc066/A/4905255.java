public static void bells ( ) {
  bells = [ int . valueOf ( i ) for i in input ( ) . split ( ) ] ;
  System . out . println ( sum ( bells ) - max ( bells ) ) ;
}
