@ GwtIncompatible ( "collections.collections.Iterable" ) public static < T > void main ( String ... argv ) {
  final Case Case < T > Case = new Case < T > ( ) {
    @ Override public T readCase ( BufferedReader in ) throws IOException {
      int blocks = Integer . parseInt ( next ( ) ) ;
      List < T > naomi = new ArrayList < T > ( readFloats ( in ) ) ;
      List < T > ken = new ArrayList < T > ( readFloats ( in ) ) ;
      assert blocks == ken . size ( ) == naomi . size ( ) ;
      return Case . of ( naomi , ken ) ;
    }
    @ Override public String solvecase ( T testCase ) {
      T naomi = testCase . naomi ;
      T ken = testCase . ken ;
      return String . format ( "%d %d" , liewar ( ken , naomi ) , war ( ken , naomi ) ) ;
    }
    private int war ( T ken , T naomi ) {
      int kenwins = 0 ;
      int kencursor = 0 ;
      for ( T nweight : naomi ) {
        while ( kencursor < ken . size ( ) ) {
          if ( ken . get ( kencursor ) > nweight ) {
            kenwins ++ ;
            kencursor ++ ;
            break ;
          }
          else {
            kencursor ++ ;
          }
        }
      }
      return ken . size ( ) - kenwins ;
    }
    @ Override public int liewar ( T ken , T naomi ) {
      return ken . size ( ) - war ( naomi , ken ) ;
    }
    @ Override public List < T > readFloats ( BufferedReader in ) throws IOException {
      return Lists . newArrayList ( readFloats ( in ) ) ;
    }
  }
  ;
  new Main ( argv ) . run ( ) ;
}
