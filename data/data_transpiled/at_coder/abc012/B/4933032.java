public static int s ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = 0 ;
  int m = 0 ;
  int ss = 0 ;
  while ( s >= 3600 ) {
    s -= 3600 ;
    h ++ ;
  }
  if ( h < 10 ) {
    h = "0" + h ;
  }
  return h ;
}
