public static int N = Integer . parseInt ( input ) {
  int cnt = 0 ;
  /* Check if string is valid */
  if ( '3' . equals ( input ) && '5' . equals ( input ) && '7' . equals ( input ) && Integer . parseInt ( input ) <= N ) cnt ++ ;
  if ( cnt >= 10 ) return cnt ;
  return 0 ;
}
