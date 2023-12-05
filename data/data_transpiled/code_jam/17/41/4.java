static final < T > Iterable < Pair < T , Integer >> solve ( final T [ ] t , final int i ) throws IOException {
  return new Iterable < Pair < T , Integer >> ( ) {
    private final Iterator < Pair < T , Integer >> it = new Iterator < Pair < T , Integer >> ( ) {
      private final Iterator < Pair < T , Integer >> it = new Iterator < Pair < T , Integer >> ( ) {
        private final Iterator < Pair < T , Integer >> it = new Iterator < Pair < T , Integer >> ( ) {
          private final Iterator < Pair < T , Integer >> it = new Iterator < Pair < T , Integer >> ( ) {
            private final Iterator < Pair < T , Integer >> c = it . next ( ) . first ( ) . second ( ) . iterator ( ) ;
            private final Pair < T , Integer > initState = new Pair < T , Integer > ( 0 , it . hasNext ( ) ? it . next ( ) . first ( ) . second ( ) : it . next ( ) . first ( ) . second ( ) ) ;
            @ Override public boolean hasNext ( ) {
              return it . hasNext ( ) ;
            }
            @ Override public Pair < T , Integer > next ( ) {
              Pair < T , Integer > p = it . next ( ) ;
              return p . first ( ) . second ( ) . first ( ) ;
            }
            @ Override public void remove ( ) {
            }
          }
        }
        ;
        @ Override public Iterator < Pair < T , Integer >> iterator ( ) {
          return new Iterator < Pair < T , Integer >> ( ) {
            private final Iterator < Pair < T , Integer >> it = new Iterator < Pair < T , Integer >> ( ) {
              private final Iterator < Pair < T , Integer >> it = new Iterator < Pair < T , Integer >> ( ) {
                private final boolean hasNext = it . hasNext ( ) ;
                @ Override public Pair < T , Integer > next ( ) {
                  Pair < T , Integer > p = it . next ( ) ;
                  return p . first ( ) . second ( ) . first ( ) ;
                }
                @ Override public boolean hasNext ( ) {
                  return it . hasNext ( ) ;
                }
                @ Override public Pair < T , Integer > next ( ) {
                  Pair < T , Integer > p = it . next ( ) ;
                  return p . first ( ) . second ( ) . first ( ) ;
                }
              }
              ;
            }
            @ Override public void remove ( )