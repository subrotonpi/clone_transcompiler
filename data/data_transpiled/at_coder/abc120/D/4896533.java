static final class uf {
  private int [ ] table = new int [ n + 1 ] ;
  private int [ ] size = new int [ n + 1 ] ;
  @ Override public void init ( int n ) {
    table [ r1 ] = - 1 ;
    table [ r1 ] = 1 ;
    table [ r1 ] = 1 ;
  }
  @ Override public void merge ( int r1 , int r2 ) {
    table [ r1 ] = r2 ;
    size [ r2 ] += size [ r1 ] ;
    size [ r1 ] = 0 ;
  }
  @ Override public int [ ] findRoot ( int k ) {
    int [ ] path = new int [ n + 1 ] ;
    int curr = k ;
    while ( table [ curr ] != - 1 ) {
      path [ curr ] = 1 ;
      curr = table [ curr ] ;
    }
    return new int [ ] {
      curr , path [ 0 ] }
      ;
    }
    @ Override public void defrag ( int r , int [ ] p ) {
      for ( int i = 0 ;
      i < p . length ;
      i ++ ) {
        table [ p [ i ] ] = r ;
      }
    }
    @ Override public boolean inSameGroup ( int k1 , int k2 ) {
      int r1 = table [ k1 ] , p1 = table [ k1 ] ;
      int r2 = table [ k2 ] , p2 = table [ k2 ] ;
      if ( r1 == r2 ) {
        defrag ( r1 , p1 + p2 ) ;
      }
      else {
        defrag ( r1 , p1 ) ;
        defrag ( r2 , p2 ) ;
      }
      return r1 == r2 ;
    }
    @ Override public String solve ( String string ) {
      int n = Integer . parseInt ( string ) ;
      int m = Integer . parseInt ( string ) ;
      int [ ] ab = new int [ m ] ;
      Arrays . sort ( ab ) ;
      StringBuilder ans = new StringBuilder ( n * ( n - 1 ) / 2 ) ;
      uf ( ) ;
      uf ( ) ;
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        int _b = ab [ i ] ;
        int _a = ab [ i + 1 ] ;
        if ( table . inSameGroup ( _b , _a ) ) {
          ans . append ( ans . charAt ( ans . length ( ) - 1 ) ) ;
        }
        else {
          int r_a = table [ i ] ;
          int p_a = table [ i + 1 ] ;
          int r_b = table [ i + 1 ] ;
          int p_b = table [ i + 1 ] ;
          ans . append ( ans . charAt ( ans . length ( ) -