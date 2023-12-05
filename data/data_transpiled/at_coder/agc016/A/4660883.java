static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * 9 + 7 ;
/* LI */
for ( String s : System . console ( ) . split ( " " ) ) {
  /* LI_ */
  for ( String s : System . console ( ) . split ( " " ) ) {
    /* LS */
    for ( String s : System . console ( ) . split ( " " ) ) {
      /* II */
      for ( int i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        /* SI */
        String s = s . substring ( i , i + 1 ) ;
      }
    }
  }
  /* SI */
  Scanner input = new Scanner ( System . console ( ) ) ;
  /* main */
  String s = input . next ( ) ;
  Map < Character , Double > charCnt = new HashMap < Character , Double > ( s ) ;
  double res = INF ;
  for ( Character c : charCnt . keySet ( ) ) {
    String r = s . substring ( 0 , s . length ( ) ) ;
    int cnt = 0 ;
    while ( Character . isDigit ( r . charAt ( 0 ) ) ) {
      String t = "" ;
      for ( int i = r . length ( ) - 1 ;
      i >= 0 ;
      i -- ) {
        String ss = charCnt . get ( i ) ;
        if ( ss . contains ( c ) ) {
          t += c ;
        }
        else {
          t += ss . charAt ( 0 ) ;
        }
      }
      cnt ++ ;
      r = t ;
    }
    res = Math . min ( res , cnt ) ;
  }
  return res ;
}
