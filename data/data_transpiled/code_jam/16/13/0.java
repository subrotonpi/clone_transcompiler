@ VisibleForTesting static < T > T solve ( ) {
  Range < T > range = xrange ;
  final Collection < T > buf = new Collection < T > ( ) ;
  class gcj {
    final InputStream IN = System . in ;
    final ByteBuffer buf = null ;
    final Function < T , Integer > identity = new Function < T , Integer > ( ) {
      @ Override public Integer apply ( T t ) {
        return t ;
      }
      @ Override public Integer apply ( T t ) {
        if ( buf != null ) {
          res = buf . getInt ( ) ;
          buf = null ;
        }
        else {
          res = in . readInt ( ) ;
        }
        if ( res == null ) throw new EOFException ( ) ;
        return res ;
      }
      @ Override public int apply ( T t ) {
        return gcj . token ( Integer . MIN_VALUE ) ;
      }
      @ Override public int apply ( T t ) {
        return gcj . token ( t ) ;
      }
    }
    ;
  }
  main ( ) ;
  int t = gcj . token ( Integer . MIN_VALUE ) ;
  for ( ;
  t > 0 ;
  t -- ) {
    print ( gcj . token ( t ) , solve ( ) ) ;
    System . out . flush ( ) ;
  }
  main ( ) ;
}
