static final < T > void main ( final Consumer < ? super T > reader , final Consumer < ? super T > solver , int threads ) throws Exception {
  final class StreamReader {
    @ Override public void init ( final InputStream stream ) throws IOException {
      super . tokens ( ( ) -> {
        final Stream . of ( stream ) . forEach ( token -> {
          final Stream . of ( token ) . forEach ( subtype -> {
            if ( type instanceof List < ? > ) {
              return Arrays . stream ( ( List < ? > ) subtype ) . map ( subtype -> subtype . stream ( ) ) . collect ( Collectors . toList ( ) ) ;
            }
          }
          ) ;
        }
        ) ;
      }
    }
    @ Override public T [ ] accept ( final Class < ? > type ) throws IOException {
      return ( T [ ] ) Array . newInstance ( type , 1 ) ;
    }
  }
  {
    @ Override public void jam ( final Consumer < ? super T [ ] > consumer , final Consumer < ? super T [ ] > solver , final int threads ) throws IOException {
      final StreamTokenizer streamTokenizer = new StreamTokenizer ( System . in ) ;
      final int T = streamTokenizer . nextToken ( ) ;
      final Stream < T > inputs = new Stream < T > ( ) ;
      for ( int i = xrange ( T ) ;
      i < T ;
      i ++ ) inputs . add ( reader . accept ( streamTokenizer ) ) ;
      final Consumer < ? super T [ ] > mapper ;
      if ( threads > 0 ) {
        pool = new ForkJoinPool ( threads ) ;
        mapper = pool . accept ( new Consumer < T [ ] > ( ) {
          @ Override public void accept ( T [ ] args ) {
          }
        }
        ) ;
      }
      else {
        mapper = map ;
      }
      final Consumer < ? super T [ ] > applicator = args -> solver . accept ( args ) ;
      final List < T [ ] > answers = mapper . accept ( applicator , inputs ) ;
      for ( int i = 0 ;
      i < answers . size ( ) ;
      i ++ ) {
        System . out . printf ( "Case #%d:%n" , i + 1 , answers . get ( i ) ) ;
      }
    }
  }
}
