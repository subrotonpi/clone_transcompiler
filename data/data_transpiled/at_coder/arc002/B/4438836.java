private static int y , int m , int d ;
int [ ] month = {
  - 1 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
  ;
  /* next date */
  d ++ ;
  if ( month [ m ] < d ) {
    m ++ ;
    d = 1 ;
  }
  if ( m > 12 ) {
    y ++ ;
    m %= 12 ;
  }
  /* leapYear */
  if ( y % 400 == 0 ) {
    return true ;
  }
  if ( y % 100 == 0 ) {
    return false ;
  }
  return y ;
}
