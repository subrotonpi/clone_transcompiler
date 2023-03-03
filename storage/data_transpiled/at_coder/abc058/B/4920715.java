public static String input ( ) {
  String O = input ( ) ;
  String E = input ( ) ;
  String res = "" ;
  int oCnt = 0 ;
  int eCnt = 0 ;
  do {
    if ( oCnt == O . length ( ) && eCnt == E . length ( ) ) break ;
    if ( oCnt < O . length ( ) ) {
      res += O . charAt ( oCnt ++ ) ;
    }
    if ( eCnt < E . length ( ) ) {
      res += E . charAt ( eCnt ++ ) ;
    }
  }
  while ( true ) ;
  return res ;
}
