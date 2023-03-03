static int makeDir ( String path ) {
  final Map < String , Set < String >> dirs ;
  int c = 0 ;
  String sdir = "/" ;
  Set < String > cur = dirs . get ( sdir ) ;
  for ( int i = 1 ;
  i < path . length ( ) ;
  i ++ ) {
    String s = path . substring ( i , i + 1 ) ;
    sdir = sdir + s ;
    if ( ! cur . contains ( s ) ) {
      cur . add ( s ) ;
      dirs . put ( sdir , new HashSet < String > ( ) ) ;
      c ++ ;
    }
    cur = dirs . get ( sdir ) ;
  }
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    dirs = Maps . newHashMap ( ) ;
    dirs . put ( "/" , new HashSet < String > ( ) ) ;
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int m = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      makeDir ( dirs . get ( i ) ) ;
    }
    c = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      c += makeDir ( dirs . get ( i ) ) ;
    }
    System . out . format ( "Case #%d: %d%n" , t , c ) ;
  }
}
