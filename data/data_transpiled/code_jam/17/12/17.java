static final Map < Pair < Integer , Integer > , Set < Integer >> cache = new HashMap < Pair < Integer , Integer > , Set < Integer >> ( ) {
  private static final long serialVersionUID = - 5743705268827395184L ;
  private final long serialVersionUID = - 5743705268827395184L ;
  private final Set < Integer > findSizes ( int amount , int req ) {
    if ( ( amount < 0 ) || ( amount > 0 ) ) return cache . get ( new Pair < Integer , Integer > ( amount , req ) ) ;
    int high_est = ( int ) ( amount / ( req * 0.9 ) ) ;
    int low_est = Math . max ( ( int ) ( amount / ( req * 1.1 ) ) , 1 ) ;
    cache . put ( new Pair < Integer , Integer > ( amount , req ) , new HashSet < Integer > ( ) ) ;
    for ( int i : xrange ( low_est , high_est + 1 ) ) if ( req * 0.9 <= ( double ) amount / i <= req * 1.1 ) return cache . get ( new Pair < Integer , Integer > ( amount , req ) ) ;
    return cache . get ( new Pair < Integer , Integer > ( amount , req ) ) ;
  }
  private static long solve ( List < List < Integer >> amounts , List < Integer > recepee , int N , int P ) {
    Graph g = new Graph ( ) ;
    String root = "root" ;
    String sink = "sink" ;
    g . addNode ( root ) ;
    g . addNode ( sink ) ;
    for ( int i : xrange ( P ) ) if ( findSizes ( amounts . get ( 0 ) . get ( i ) , recepee . get ( 0 ) ) . size ( ) > 0 ) g . addEdge ( root , new Edge ( 0 , i ) , new Capacity ( 1 ) ) ;
    for ( int i : xrange ( 1 , N ) ) for ( int j : xrange ( P ) ) for ( int k : xrange ( P ) ) if ( findSizes ( amounts . get ( i - 1 ) . get ( j ) , recepee . get ( i - 1 ) ) & findSizes ( amounts . get ( i ) . get ( k ) , recepee . get ( i ) ) . size ( ) > 0 ) g . addEdge ( new Edge ( i - 1 , j ) , new Edge ( i , k ) , new Capacity ( 1 ) ) ;
    return