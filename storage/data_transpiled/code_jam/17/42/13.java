@ VisibleForTesting static void solve ( int N , int C , int M , List < Pair < Integer , Integer >> A ) {
  Map < Pair < Integer , Integer > , Integer > numBought = new HashMap < > ( ) ;
  for ( Pair < Integer , Integer > p : A ) {
    numBought . put ( p , 1 ) ;
  }
  Map < Pair < Integer , Integer > , List < Pair < Integer , Integer >>> tickets = new TreeMap < > ( ) ;
  for ( Pair < Integer , Integer > p : A ) {
    tickets . get ( p ) . add ( p ) ;
  }
  for ( Map . Entry < Pair < Integer , Integer > , List < Pair < Integer , Integer >> e : tickets . entrySet ( ) ) Collections . sort ( e . getValue ( ) , new Comparator < Pair < Integer , Integer >> ( ) {
    @ Override public int compare ( Pair < Integer , Integer > o1 , Pair < Integer , Integer > o2 ) {
      return numBought . get ( o1 . getKey ( ) ) . compareTo ( numBought . get ( o2 . getKey ( ) ) ) ;
    }
  }
  ) {
    Collections . sort ( tickets , new Comparator < Pair < Integer , Integer >> ( ) {
      @ Override public int compare ( Pair < Integer , Integer > o1 , Pair < Integer , Integer > o2 ) {
        return numBought . get ( o1 . getKey ( ) ) . compareTo ( numBought . get ( o2 . getKey ( ) ) ) ;
      }
    }
    ) ;
  }
  int R = Collections . max ( numBought . values ( ) ) ;
  int ticketSold = A . size ( ) ;
  for ( int numRides : xrange ( R , ticketSold + 1 ) ) {
    int promos = 0 ;
    int awaitingSeat = 0 ;
    for ( Pair < Integer , Integer > seat : xrange ( N , 0 , - 1 ) ) {
      int new = tickets . get ( seat ) . size ( ) ;
      int rrM = map . get ( seat ) . size ( ) ;
      for ( int tc : xrange ( 1 , 1 + Integer . parseInt ( rr ) ) ) {
        int N = rrM . get ( tc ) ;
        int C = rrM . get ( tc ) ;
        int M = map . get ( tc ) . size ( ) ;
        int zeta = solve ( N , C , M , A ) ;
        String outStr = "Case #" + tc + " : ▁