public static double getDistance ( int T ) {
  int N = Integer . parseInt ( input ) ;
  int V = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  N = Integer . parseInt ( N ) ;
  V = Double . parseDouble ( V ) ;
  X = Double . parseDouble ( X ) ;
  List < Tuple > RC = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    RC . add ( new Tuple ( Double . parseDouble ( input ) ) ) ;
  }
  List < Double > pos = new ArrayList < > ( ) ;
  List < Double > neg = new ArrayList < > ( ) ;
  double rat = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double r = RC . get ( i ) . v1 ;
    double c = RC . get ( i ) . v2 ;
    double t = c - X ;
    if ( t > 0 ) {
      pos . add ( t ) ;
    }
    else if ( t < 0 ) {
      neg . add ( new Double ( - t ) ) ;
    }
    else {
      rat += r ;
    }
  }
  Collections . sort ( pos ) ;
  Collections . sort ( neg ) ;
  while ( pos . size ( ) > 0 && neg . size ( ) > 0 ) {
    double pt = pos . get ( 0 ) . v1 ;
    double pr = pos . get ( 0 ) . v2 ;
    double nt = neg . get ( 0 ) . v1 ;
    double nr = neg . get ( 0 ) . v2 ;
    double dr ;
    if ( pt * pr > nt * nr ) {
      dr = ( nt * nr ) / pt ;
      rat += dr + nr ;
      pos . get ( 0 ) . v1 -= dr ;
      neg . remove ( 0 ) ;
    }
    else {
      dr = ( pt * pr ) / nt ;
      rat += dr + pr ;
      neg . get ( 0 ) . v1 -= dr ;
      pos . remove ( 0 ) ;
    }
  }
  double ans ;
  if ( rat > 0 ) {
    ans = V / rat ;
  }
  else {
    ans = "IMPOSSIBLE" ;
  }
  System . out . println ( "Case #" + T + ": " + ans ) ;
  return ans ;
}
