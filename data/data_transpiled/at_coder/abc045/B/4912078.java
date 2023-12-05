public static void input ( ) {
  String SA = input ( ) ;
  String SB = input ( ) ;
  String SC = input ( ) ;
  int Aidx = 0 , Bidx = - 1 , Cidx = - 1 ;
  char X = SA . charAt ( 0 ) ;
  int i = 0 ;
  do {
    switch ( X ) {
      case 'a' : Aidx ++ ;
      if ( Aidx == SA . length ( ) ) {
        ans = 'A' ;
        break ;
      }
      X = SA . charAt ( Aidx ) ;
      break ;
      case 'b' : Bidx ++ ;
      if ( Bidx == SB . length ( ) ) {
        ans = 'B' ;
        break ;
      }
      X = SB . charAt ( Bidx ) ;
      break ;
      case 'c' : Cidx ++ ;
      if ( Cidx == SC . length ( ) ) {
        ans = 'C' ;
        break ;
      }
      X = SC . charAt ( Cidx ) ;
      break ;
    }
  }
  while ( i < Aidx ) ;
  System . out . println ( ans ) ;
}
