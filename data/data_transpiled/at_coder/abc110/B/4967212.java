public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean isnotWar = false ;
  if ( X < Y ) {
    for ( int Z = X + 1 ;
    Z <= Y ;
    Z ++ ) {
      if ( Math . max ( x , Y ) < Z && Math . min ( y , Z ) >= Z ) {
        isnotWar = true ;
      }
    }
  }
  if ( isnotWar ) {
    System . out . println ( "No War" ) ;
  }
  else {
    System . out . println ( "War" ) ;
  }
}
