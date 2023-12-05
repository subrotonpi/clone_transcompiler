@ VisibleForTesting static < T > UF < T > of ( int N ) {
  {
    int [ ] id = new int [ N ] ;
    int [ ] count = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    Arrays . fill ( id , - 1 ) ;
    Arrays . fill ( rank , - 1 ) ;
    Arrays . fill ( rank , - 1 ) ;
    Arrays . fill ( rank , - 1 ) ;
    Arrays . fill ( symbolToIndex , N ) ;
    Arrays . fill ( indexToSymbol , N ) ;
    UF < T > components = new UF < T > ( ) {
      @ Override public int find ( T p ) {
        if ( p instanceof Integer && p < N && ! indexToSymbol . containsKey ( p ) ) {
          symbolToIndex . put ( p , p ) ;
          indexToSymbol . put ( p , p ) ;
        }
        else {
          return super . find ( p ) ;
        }
      }
    }
    ;
    components . sort ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      components . union ( i , j ) ;
      if ( components . connected ( 0 , 1 ) ) {
        return super . find ( i ) ;
      }
    }
    int tc = Integer . parseInt ( input ( ) ) ;
    for ( int i = 0 ;
    i < tc ;
    i ++ ) {
      int res = run ( ) ;
      System . out . printf ( "Case #%d: %f%n" , i + 1 , res ) ;
    }
    {
      symbolToIndex . computeIfAbsent ( p , k -> new Integer ( id [ k ] ) ) ;
      indexToSymbol . computeIfAbsent ( id [ k ] , k -> new Integer ( id [ k ] ) ) ;
    }
    int i = symbolToIndex . get ( p ) ;
    if ( i >= N ) {
      throw new IndexOutOfBoundsException ( "You have been exceeding the UF capacity" ) ;
    }
    int [ ] id = id ;
    while ( i != id [ i ] ) {
      id [ i ] = id [ id [ i ] ] ;
      i = id [ i ] ;
    }
    return super . count ( ) ;
  }
  @ Override public boolean connected ( T p , T q ) {
    return find ( p ) == find ( q ) ;
  }
  @ Override public void union ( T p , T q ) {
    int [ ] id = id ;
    int [ ] rank = rank ;
    int i = find ( p ) ;
    int j =