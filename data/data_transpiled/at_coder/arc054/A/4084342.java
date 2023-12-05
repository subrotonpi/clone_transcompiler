public static int L = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int distance ;
  if ( D - S >= 0 ) distance = D - S ;
  else distance = L - S + D ;
  if ( X - Y <= 0 && X != Y ) System . out . println ( Math . min ( distance / ( X + Y ) , ( L - distance ) / ( Y - X ) ) ) ;
  else System . out . println ( distance / ( X + Y ) ) ;
  return distance ;
}
