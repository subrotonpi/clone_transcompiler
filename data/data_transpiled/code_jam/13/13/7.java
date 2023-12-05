static private int [ ] tryAllSets ( int [ ] cur , int N , int M , int K , int [ ] freq ) {
  int dummy = Integer . parseInt ( readLine ( ) ) ;
  R = Integer . parseInt ( readLine ( ) ) ;
  N = Integer . parseInt ( readLine ( ) ) ;
  M = Integer . parseInt ( readLine ( ) ) ;
  K = Integer . parseInt ( readLine ( ) ) ;
  /* Generate the random set of integers */
  int [ ] s = new int [ xrange ( sz ) ] ;
  for ( int i : xrange ( sz ) ) s [ i ] = readLine ( ) . nextInt ( 2 ) ;
  /* Get the random prod */
  int prod = 1 ;
  for ( int i : xrange ( s . length ) ) if ( readLine ( ) . length ( ) == 1 ) prod *= s [ i ] ;
  /* Compute the random freq */
  HashMap < Integer , Integer > freq = new HashMap < Integer , Integer > ( ) ;
  for ( int i : s ) if ( freq . containsKey ( i ) ) freq . put ( i , 1 ) ;
  /* Compute the random freq */
  int avg = 0 ;
  int TIMES = 100 ;
  for ( int i : xrange ( TIMES ) ) {
    int [ ] newProds = new int [ N ] ;
    for ( int j : xrange ( K ) ) newProds [ i ] = rand_prod ( i ) ;
    Collections . sort ( newProds ) ;
    HashMap < Integer , Integer > newFreq = genFreq ( newProds ) ;
    int score = 0 ;
    Set < Integer > keys = new HashSet < Integer > ( freq . keySet ( ) ) ;
    keys . addAll ( newFreq . keySet ( ) ) ;
    for ( Integer k : keys ) {
      int a = freq . get ( k ) ;
      int b = newFreq . get ( k ) ;
      score += ( a - b ) * ( a - b ) ;
    }
    avgScore += score ;
  }
  return ( int [ ] ) avg / ( float ) TIMES ;
}
