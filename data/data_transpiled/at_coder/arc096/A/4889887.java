public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( A + B >= 2 * C ) ) {
    if ( ( X >= Y ) && ( Y >= X ) ) {
      System . out . println ( C * 2 * Y + ( X - Y ) * Math . min ( A , 2 * C ) ) ;
    }
    else {
      System . out . println ( C * 2 * X + ( Y - X ) * Math . min ( B , 2 * C ) ) ;
    }
  }
  else {
    System . out . println ( A * X + B * Y ) ;
  }
  return A ;
}
