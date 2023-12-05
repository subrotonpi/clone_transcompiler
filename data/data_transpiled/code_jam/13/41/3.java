public static final PairFunction < Integer , List < Integer > , Integer > reader = new PairFunction < Integer , List < Integer > , Integer > ( ) {
  @ Override public Tuple2 < Integer , List < Integer >> call ( Input inFile ) {
    final int numStops = inFile . getInts ( ) ;
    final int numPairs = inFile . getInts ( ) ;
    return new Tuple2 < Integer , List < Integer >> ( numStops , new ArrayList < Integer > ( ) ) {
      @ Override public Integer call ( Integer N , Integer k ) {
        return k * N - ( ( k * ( k - 1 ) ) / 2 ) ;
      }
      @ SuppressWarnings ( "unused" ) @ Override public Integer call ( Integer N , Integer k ) {
        return k * N - ( ( k * ( k - 1 ) ) / 2 ) ;
      }
    }
    ;
  }
  @ Override public String toString ( ) {
    return "PairFunction<Integer,Integer,Integer>" ;
  }
  @ Override public Integer call ( Integer n ) {
    return n ;
  }
  @ Override public Integer call ( Integer n ) {
    int cost = n * n - ( n * n ) ;
    int minCost = 0 ;
    List < Tuple2 < Integer , Integer >> events = new ArrayList < Tuple2 < Integer , Integer >> ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        events . add ( new Tuple2 < Integer , Integer > ( n , j , i , j ) ) ;
      }
    }
    Collections . sort ( events ) ;
    List < Tuple2 < Integer , Integer >> queue = new ArrayList < Tuple2 < Integer , Integer >> ( ) ;
    for ( Tuple2 < Integer , Integer > event : events ) {
      if ( event . _1 == 0 ) {
        queue . add ( new Tuple2 < Integer , Integer > ( event . _1 , event . _2 ) ) ;
      }
      else {
        int numToHandle = event . _2 ;
        while ( ( numToHandle > 0 ) && ( numToHandle < numToHandle ) ) {
          int num = Math . min ( queue . get ( queue . size ( ) - 1 ) . _2 , numToHandle ) ;
          minCost += num * n * n - ( n * n ) ;
          numToHandle -= num ;
          if ( num == queue . get ( queue . size ( ) - 1 ) . _2 ) {
            queue . clear ( ) ;
          }
          else {
            queue . set ( queue . size