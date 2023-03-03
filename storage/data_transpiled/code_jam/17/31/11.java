static final < T > Collection < T > read ( ) {
  final StringBuilder sb = new StringBuilder ( ) ;
  final int b = 10 ;
  if ( __name__ != null ) {
    sb . append ( devtools . name ( ) ) ;
  }
  final Collection < T > result = new ArrayList < > ( ) ;
  final int N = r . readInts ( ) ;
  final int K = r . readArr ( N ) ;
  final List < T > result = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    result . add ( r . readArr ( i ) ) ;
  }
  final Class < ? > class ResWriter implements Runnable {
    final BufferedReader reader = new BufferedReader ( new StringReader ( sb . toString ( ) ) ) ;
    final SolverReader solver = new SolverReader ( reader ) ;
    final Iterator < T > iterator = new Iterator < T > ( ) {
      int i = 0 ;
      @ Override public boolean hasNext ( ) {
        return i > 0 ;
      }
      @ Override public T next ( ) {
        StringBuilder sb = new StringBuilder ( ) ;
        sb . append ( i % b ) ;
        sb . append ( '\n' ) ;
        return iterator . next ( ) ;
      }
      @ Override public void remove ( ) {
        throw new UnsupportedOperationException ( ) ;
      }
    }
    ;
    final StringBuilder sb = new StringBuilder ( ) ;
    while ( i -- > 0 ) {
      sb . append ( sb . toString ( ) ) ;
      sb . append ( '\n' ) ;
    }
    final int best = Integer . MAX_VALUE + 2 * Math . PI * P . get ( i ) . intValue ( ) * P . get ( i ) . intValue ( ) ;
    final boolean first = true ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      sb . append ( i % b ) ;
      sb . append ( ' ' ) ;
    }
    final int best = Integer . MAX_VALUE ;
    final boolean some = false ;
    for ( T row : arr ) {
      if ( first ) {
        first = false ;
      }
      else {
        sb . append ( '\n' ) ;
      }
      sb . append ( row ) ;
      sb . append ( '\n' ) ;
    }
    if ( some && i > 0 ) {
      sb . append ( '\n' ) ;
    }
    sb . append ( best ) ;
  }
  final String in = "test-small-attempt0.in" ;
  final String out = "test-small-attempt0.out" ;
  try {
    final BufferedReader fi = new BufferedReader ( new FileReader ( in ) ) ;
  }
  