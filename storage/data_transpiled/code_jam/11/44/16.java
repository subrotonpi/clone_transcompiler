@ VisibleForTesting static int [ ] solve ( List < List < Integer >> pl ) throws IOException {
  /* Use the shortest path to find the solution */
  int d = 0 ;
  int p = pl . get ( 0 ) . size ( ) ;
  List < Integer > plast = pl . get ( 0 ) . size ( ) ;
  while ( ! p . contains ( 1 ) ) {
    d ++ ;
    Set < Integer > psucc = new HashSet < Integer > ( ) ;
    for ( Integer x : plast ) psucc . addAll ( pl . get ( x ) ) ;
    psucc . removeAll ( p ) ;
    p |= psucc ;
    plast = psucc ;
  }
  /* Solve the solution */
  int rmin = 0 ;
  Stack < Pair < Integer , Set < Integer >>> s = new Stack < Pair < Integer , Set < Integer >>> ( ) ;
  s . push ( new Pair < Integer , Set < Integer >> ( 0 , d , new HashSet < Integer > ( ) , pl . get ( 0 ) . size ( ) | new HashSet < Integer > ( ) ) ) ;
  while ( s . size ( ) > 0 ) {
    p = s . pop ( ) . size ( ) ;
    d = s . pop ( ) . size ( ) ;
    Set < Integer > conquered = s . pop ( ) . get ( 0 ) ;
    int reachable = s . pop ( ) . size ( ) ;
    if ( 1 == reachable ) {
      rmin = Math . max ( rmin , reachable - 1 ) ;
    }
    else if ( d > 0 ) {
      for ( Integer x : pl . get ( p ) ) {
        if ( ! conquered . contains ( x ) ) {
          int nr = reachable | pl . get ( x ) ;
          if ( nr != reachable ) {
            s . push ( new Pair < Integer , Set < Integer >> ( x , d - 1 , conquered . toArray ( new Integer [ 0 ] ) , nr ) ) ;
          }
        }
      }
    }
  }
  /* Solve the solution */
  int [ ] result = new int [ n ] ;
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int n = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int x : xrange ( n ) ) {
    int p = Integer . parseInt ( br . readLine ( ) ) ;
    int w = Integer . parseInt ( br . readLine (