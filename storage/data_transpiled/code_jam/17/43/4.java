static class Splodey extends Exception {
}
class Map implements Object [ ] {
  int nr , int nc ;
  Map ( String [ ] cells ) {
    int i ;
    int r , c , tc ;
    Map ( String [ ] cells ) {
      this . nr = cells . length ;
      this . nc = cells [ 0 ] . length ;
      cells = new String [ cells . length ] ;
      for ( i = 0 ;
      i < cells . length ;
      i ++ ) cells [ i ] = Collections . singletonList ( cells [ i ] ) ;
    }
  }
  int result ;
  if ( __name__ . equals ( "__main__" ) ) {
    final InputStream is = Thread . currentThread ( ) . getContextClassLoader ( ) . getResourceAsStream ( "__main__.txt" ) ;
    final BufferedReader br = new BufferedReader ( new InputStreamReader ( is ) ) ;
    final String line = br . readLine ( ) . trim ( ) ;
    int num_cases = Integer . parseInt ( line ) ;
    for ( i = 0 ;
    i < num_cases ;
    i ++ ) {
      cells [ r ] = Integer . parseInt ( line ) ;
    }
    int c = Integer . parseInt ( line ) ;
    final int [ ] cells = new int [ 1 ] ;
    for ( i = 0 ;
    i < cells . length ;
    i ++ ) cells [ r ] = Integer . parseInt ( cells [ i ] ) ;
    result = aux ( cover_counts + 1 ) ;
    if ( result != null ) {
      for ( int i = 0 ;
      i < cells . length ;
      i ++ ) {
        cells [ r ] = cells [ i ] ;
      }
    }
    if ( result != null ) {
      for ( int i = 0 ;
      i < cells . length ;
      i ++ ) cells [ r ] = cells [ i ] ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + cells [ i ] ) ;
    }
  }
  return new HashMap ( ) {
    {
      int i = 0 ;
      int i = 0 ;
      int r = 0 ;
      int c = 0 ;
      int [ ] cells = new int [ 1 ] ;
      for ( i = 0 ;
      i < cells . length ;
      i ++ ) cells [ i ] = Integer . parseInt ( cells [ i ] ) ;
      result = solve ( cells ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + cells [ i ] ) ;
    }
  }
  ;
}
