static final Scanner getScanner ( ) {
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > info1 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    info1 . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > info2 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    info2 . add ( Integer . parseInt ( input ) ) ;
  }
  for ( int s = 0 ;
  s < info2 . size ( ) ;
  s ++ ) {
    int t = info2 . get ( s ) ;
    int now = s ;
    int day = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int l = info1 . get ( i ) ;
      int r = info1 . get ( i ) ;
      day ++ ;
      if ( l <= now && now <= r ) {
        if ( l <= t && t <= r ) {
          System . out . println ( day ) ;
          break ;
        }
        else if ( t < l ) {
          now = l ;
        }
        else if ( r < t ) {
          now = r ;
        }
      }
    }
  }
  return new Scanner ( input ) ;
}
