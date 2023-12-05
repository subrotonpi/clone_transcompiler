@ VisibleForTesting static void bfs ( int start , int goal ) {
  int k = Integer . parseInt ( input ( ) ) ;
  double [ ] dis = new double [ k ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) dis [ i ] = Double . MAX_VALUE ;
  bfs ( start , goal ) ;
  Queue < List < Integer >> que = new LinkedList < > ( ) ;
  que . add ( new ArrayList < > ( ) ) ;
  que . add ( new ArrayList < > ( ) ) ;
  que . add ( new ArrayList < > ( ) ) ;
  que . add ( new ArrayList < > ( ) ) ;
  que . add ( new ArrayList < > ( ) ) ;
  que . add ( new ArrayList < > ( ) ) ;
  que . add ( new ArrayList < > ( ) ) ;
  que . add ( new ArrayList < > ( ) ) ;
}
