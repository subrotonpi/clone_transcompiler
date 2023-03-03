static final double getTime ( double [ ] [ ] segments , int S , int R , double runningTime ) {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  /* Get the time of the segments */
  PriorityQueue < Integer > queue = new PriorityQueue < Integer > ( new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  long t = 0 ;
  while ( queue . size ( ) > 0 ) {
    int sdist = queue . poll ( ) ;
    int sspeed = queue . poll ( ) ;
    if ( runningTime > 0 ) {
      double rt = sdist / ( sspeed + R ) ;
      if ( rt <= runningTime ) {
        runningTime -= rt ;
        t += rt ;
      }
      else {
        double remaining = sdist - ( runningTime * ( R + sspeed ) ) ;
        t += runningTime + ( remaining / ( S + sspeed ) ) ;
        runningTime = 0 ;
      }
    }
    else {
      t += ( sdist / ( S + sspeed ) ) ;
    }
  }
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( T ) ;
  i ++ ) {
    int X = Integer . parseInt ( in . readLine ( ) ) ;
    int S = Integer . parseInt ( in . readLine ( ) ) ;
    int R = Integer . parseInt ( in . readLine ( ) ) ;
    int t = Integer . parseInt ( in . readLine ( ) ) ;
    int N = Integer . parseInt ( in . readLine ( ) ) ;
    List < Integer > segments = new ArrayList < Integer > ( N ) ;
    double wdist = 0 ;
    for ( int j = 0 ;
    j < xrange ( N ) ;
    j ++ ) {
      double B = Double . parseDouble ( in . readLine ( ) ) ;
      double E = Double . parseDouble ( in . readLine ( ) ) ;
      double w = Double . parseDouble ( in . readLine ( ) ) ;
      segments . add ( new Integer ( E - B ) ) ;
      wdist += E - B ;
    }
    segments . add ( new Integer ( X - wdist ) ) ;
  }
  double result = getTime ( segments , ( double ) S , ( double ) R , ( double ) t ) ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + result ) ;
  return result ;
}
