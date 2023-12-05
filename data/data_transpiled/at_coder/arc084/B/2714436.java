@ VisibleForTesting static void input ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Pair < Integer , Integer >> [ ] adjL = new ArrayList [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    adjL [ i ] = new ArrayList < Pair < Integer , Integer >> ( ) ;
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    adjL [ i ] . add ( new Pair < Integer , Integer > ( ( i + 1 ) % K , 1 ) ) ;
    adjL [ i ] . add ( new Pair < Integer , Integer > ( ( i * 10 ) % K , 0 ) ) ;
  }
  int [ ] cost = new int [ K ] ;
  cost [ 1 ] = 0 ;
  Queue < Pair < Integer , Integer >> Q = new LinkedList < Pair < Integer , Integer >> ( ) ;
  Q . add ( new Pair < Integer , Integer > ( 1 , 0 ) ) ;
  while ( Q . size ( ) > 0 ) {
    int vNow = Q . poll ( ) ;
    int cNow = Q . poll ( ) ;
    if ( vNow == 0 ) break ;
    if ( cNow > cost [ vNow ] ) continue ;
    for ( Pair < Integer , Integer > v2 : adjL [ vNow ] ) {
      int wt = v2 . second ;
      int c2 = cNow + wt ;
      if ( c2 < cost [ v2 ] ) {
        cost [ v2 ] = c2 ;
        if ( wt == 1 ) Q . add ( v2 ) ;
        else Q . add ( v2 ) ;
      }
    }
  }
  System . out . println ( cost [ 0 ] + 1 ) ;
}
