public static int Y = Integer [ ] input ( ) {
  int M = 0 , D = 0 ;
  /* if (Y % 400) return true */
  if ( Y % 100 == 0 ) return false ;
  if ( Y % 4 == 0 ) return true ;
  /* else */
  int [ ] day_of_month = {
    0 , 31 , 28 + is_LeapYear ( Y ) , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 }
    ;
    while ( true ) {
      if ( Y % M == 0 && Y / M % D == 0 ) break ;
      D ++ ;
      if ( D > day_of_month [ M ] ) {
        M ++ ;
        D = 1 ;
      }
      if ( M > 12 ) {
        M = 1 ;
        Y ++ ;
      }
    }
  }
  