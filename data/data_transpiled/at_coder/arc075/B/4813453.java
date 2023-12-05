public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ a ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean flag = true ;
  Arrays . sort ( l ) ;
  int maxT = 10 * 18 ;
  /* ok */
  int s = k ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    int hp = l [ i ] - c * k ;
    if ( hp > 0 ) s -= - ( - hp / ( b - c ) ) ;
    if ( s < 0 ) return false ;
  }
  /* binarySearch */
  int mid = ( l + r ) / 2 ;
  if ( flag ) {
    return mid ;
  }
  else {
    return - 1 ;
  }
}
