public static int cntgg ( String [ ] xs ) {
  return cntgg ( xs , 0 ) ;
  /* solve the first sentence */
  int n = Integer . parseInt ( readLine ( ) ) ;
  String [ ] words = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) words [ i ] = readLine ( ) . split ( " " ) ;
  int [ ] [ ] cnts = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) cnts [ i ] [ 0 ] = 0 ;
  for ( String w : words ) cnts [ w ] [ 0 ] ++ ;
  int cnt = 0 ;
  int ans = 1000 * n ;
  int pbm = 0 ;
  for ( int bm = 1 ;
  bm * 2 * n ;
  bm *= 4 ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int pb = pbm >> i & 1 ;
      int b = bm >> i & 1 ;
      if ( pb == b ) continue ;
      for ( String word : words [ i ] ) {
        int pc = cntgg ( cnts [ word ] ) ;
        cnts [ word ] [ pb ] -- ;
        cnts [ word ] [ b ] ++ ;
        int c = cntgg ( cnts [ word ] ) ;
        if ( c != pc ) {
          if ( c == 2 ) cnt ++ ;
          else if ( pc == 2 ) cnt -- ;
        }
      }
    }
    ans = Math . min ( ans , cnt ) ;
    pbm = bm ;
  }
  /* main */
  int tt = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 1 ;
  t <= tt ;
  t ++ ) {
    System . out . printf ( "Case #%d: %d%n" , t , solve ( ) ) ;
  }
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    /* main */
  }
  return ans ;
}
