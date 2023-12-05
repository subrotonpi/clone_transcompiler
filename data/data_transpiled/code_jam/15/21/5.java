@ Sys public static void main ( String [ ] args ) {
  final Map < Integer , Integer > best = new HashMap < Integer , Integer > ( ) ;
  {
    final ConcurrentLinkedQueue < Integer > queue = new ConcurrentLinkedQueue < Integer > ( ) ;
    final int limit = 1000000 ;
    while ( queue . size ( ) > 0 ) {
      final int i = queue . poll ( ) ;
      final int d = best . get ( i ) ;
      if ( d > limit ) break ;
      if ( ! best . containsKey ( i + 1 ) && i + 1 <= limit * 10 ) {
        best . put ( i + 1 , d + 1 ) ;
        queue . add ( i + 1 ) ;
      }
    }
  }
}
