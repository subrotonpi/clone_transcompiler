static final String prework ( String [ ] argv ) {
  final String msg = "nothing" ;
  final String once = "once" ;
  int n = Integer . parseInt ( input ( ) ) ;
  int l = Integer . parseInt ( input ( ) ) ;
  {
    final int [ ] [ ] con = new int [ raw . length ] [ 1 ] ;
    for ( int i = 0 ;
    i < raw . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < raw [ 0 ] . length ;
      j ++ ) {
        con [ i ] [ j ] = Integer . parseInt ( raw [ i ] [ j ] ) ;
      }
    }
    final int [ ] misaki = con ( input ( ) ) ;
    final int [ ] shota = con ( input ( ) ) ;
    return new String ( ) {
      public int compareTo ( int x ) {
        int ans = 100000 ;
        {
          int [ ] c1 = new int [ n ] ;
          int [ ] c2 = new int [ n ] ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            c1 [ i ] = Integer . parseInt ( g1 [ i ] [ j ] ) ;
            c2 [ i ] = Integer . parseInt ( g2 [ i ] [ j ] ) ;
          }
          return ans ;
        }
        return 0 ;
      }
      public int compareTo ( int x ) {
        int ans = 100000 ;
        {
          int [ ] [ ] g1 = new int [ n ] [ n ] ;
          int [ ] [ ] c2 = new int [ n ] [ n ] ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            c2 [ i ] = Integer . parseInt ( g1 [ i ] [ j ] ) ;
          }
          return ans ;
        }
        if ( tran ( g1 ) != tran ( g2 ) ) return ans ;
        if ( i == l ) return 0 ;
        if ( c1 [ i ] == c2 [ i ] ) ans = Math . min ( ans , _calc ( i + 1 ) ) ;
        if ( c1 [ i ] == n - c2 [ i ] ) {
          g2 [ i ] = new int [ n ] [ 1 ] ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            g2 [ i ] [ i ] = 1 - x ;
            ans = Math . min ( ans , _calc ( i + 1 ) + 1 ) ;
            g2 [ i ] [ i ] = 1 - x ;
          }
          return ans ;
        }
        return 0 ;
      }
    }
    public int flip ( ) {
      return ans != 100000 ? 0 : -