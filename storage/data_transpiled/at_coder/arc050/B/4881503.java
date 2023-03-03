public static boolean solve ( int r , int b ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  /* solve the ans */
  int tmp_r = r - ans ;
  int tmp_b = b - ans ;
  int tmp_x = x - 1 ;
  int tmp_y = y - 1 ;
  if ( tmp_r < 0 && tmp_b < 0 ) {
    return false ;
  }
  int cnt = tmp_r / tmp_x + tmp_b / tmp_y ;
  if ( cnt >= ans ) {
    return true ;
  }
  else {
    return false ;
  }
}
