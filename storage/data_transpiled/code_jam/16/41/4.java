public static void memoize ( BiFunction < Integer , Integer , List < Integer >> f ) {
  Map < Integer , List < Integer >> map = new HashMap < > ( ) ;
  {
    if ( map . containsKey ( a ) ) return ;
    map . put ( a , f . apply ( a ) ) ;
  }
  private List < Integer > solve ( int r , int p , int s , List < Integer > priorities ) {
    int n = r + p + s ;
    if ( n == 1 ) {
      if ( r == 1 ) return new ArrayList < > ( 0 ) ;
      else if ( p == 1 ) return new ArrayList < > ( 1 ) ;
      else if ( s == 1 ) return new ArrayList < > ( 2 ) ;
      assert false ;
    }
    assert n % 2 == 0 ;
    if ( r + p < s || r + s < p || s + p < r ) return null ;
    int low = r + p - s ;
    if ( low % 2 != 0 ) return null ;
    int a = low / 2 ;
    List < Integer > w = Lists . newArrayList ( ) ;
    List < Pair < Integer , Integer >> rr = new ArrayList < > ( ) ;
    Iterator < Integer > it = w . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      rr . add ( new Pair < > ( Collections . singletonList ( it . next ( ) ) , i ) ) ;
    }
    Collections . sort ( rr ) ;
    int [ ] nn = new int [ rr . size ( ) ] ;
    for ( int z = 0 ;
    z < nn . length ;
    z ++ ) {
      nn [ z ] = rr . get ( z ) ;
    }
    List < Integer > nprio = new ArrayList < > ( ) ;
    nprio . add ( 0 ) ;
    nprio . add ( 1 ) ;
    nprio . add ( 2 ) ;
    List < Integer > l = solve ( r - a , a , p - a , nprio ) ;
    if ( l . isEmpty ( ) ) return null ;
    List < Integer > ll = new ArrayList < > ( ) ;
    for ( Integer x : l ) ll . addAll ( w . get ( x ) ) ;
    return ll ;
  }
  private void printSolution ( List < Integer > l ) {
    if ( l . isEmpty ( ) ) {
      System . out . println ( "IMPOSSIBLE" ) ;
      return ;
    }
    System . out . println ( Arrays . toString ( "RPS" . substring ( l . size ( ) ) )