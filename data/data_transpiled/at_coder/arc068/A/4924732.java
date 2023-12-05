public static int x ( ) {
  int count = 0 ;
  int a = x / 11 ;
  count += 2 * a ;
  if ( ( x % 11 != 0 ) ) {
    int b = x - 11 * a ;
    if ( ( 1 <= b ) && ( b <= 6 ) ) count ++ ;
    else count += 2 ;
  }
  System . out . println ( count ) ;
  return count ;
}
