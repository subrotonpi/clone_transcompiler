static final String print ( String str ) {
  final int inf = 10 * 20 ;
  final int mod = 10 * 9 + 7 ;
  {
    final int [ ] [ ] li = str . split ( " " ) ;
    {
      final int [ ] [ ] li = new int [ 3 ] [ 3 ] ;
      {
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) li [ i ] [ 0 ] = Integer . parseInt ( li [ i ] [ 0 ] ) ;
      }
    }
    {
      final int [ ] [ ] li = str . split ( " " ) ;
      {
        final int [ ] [ ] li = new int [ 3 ] [ 3 ] ;
        {
          for ( int i = 0 ;
          i < 3 ;
          i ++ ) li [ i ] [ 1 ] = Integer . parseInt ( li [ i ] [ 1 ] ) ;
        }
      }
    }
    {
      final int [ ] [ ] lf = new int [ 3 ] [ 3 ] ;
      {
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) lf [ i ] = Float . parseFloat ( li [ i ] [ 0 ] ) ;
      }
    }
    {
      final int [ ] ls = new int [ 3 ] [ 3 ] ;
      {
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) ls [ i ] [ 0 ] = Integer . parseInt ( ls [ i ] [ 1 ] ) ;
      }
    }
    {
      final int tt = Integer . parseInt ( str ) ;
      final StringBuilder rr = new StringBuilder ( ) ;
      for ( int ti = 1 ;
      ti <= tt ;
      ti ++ ) {
        final int n = li [ ti ] [ 0 ] ;
        final int k = li [ ti ] [ 1 ] ;
        final int [ ] a = new int [ n ] ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          final int b = li [ ti ] [ 0 ] ;
          final int c = li [ ti ] [ 1 ] ;
          final int m = b * b * Math . PI ;
          final int l = b * 2 * Math . PI * c ;
          a [ k ] = new int [ n ] ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) a [ k ] = b ;
          a [ k ] = m ;
        }
        a [ k ] = l ;
      }
      Arrays . sort ( a ) ;
      int r = 0 ;
      for ( int i = 0 ;
      i < n - k ;
      i ++ ) {
        int tr = a [ i ] [ 1 ] + a [