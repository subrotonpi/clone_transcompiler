public static int Y = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if (y % 400) = 0 */
  /*else if (y % 100) = 0 */
  /*else if (y % 4) = 0*/
  /*else return 0;*/
  int [ ] lims = {
    0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 }
    ;
    while ( M < 13 ) {
      int lim = lims [ M ] ;
      if ( isUruu ( Y ) && M == 2 ) lim ++ ;
      while ( D <= lim ) {
        if ( Y % ( M * D ) == 0 ) {
          System . out . println ( Y + 1 ) ;
          exit ( ) ;
        }
        D ++ ;
      }
    }
    return M ;
  }
  