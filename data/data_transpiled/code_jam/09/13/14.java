@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > Supplier < T > memoize ( final Supplier < T > supplier ) {
  final Map < T , AtomicInteger > map = new HashMap < > ( ) ;
  return new Supplier < T > ( ) {
    private final AtomicInteger map = new AtomicInteger ( ) ;
    @ Override public T get ( ) {
      if ( ! map . containsKey ( supplier . get ( ) ) ) {
        map . put ( supplier . get ( ) , supplier . get ( ) ) ;
      }
      return map . get ( supplier . get ( ) ) ;
    }
    @ Override public int [ ] toArray ( ) {
      return map . toArray ( ) ;
    }
    @ Override public int [ ] toArray ( ) {
      return map . values ( ) ;
    }
  }
  ;
}
