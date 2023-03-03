private static void prDay ( int y , int m , int d ) {
  System . out . println ( Integer . toString ( y ) . replaceAll ( " " , "" ) + "/" + Integer . toString ( m ) . replaceAll ( " " , "" ) + "/" + Integer . toString ( d ) . replaceAll ( " " , "" ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Y % ( M * D ) == 0 ) {
    prDay ( Y , M , D ) ;
  }
  else {
    int pd = 0 ;
    int ny = Y ;
    int nm = M ;
    int nd = D ;
    do {
      nd ++ ;
      int nc = 0 ;
      switch ( nm ) {
        case 4 : case 6 : case 9 : case 11 : nc = 31 ;
        break ;
        case 2 : if ( ny % 4 == 0 ) {
          if ( ny % 100 == 0 && ny % 400 != 0 ) nc = 29 ;
          else nc = 30 ;
        }
        else nc = 29 ;
        if ( nd == nc ) {
          nd = 1 ;
          nm ++ ;
        }
        break ;
        default : nc = 32 ;
      }
      if ( nd == nc ) {
        nd = 1 ;
        nm ++ ;
        if ( nm == 13 ) {
          nm = 1 ;
          ny ++ ;
        }
      }
    }
    while ( ny % ( nm * nd ) == 0 ) ;
    if ( ny % ( nm * nd ) == 0 ) {
      prDay ( ny , nm , nd ) ;
      break ;
    }
  }
}
