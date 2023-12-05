public static double l ( ) {
  double x , y , s , d = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans ;
  if ( s <= d ) {
    k = d - s ;
  }
  else {
    k = d - s + l ;
  }
  if ( x < y ) {
    ans = Math . min ( k / ( y + x ) , ( l - k ) / ( y - x ) ) ;
  }
  else {
    ans = k / ( x + y ) ;
  }
  return ans ;
}
