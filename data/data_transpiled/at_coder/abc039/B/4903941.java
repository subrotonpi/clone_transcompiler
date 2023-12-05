public static int X = Integer . parseInt ( input ) {
  int tmp = 1 ;
  while ( 10 * 9 > tmp ) {
    if ( tmp * 4 == X ) {
      System . out . println ( tmp ) ;
      break ;
    }
    else {
      tmp ++ ;
    }
  }
  return tmp ;
}
