static final boolean isSame ( int n , int n ) {
  psyco . full ( ) ;
  int test = 0 ;
  boolean ok = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dbg ( "test " + ( i + 1 ) ) ;
  }
  boolean isSet = ( ( a >> bit ) & 1 ) > 0 ;
  for ( int test = 0 ;
  test < n ;
  test ++ ) {
    dbg ( "test " + test ) ;
    doTest ( test ) ;
  }
  {
    int [ ] bits = new int [ n ] ;
    for ( int i : xrange ( N ) ) {
      bits [ i ] = i ;
    }
    int bit = bits [ 0 ] ;
    for ( int m2 : masks [ bit ] ) {
      if ( ( m2 | m ) != m ) continue ;
      int r = 1 + doit ( m ^ m2 ) ;
      res = Math . min ( res , r ) ;
    }
    mem [ m ] = res ;
    return res ;
  }
  {
    int i ;
    int j ;
    int k ;
    {
      n = n ;
      k = n ;
      a = readarray ( n , new IntFunction ( ) {
        public int apply ( int x ) {
          return x ;
        }
      }
      ) ;
    }
  }
  {
    boolean ok = false ;
    boolean more = false ;
    boolean less = false ;
    for ( int t : xrange ( k ) ) {
      if ( ( a [ i ] & 1 ) == a [ j ] & 1 ) {
        ok = false ;
        break ;
      }
      if ( ( a [ i ] & 1 ) > a [ j ] & 1 ) {
        more = true ;
      }
      else {
        less = true ;
      }
    }
    if ( ( ok ) && ! ( more && less ) ) {
      good [ ( i ) ] = true ;
    }
  }
  {
    boolean [ ] goodm = new boolean [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ! isSet ) {
        bad [ ( i ) ] = true ;
      }
    }
    {
      boolean [ ] masks = new boolean [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        masks [ j ] = new boolean [ n ] ;
      }
    }
    mem = new boolean [ n ] ;
    for ( int m = 0 ;
    m < goodm . length ;
    m ++ ) {
      if ( ! isSet ) {
        bad [ m ] = true ;
      }
    }
  }
  return ok ;
}
