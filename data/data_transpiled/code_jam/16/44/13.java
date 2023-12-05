static final Scanner scanner = new Scanner ( System . in ) {
  String ls = System . in . nextLine ( ) ;
  return new Scanner ( ls ) {
    public String [ ] [ ] make ( String [ ] gs , int bm ) {
      String [ ] [ ] g = new String [ gs . length ] [ gs . length ] ;
      for ( int i = 0 ;
      i < gs . length ;
      i ++ ) {
        g [ i ] [ 0 ] = gs [ i ] ;
      }
      int n = g . length ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( ( bm & ( 1 << ( i * n + j ) ) ) != 0 ) {
            if ( g [ i ] [ j ] . equals ( "1" ) ) {
              return null ;
            }
            g [ i ] [ j ] = "1" ;
          }
        }
      }
      return g ;
    }
    private int count ( int bm ) {
      int r = 0 ;
      while ( bm > 0 ) {
        if ( ( bm & 1 ) != 0 ) {
          r ++ ;
        }
        bm >>= 1 ;
      }
      return r ;
    }
    private boolean ok ( String [ ] [ ] g ) {
      int n = g . length ;
      for ( int col = 0 ;
      col < n ;
      col ++ ) {
        Set < Integer > alt = new HashSet < Integer > ( ) ;
        int nw = 0 ;
        for ( int row = 0 ;
        row < n ;
        row ++ ) {
          if ( g [ row ] [ col ] . equals ( "1" ) ) {
            nw ++ ;
            for ( int j = 0 ;
            j < n ;
            j ++ ) {
              if ( j != col && g [ row ] [ j ] . equals ( "1" ) ) {
                alt . add ( j ) ;
              }
            }
          }
        }
        if ( alt . size ( ) >= nw ) {
          return false ;
        }
      }
      return true ;
    }
  }
  ;
}
