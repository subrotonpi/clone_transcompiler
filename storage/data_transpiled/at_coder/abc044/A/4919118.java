public static int A = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  int B = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int C = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int X = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  if ( A - B <= 0 ) {
    System . out . println ( A * C ) ;
  }
  else {
    System . out . println ( B * C + ( A - B ) * X ) ;
  }
  return B ;
}
