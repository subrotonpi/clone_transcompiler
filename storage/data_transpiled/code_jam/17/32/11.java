static final Comparator < Pair < String , Integer >> dist = new Comparator < Pair < String , Integer >> ( ) {
  @ Override public int compare ( Pair < String , Integer > o1 , Pair < String , Integer > o2 ) {
    return ( o2 . first < o1 . second ? o1 . second + 1440 : o2 . first ) - o1 . second ;
  }
  @ Override public int compare ( Pair < String , Integer > o1 , Pair < String , Integer > o2 ) {
    int val = min ( dist ( o1 . first , o2 . first ) , dist ( o1 . second , o2 . first ) ) ;
    return val > 720 ? 4 : 2 ;
  }
  @ Override public int compare ( Pair < String , Integer > o1 , Pair < String , Integer > o2 ) {
    List < Pair < String , Integer >> A = new ArrayList < > ( ) ;
    A . add ( o1 . first + "C" ) ;
    A . add ( o2 . first + "J" ) ;
    int S = 0 , C = Integer . MAX_VALUE , J = Integer . MAX_VALUE ;
    List < Pair < String , Integer >> Bc = new ArrayList < > ( ) , Bj = new ArrayList < > ( ) , Bu = new ArrayList < > ( ) ;
    for ( int i : xrange ( A . size ( ) ) ) {
      Pair < String , Integer > a = o1 . first , b = o2 . first ;
      int d = dist ( a . second , b . first ) ;
      if ( a . second . equals ( b . second ) ) {
        if ( d > 0 ) ( a . second . equals ( "C" ) ? Bc : Bj ) . add ( d ) ;
        else {
          S ++ ;
          if ( d > 0 ) Bu . add ( d ) ;
        }
      }
      boolean fc = C + sum ( Bc ) > 720 ;
      boolean fj = J + sum ( Bj ) > 720 ;
      if ( fc || fj ) {
        List < Pair < String , Integer >> B = ( Bc ) ? Bc : new ArrayList < > ( ) ;
        B . add ( C ) ;
        B . add ( J ) ;
        B . forEach ( x -> X . add ( x ) ) ;
        while ( X . add ( x ) . add ( x ) ) B . remove ( x ) ;
        S += 2 ;
      }
    }
    return S ;
  }
}
