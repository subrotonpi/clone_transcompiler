public static final Iterable < Tuple7 < Integer , Integer >> reader = new Iterable < Tuple7 < Integer , Integer >> ( ) {
  @ Override public Iterator < Tuple7 < Integer , Integer >> iterator ( ) {
    return new Iterator < Tuple7 < Integer , Integer >> ( ) {
      @ Override public boolean hasNext ( ) {
        return true ;
      }
      @ Override public Tuple7 < Integer , Integer > next ( ) {
        return inFile . getInts ( ) ;
      }
    }
    ;
  }
  private static final int N = 10 * 9 + 7 ;
  private final int [ ] fc = new int [ N ] ;
  private final int [ ] fc2 = new int [ N ] ;
  {
    for ( int z : fc ) {
      fc2 [ z ] = Math . pow ( z , N - 2 , N ) ;
    }
    private static final int [ ] combin = new int [ ] {
      1 , 2 , 3 }
      ;
      private final int [ ] w = new int [ ] {
        - 1 , 0 , 1 , 1 , 3 }
        ;
        private final int [ ] a = new int [ ] {
          1 , 2 , 3 }
          ;
          private final int [ ] b = new int [ ] {
            1 , 2 , 3 }
            ;
            private final int [ ] a = new int [ ] {
              1 , 2 , 3 }
              ;
              @ Override public int next ( ) {
                return a [ 0 ] + a [ 1 ] + b [ 2 ] ;
              }
              @ Override public int next ( ) {
                return a [ 0 ] + a [ 1 ] + b [ 2 ] ;
              }
            }
            ;
            public final int next ( ) {
              return ( a [ 0 ] + a [ 1 ] + a [ 2 ] + b [ 3 ] ) % N ;
            }
            private final int [ ] a = new int [ ] {
              1 , 2 , 3 }
              ;
              private final int [ ] b = new int [ ] {
                1 , 2 , 3 }
                ;
                private final int [ ] a = new int [ ] {
                  1 , 2 , 3 }
                  ;
                  @ Override public final int next ( ) {
                    return a [ 0 ] + a [ 1 ] + a [ 2 ] + a [ 3 ] + a [ 3 ] + a [ 4 ] + a [ 5 ] + a [ 6 ] + a [ 5 ] + a [ 6 ] + a [ 7 ] + b [ 7 ] ;
                  }
                  @ Override public final Tuple7 < Integer , Integer > getTuple7 ( ) {
                    return new Tuple7 < Integer , Integer > ( )