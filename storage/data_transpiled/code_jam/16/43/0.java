if ( 1 ) {
  @ SuppressWarnings ( "unchecked" ) final Map < String , Integer > map = new HashMap < > ( ) ;
  final int xr = xrange ;
  {
    final int i = 0 ;
    final int j = 0 ;
    final int ni = map . get ( i ) ;
    final int nj = map . get ( j ) ;
    {
      assert i == j ;
    }
    if ( j == - 1 ) {
      assert i == j ;
      return c + r + 1 - j ;
    }
    if ( j == - 1 ) {
      assert i == j ;
      return c + r + 1 - i ;
    }
    {
      final int cas = i < j ? 1 : - 1 ;
      System . out . println ( "Case #" + cas + ":" ) ;
      final int r = parts ( ) ;
      final int [ ] vals = parts ( ) ;
      final IntPair pair = new IntPair [ r ] ;
      for ( i = xrange ( 0 , r ) ;
      i < r ;
      i ++ ) {
        int a = vals [ i ] ;
        a -- ;
        b -- ;
        pairs [ a ] = pair . get ( a ) ;
        pair . set ( a ) ;
      }
      return ans ;
    }
    {
      final int i = 0 ;
      final int j = pairs . length ;
      {
        final int a = pairs [ i ] . x ;
        if ( j < c ) {
          assert i == j ;
        }
        if ( j == - 1 ) {
          assert i == j ;
        }
        if ( j == c ) {
          assert i == j ;
        }
        assert i == j ;
        return i == j ;
      }
    }
    {
      final int mask = pairs [ 0 ] . x ;
      if ( mask == 1 ) {
        return i ;
      }
      if ( j == r ) {
        assert i == j ;
      }
      if ( j == - 1 ) {
        assert i == j ;
      }
      if ( j == j ) {
        assert i == j ;
      }
      if ( j == j ) {
        assert i == j ;
      }
      if ( j == j ) {
        assert i == j ;
      }
      if ( j == j ) {
        assert i == j ;
      }
      if ( j == j ) {
        assert i == j ;
        return i == j ;
      }
    }
    {
      final int [ ] [ ] memo = new int [ r ] [ ] ;
      @ SuppressWarnings ( "unchecked" ) final int key = pairs . length ;
      for ( int a = 0 ;
      a < r ;
      ++ a ) {
        final int b = pairs [ a ] [ b ] ;
        if ( j != 0 ) {
          assert