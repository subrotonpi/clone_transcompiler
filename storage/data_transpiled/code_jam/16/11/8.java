public static int _T = Integer . parseInt ( Scanner in ) {
  for ( int _t = 1 ;
  _t <= _T ;
  _t ++ ) {
    String S = in . next ( ) ;
    String res = "" ;
    for ( char c : S . toCharArray ( ) ) {
      String tmp1 = c + res ;
      String tmp2 = res + c ;
      if ( tmp1 . compareTo ( tmp2 ) > 0 ) res = tmp1 ;
      else res = tmp2 ;
    }
    System . out . println ( "Case #" + _t + ": " + res ) ;
  }
  return _T ;
}
