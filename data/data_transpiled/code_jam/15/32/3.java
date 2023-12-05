@ Sys public static int from ( ) {
  int i ;
  int t = Integer . parseInt ( in . readLine ( ) ) ;
  for ( i = 1 ;
  i < t ;
  i ++ ) {
    if ( in . regionMatches ( true , i , s , i - i ) ) {
      return i ;
    }
  }
  return 0 ;
}
