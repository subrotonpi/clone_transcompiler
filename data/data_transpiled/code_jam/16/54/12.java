public static int _T = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int _t = 1 ;
  _t <= _T ;
  _t ++ ) {
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int L = Integer . parseInt ( scanner . nextLine ( ) ) ;
    String G = scanner . nextLine ( ) ;
    String B = scanner . nextLine ( ) ;
    String res ;
    if ( G . contains ( B ) ) {
      res = "IMPOSSIBLE" ;
    }
    else {
      String res1 ;
      String res2 ;
      if ( L == 1 ) {
        res1 = "?" ;
        res2 = "0" ;
      }
      else {
        res1 = "?" ;
        res2 = "10" + ( L - 1 ) + "?1" ;
      }
      res = StringUtils . rightPad ( res1 , res2 , ' ' ) ;
    }
    System . out . println ( "Case #" + _t + ": " + res ) ;
  }
  return _T ;
}
