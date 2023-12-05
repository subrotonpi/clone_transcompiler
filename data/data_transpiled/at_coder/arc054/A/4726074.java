public static int L = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = 0 ;
  if ( D == S ) {
    t = 0 ;
  }
  else if ( D > S ) {
    if ( X >= Y ) {
      t = ( D - S ) / ( X + Y ) ;
    }
    else {
      int s = ( D - S ) / ( X + Y ) ;
      int r = ( S - D ) / ( Y - X ) ;
      t = Math . min ( s , r ) ;
    }
  }
  System . out . println ( t ) ;
  return t ;
}
