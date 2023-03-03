static final Map < Pair < Integer , Integer > , Integer > CACHE = new HashMap < Pair < Integer , Integer > , Integer > ( ) {
  private static final long serialVersionUID = - 5743705263738203615L ;
  private int count ;
  private int count = 0 ;
  @ Override public int doCount ( int x , int y , Set < Pair < Integer , Integer >> rooks , int h , int w ) {
    Pair < Integer , Integer > k = new Pair < Integer , Integer > ( x , y , rooks , h , w ) ;
    Pair < Integer , Integer > p = new Pair < Integer , Integer > ( x , y ) ;
    if ( CACHE . containsKey ( k ) ) return CACHE . get ( k ) ;
    if ( rooks . contains ( p ) ) return 0 ;
    if ( x > h || y > w ) return 0 ;
    if ( x == h && y == w ) return 1 ;
    count = count ;
    count = count + doCount ( x + 2 , y + 1 , rooks , h , w ) ;
    count = count + doCount ( x + 1 , y + 2 , rooks , h , w ) ;
    count %= 10007 ;
    CACHE . put ( k , count ) ;
    return count ;
  }
  private int doTrial ( Scanner in ) {
    int H = in . nextInt ( ) ;
    int W = in . nextInt ( ) ;
    int R = in . nextInt ( ) ;
    Set < Pair < Integer , Integer >> rooks = new HashSet < Pair < Integer , Integer >> ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      rooks . add ( new Pair < Integer , Integer > ( in . nextInt ( ) , in . nextInt ( ) ) ) ;
    }
    rooks = new LinkedHashSet < Pair < Integer , Integer >> ( rooks ) ;
    synchronized ( CACHE ) {
      CACHE . clear ( ) ;
    }
    return doCount ( 1 , 1 , rooks , H , W ) ;
  }
}
