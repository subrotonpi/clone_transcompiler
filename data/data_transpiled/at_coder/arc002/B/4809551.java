public static boolean isUruu ( int y ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if (y%4) == 0 */
  if ( y % 100 == 0 ) {
    if ( y % 400 == 0 ) {
      return true ;
    }
    else {
      /*if (y % 100 == 0) {*/
      return false ;
    }
  }
  else {
    /*if (y % m == 0) {*/
    return true ;
  }
}
}
do {
  if ( y % m == 0 && ( y / m ) % d == 0 ) {
    break ;
  }
  d ++ ;
}
return false ;
}
