public static int tcou = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int tnum = 0 ;
  tnum < tcou ;
  tnum ++ ) {
    int B = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int M = Integer . parseInt ( scanner . nextLine ( ) ) ;
    System . out . println ( "Case #" + ( tnum + 1 ) + ":" ) ;
    if ( 2 * ( B - 2 ) < M ) {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
    else {
      System . out . println ( "POSSIBLE" ) ;
      for ( int i = 0 ;
      i < B ;
      i ++ ) {
        String S = StringUtils . leftPad ( j <= i ? "0" : "1" , B - 1 ) ;
        String t = "#" ;
        if ( i == 0 ) {
          t = "1" ;
        }
        else if ( i == B ) {
          t = "0" ;
        }
        else {
          if ( ( M - 1 ) & ( 2 * ( i - 1 ) ) != 0 ) {
            t = "1" ;
          }
          else {
            t = "0" ;
          }
        }
        System . out . println ( S + t ) ;
      }
    }
  }
  return tcou ;
}
