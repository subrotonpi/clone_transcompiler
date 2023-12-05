@ GwtIncompatible ( "HeapDeque" ) static class Dijk {
  private final int n ;
  private final int [ ] [ ] table = new int [ n ] [ n ] ;
  @ Override public void add ( int x , int y , int f ) {
    table [ x ] [ y ] = f ;
  }
  @ Override public void di ( int s ) {
    final int inf = 10 * 20 ;
    val = new int [ n ] ;
    Arrays . fill ( val , inf ) ;
    val [ s ] = 0 ;
    HeapDeque < Integer > h = new HeapDeque < > ( ) ;
    h . offer ( new HeapDeque < > ( 0 , s ) ) ;
    while ( h . size ( ) > 0 ) {
      int q = h . poll ( ) ;
      if ( val [ i ] < q ) {
        continue ;
      }
      for ( int x = 0 ;
      x < table [ i ] . length ;
      x ++ ) {
        h . offer ( x ) ;
      }
    }
  }
}
