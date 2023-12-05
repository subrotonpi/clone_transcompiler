@ VisibleForTesting static Iterable < Integer > searchAB ( final List < String > sss , int cursor ) {
  int ai = aaa . indexOf ( cursor ) ;
  int tmpCur = bbb . get ( ai ) ;
  int maxCur = sss . indexOf ( 0 , cursor ) ;
  int repeat = 1 ;
  while ( tmpCur < maxCur ) {
    int cur = s . indexOf ( 'a' , tmpCur , maxCur ) ;
    if ( cur == - 1 ) break ;
    ai = aaa . indexOf ( cur , ai ) ;
    tmpCur = bbb . get ( ai ) ;
    repeat ++ ;
  }
  return repeat == maxCur ? Collections . singletonList ( tmpCur + 1 ) : Collections . singletonList ( tmpCur ) ;
}
