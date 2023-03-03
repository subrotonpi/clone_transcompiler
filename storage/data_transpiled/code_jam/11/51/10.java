@ VisibleForTesting static Iterable < String > solve ( ) {
  final Iterable < String > p1 = Lists . newArrayList ( ) ;
  final Iterable < String > p2 = Lists . newArrayList ( ) ;
  final Class < ? > gcj = Class . forName ( "java.util.zip.GList" ) ;
  final InputStream IN = System . in ;
  final StringBuffer buf = new StringBuffer ( ) ;
  final int cur_case = 0 ;
  @ Override public String id ( ) {
    return "GList" ;
  }
  @ Override public String read ( ) {
    return buf . toString ( ) ;
  }
  @ Override public int [ ] read ( ) {
    int [ ] P ;
    int n = P . size ( ) ;
    int res = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] a = P . get ( i - 1 ) ;
      int [ ] b = P . get ( 0 ) - a [ 0 ] ;
      int [ ] sy = a [ 1 ] ;
      int [ ] dres = sy ;
      for ( int j = 0 ;
      j < dres . length ;
      j ++ ) {
        int [ ] a = P . get ( i - 1 ) ;
        int [ ] b = P . get ( i ) ;
        int [ ] dx = b [ 0 ] - a [ 1 ] ;
        int [ ] sy = a [ 1 ] ;
        int [ ] sx = sx [ 2 ] ;
        for ( int j = 0 ;
        j < sx . length ;
        j ++ ) {
          int [ ] sx = sx [ 1 ] ;
          for ( int k = 0 ;
          k < sx . length ;
          k ++ ) {
            sx [ 2 ] = sy [ k ] - a [ k ] ;
          }
          int [ ] sx = sx [ 2 ] ;
          for ( int k = 0 ;
          k < sx . length ;
          k ++ ) {
            int [ ] sx = sx [ 1 ] ;
            for ( int k = 0 ;
            k < sx . length ;
            k ++ ) {
              sx [ 2 ] = sy [ k ] - a [ k ] ;
            }
          }
        }
      }
      return res ;
    }
    @ Override public String line ( ) {
      String line = gcj . tokens ( 4 , int . class ) ;
      int l = P . size ( ) ;
      int [ ] sx = new int [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        int [ ] sx = sx [ 1 ] ;
        for ( int k = 0 ;
        k < sx . length ;
        k ++ ) {
          