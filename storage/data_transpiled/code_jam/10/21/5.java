static final String getDirName ( ) {
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int cs = 1 ;
  cs <= T ;
  cs ++ ) {
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    Set < String > dirs = new HashSet < String > ( ) ;
    dirs . add ( "/" ) ;
    {
      String [ ] path = new String ( System . console ( ) . readLine ( ) . replaceAll ( "\\." , "/" ) . split ( "/" ) ) ;
      String dir = "" ;
      for ( int i = 0 ;
      i < path . length ;
      i ++ ) {
        dir += "/" + path [ i ] ;
        dirs . add ( dir ) ;
      }
    }
    for ( int each = 0 ;
    each < N ;
    each ++ ) {
      String dir = System . console ( ) . readLine ( ) ;
      create ( dir ) ;
    }
    int cnt1 = dirs . size ( ) ;
    for ( int each = 0 ;
    each < M ;
    each ++ ) {
      String dir = System . console ( ) . readLine ( ) ;
      create ( dir ) ;
    }
    int cnt2 = dirs . size ( ) ;
    System . out . format ( "Case #%d: %d%n" , cs , cnt2 - cnt1 ) ;
  }
  return new File ( "." ) . getAbsolutePath ( ) ;
}
