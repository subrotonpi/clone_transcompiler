public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( X < Y ) {
    System . out . println ( Math . min ( 2 * C * X + ( Y - X ) * B , X * A + Y * B , 2 * C * Y ) ) ;
  }
  else {
    System . out . println ( Math . min ( 2 * C * Y + ( X - Y ) * A , X * A + Y * B , 2 * C * X ) ) ;
  }
  return A ;
}
