public static int W = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  long bunshi = 1 ;
  long bunbo = 1 ;
  for ( int i = 2 ;
  i <= H ;
  i ++ ) {
    bunshi = ( bunshi * i ) % ( 10 * 9 + 7 ) ;
  }
  return bunshi ;
}
