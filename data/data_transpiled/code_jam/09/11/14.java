public static final IgniteRunnable memoize = new IgniteRunnable ( ) {
  private final Map < Integer , IgniteRunnable > map = new HashMap < > ( ) ;
  @ Override public IgniteRunnable run ( ) {
    if ( map . containsKey ( ) ) {
      map . put ( ) ;
    }
    return map . get ( ) ;
  }
  @ Override public String toString ( ) {
    return "Cache memoize closure." ;
  }
  private static final long serialVersionUID = - 5699454124145851381L ;
}
