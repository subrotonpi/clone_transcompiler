public static int N ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] S = new String [ N ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    S [ i ] = String . valueOf ( i ) ;
  }
  int cnt = 1 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] . equals ( "+" ) ) {
      cnt ++ ;
    }
    else {
      cnt -- ;
    }
    if ( cnt > L ) {
      res ++ ;
      cnt = 1 ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
