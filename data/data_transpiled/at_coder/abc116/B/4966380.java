public static int [ ] getDigits ( ) {
  s = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] arr = new int [ 10 * 6 + 1 ] ;
  arr [ 0 ] = s ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < 10 * 6 + 1 ;
  i ++ ) {
    if ( arr [ i ] % 2 == 0 ) {
      tmp = ( int ) ( arr [ i ] / 2 ) ;
    }
    else {
      tmp = arr [ i ] * 3 + 1 ;
    }
    if ( arr [ i ] >= 0 ) {
      System . out . println ( i + 2 ) ;
      break ;
    }
    arr [ i ] = tmp ;
  }
  return arr ;
}
