static final String print ( final String str , final int radix , final int max ) {
  final int inf = radix - 1 ;
  final double eps = 1.0 / radix ;
  final int mod = radix - 1 ;
  {
    final int li = Integer . parseInt ( str ) ;
    final int LI_ = Integer . parseInt ( str ) - 1 ;
    final int LF = Float . parseFloat ( str ) ;
    final int LS = Float . parseFloat ( str ) ;
    final int I = Integer . parseInt ( str ) ;
    final int F = Float . parseFloat ( str ) ;
    final int S = input . nextInt ( ) ;
    {
      final int n = I ;
      final int a = li ;
      final int [ ] e = new int [ n ] ;
      for ( ;
      ;
      ) {
        int b = LI_ ;
        final int c = LF ;
        e [ b ] = LI_ ;
        e [ c ] = LI_ ;
        e [ c ] = LI_ ;
      }
      if ( n == 2 ) {
        if ( a [ 0 ] == a [ 1 ] ) {
          return "YES" ;
        }
        return "NO" ;
      }
      {
        final int t = 0 ;
        final int ac = a [ c ] ;
        for ( int i = 0 ;
        i < n - 1 ;
        i ++ ) {
          final int d = LI_ ;
          if ( d == p ) {
            continue ;
          }
          final int r = F ( d , c ) ;
          if ( r == 0 && r != 0 ) {
            return "YES" ;
          }
          t += r ;
        }
        if ( t == 0 ) {
          return ac ;
        }
        final int ts = sum ( t ) ;
        final int ma = Math . min ( ts / 2 , ts - max ( t ) ) ;
        final int at = ts - ac ;
        if ( at > ma || at < 0 || at > ac ) {
          return "NO" ;
        }
        return ac - at ;
      }
    }
  }
}
