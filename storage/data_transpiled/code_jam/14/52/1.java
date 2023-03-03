public static < P extends Comparable < P > , Q extends Comparable < Q >> PairIterator < P , Q > reader ( Input < P > inFile ) {
  final int N = inFile . readInt ( ) ;
  return new PairIterator < P , Q > ( inFile . getInts ( ) , new PairIterator < Integer , List < Integer >> ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer , List < Integer >> ( ) {
        @ Override public boolean hasNext ( ) {
          return inFile . readInt ( ) != N ;
        }
        @ Override public Integer next ( ) {
          return inFile . readInt ( ) ;
        }
        @ Override public Integer next ( ) {
          return inFile . readInt ( ) ;
        }
        @ Override public void remove ( ) {
        }
      }
      ;
    }
    @ SuppressWarnings ( "unchecked" ) @ Override public int next ( ) {
      int n = monsters . size ( ) ;
      Set < Pair < Integer , Integer >> poss = new HashSet < > ( ) ;
      for ( Pair < Integer , Integer > z : ( Set < Pair < Integer , Integer >> ) monsters ) {
        poss . add ( new Pair < > ( z . first ( ) , 0 ) ) ;
      }
      int j ;
      Set < Pair < Integer , Integer >> g = new HashSet < > ( ) ;
      for ( Pair < Integer , Integer > z : ( Set < Pair < Integer , Integer >> ) poss ) {
        int k = z . first ( ) ;
        for ( int k : z . second ( ) ) {
          if ( ( k == j ) || ( j < n ) ) {
            break ;
          }
        }
      }
      poss . clear ( ) ;
      for ( Pair < Integer , Integer > z : ( Set < Pair < Integer , Integer >> ) g ) {
        if ( ( j < n ) && ( z . second ( ) <= P ) ) {
          poss . add ( new Pair < > ( z . first ( ) , z . second ( ) ) ) ;
        }
      }
      return Math . max ( z . second ( ) , poss . size ( ) ) ;
    }
  }
  ) ;
}
