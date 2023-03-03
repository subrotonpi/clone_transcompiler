public static void print ( int N = Integer . parseInt ( input ) ) {
  TreeSet < Pair < Integer , Integer >> balls = new TreeSet < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) balls . add ( Pair . of ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int maxmin = balls . get ( balls . size ( ) - 1 ) . first ;
  int minmin = balls . get ( 0 ) . first ;
  int maxmax = Math . max ( balls . size ( ) , maxmax ) ;
  int minmax = Math . min ( balls . size ( ) , minmax ) ;
  int v1 = ( maxmin - minmin ) * ( maxmax - minmax ) ;
  int best = Integer . MAX_VALUE ;
  int curMax = maxmin ;
  for ( Pair < Integer , Integer > b : balls ) {
    if ( b . first > minmax ) {
      best = Math . min ( best , curMax - minmax ) ;
      break ;
    }
    best = Math . min ( best , curMax - b . first ) ;
    curMax = Math . max ( curMax , b . second ) ;
  }
  int v2 = ( maxmax - minmin ) * best ;
  System . out . println ( Math . min ( v1 , v2 ) ) ;
}
