public static String [ ] [ ] [ ] N = map ( input . nextLine ( ) ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] P_Y = new int [ M ] [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    P_Y [ i ] [ 0 ] = p - 1 ;
    P_Y [ i ] [ 1 ] = y ;
    P_Y [ i ] [ 2 ] = i ;
  }
  Arrays . sort ( P_Y ) ;
  int [ ] [ ] ans_P_Y = new int [ M ] [ 2 ] ;
  int count = 1 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( ( i != 0 ) && ( ( P_Y [ i - 1 ] [ 0 ] == P_Y [ i ] [ 0 ] ) || ( P_Y [ i ] [ 0 ] == P_Y [ i ] [ 0 ] ) ) ) count ++ ;
    else count = 1 ;
    ans_P_Y [ i ] [ 2 ] = P_Y [ i ] [ 2 ] ;
    ans_P_Y [ i ] [ 0 ] = P_Y [ i ] [ 0 ] + 1 ;
    ans_P_Y [ i ] [ 1 ] = count ;
  }
  Arrays . sort ( ans_P_Y ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    String ans = String . valueOf ( ans_P_Y [ i ] [ 1 ] ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) ;
    System . out . println ( ans ) ;
  }
  return ans_P_Y ;
}
