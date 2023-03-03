public static int L = Integer . parseInt ( input ) {
  int X = 0 ;
  int Y = 0 ;
  int S = 0 ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = 0 ;
  int AC = 0 ;
  if ( D >= S ) {
    C = D - S ;
    AC = L - C ;
  }
  else {
    AC = S - D ;
    C = L - AC ;
  }
  int VC = X + Y ;
  int VAC = Math . abs ( X - Y ) ;
  if ( X - Y < 0 ) {
    if ( C / VC <= AC / VAC ) {
      System . out . println ( C / VC ) ;
    }
    else {
      System . out . println ( AC / VAC ) ;
    }
  }
  else {
    System . out . println ( C / VC ) ;
  }
  return C ;
}
