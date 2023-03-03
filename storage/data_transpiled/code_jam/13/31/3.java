@ Sys public static int solve ( ) {
  String s = in . nextLine ( ) ;
  String t = in . nextLine ( ) ;
  t = Integer . parseInt ( t ) ;
  int p = - 1 ;
  int a = 0 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ! s . charAt ( i ) . equals ( "aieuo" ) ) {
      a = a + 1 ;
      if ( a >= t ) p = i + 1 - t ;
    }
    else a = 0 ;
    cnt += p + 1 ;
  }
  int N = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int i : xrange ( N ) ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
  }
  return cnt ;
}
