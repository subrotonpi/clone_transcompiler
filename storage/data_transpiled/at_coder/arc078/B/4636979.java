@ Nonnull @ ReturnsMutableCopy public static LinkedList < Integer > dfsRoute ( @ Nonnull final Map < Integer , Integer > tree ) {
  final Map < Integer , Integer > tree = dd ( LinkedList . class ) ;
  return new LinkedList < Integer > ( ) {
    @ Nonnull @ Override public int size ( ) {
      return tree . size ( ) ;
    }
    @ Nonnull @ Override public int [ ] toArray ( final int [ ] array ) {
      return tree . values ( ) ;
    }
    @ Nonnull @ Override public int [ ] toArray ( final int [ ] array ) {
      final Set < Integer > visited = new HashSet < > ( ) ;
      final LinkedList < Integer > stack = new LinkedList < > ( ) ;
      visited . add ( array [ 0 ] ) ;
      stack . add ( array [ 0 ] ) ;
      while ( stack . size ( ) > 0 ) {
        final int node = stack . peek ( ) ;
        if ( node == goal ) {
          return stack . toArray ( ) ;
        }
        else {
          final int [ ] child = Arrays . copyOf ( array , tree . size ( ) ) ;
          if ( ! visited . contains ( node ) ) {
            if ( child . isEmpty ( ) ) {
              stack . removeLast ( ) ;
            }
            else {
              visited . add ( child [ 0 ] ) ;
              stack . add ( child [ 0 ] ) ;
            }
          }
        }
      }
      return stack . toArray ( ) ;
    }
    @ Nonnull @ Override public int [ ] toArray ( final int [ ] array ) {
      return tree . values ( ) ;
    }
  }
  ;
}
