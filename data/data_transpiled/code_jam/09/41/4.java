@ VisibleForTesting static int solve ( ) {
  final Class < ? > gcj = Class . forName ( "gcj" ) ;
  final InputStream IN = gcj . getResourceAsStream ( "/test.txt" ) ;
  int number = 0 ;
  @ Override public String toString ( ) {
    return "Case #" + number + ":" ;
  }
  @ Override public String getLine ( ) {
    return "" ;
  }
  @ Override public Class < ? > type ( ) {
    return type ( ) ;
  }
  @ Override public String getLine ( ) {
    return "" ;
  }
  @ Override public String getLine ( ) {
    return "" ;
  }
  @ Override public String getLine ( ) {
    return "" ;
  }
  @ Override public String [ ] splitLine ( ) {
    return Arrays . copyOfRange ( IN , 0 , 3 ) ;
  }
  @ Override public void go ( ) {
    int t = gcj . getLine ( Integer . MIN_VALUE ) ;
    for ( ;
    ;
    ) {
      int n = gcj . getLine ( Integer . MAX_VALUE ) ;
      int [ ] [ ] data = new int [ n ] [ ] ;
      for ( ;
      ;
      ) {
        data [ 0 ] = new int [ n ] ;
        for ( ;
        ;
        ) {
          data [ 1 ] [ 0 ] = Integer . parseInt ( gcj . getLine ( ) ) ;
        }
        assert data [ 0 ] . length == n ;
      }
      System . out . println ( gcj . getName ( ) + " " + solve ( data ) ) ;
    }
  }
  private int solve ( int [ ] [ ] data ) {
    int res = 0 ;
    int n = data . length ;
    int [ ] gdzie = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] row = data [ i ] ;
      int x = n - 1 ;
      while ( x >= 0 && row [ x ] == 0 ) {
        x -- ;
      }
      gdzie [ i ] = x ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int j = Math . min ( j , data [ i ] . length ) ;
      if ( gdzie [ j ] <= i ) {
        for ( int k = j ;
        k > i ;
        k -- ) {
          gdzie [ k ] = gdzie [ k - 1 ] ;
          res ++ ;
        }
      }
    }
    return res ;
  }
}
