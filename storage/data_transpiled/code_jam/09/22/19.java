static void f ( File f ) throws FileNotFoundException {
  File g = new File ( "B_1B.in" ) ;
  int n = Integer . parseInt ( f . getAbsolutePath ( ) . substring ( 0 , f . getAbsolutePath ( ) . length ( ) - 1 ) ) ;
  /* nextPermutation(seq, pred) */
  {
    int start = 0 ;
    int end = 0 ;
    if ( end <= start ) {
      return ;
    }
    do {
      seq . next = end ;
    }
    while ( start == end || start + 1 == end ) ;
    start ++ ;
    end -- ;
  }
  if ( seq . length ( ) == 0 ) {
    throw new FileNotFoundException ( "No such sequence or end of " + n ) ;
  }
  try {
    seq . nextToken ( ) ;
  }
  catch ( NoSuchElementException e ) {
    throw new IllegalArgumentException ( "seq must allow random access." ) ;
  }
  int first = 0 ;
  int last = seq . length ( ) ;
  int len = seq . length ( ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( seq . substring ( 0 , first ) ) ;
  if ( last == 1 ) {
    throw new NoSuchElementException ( ) ;
  }
  do {
    int next = last - 1 ;
    do {
      int next1 = next ;
      next -- ;
      if ( pred . compare ( seq . next , seq . next1 ) < 0 ) {
        int mid = last - 1 ;
        while ( ! ( pred . compare ( seq . next , seq . mid ) < 0 ) ) {
          mid -- ;
        }
        seq . next = mid ;
        seq . mid = next ;
        reverse ( seq , next1 , last ) ;
        sb . append ( seq . substring ( next , mid ) ) ;
        break ;
      }
      if ( next == first ) {
        throw new NoSuchElementException ( ) ;
      }
    }
    while ( next == last ) ;
  }
  catch ( NoSuchElementException e ) {
    throw new NoSuchElementException ( ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    String x = f . getAbsolutePath ( ) . substring ( 0 , i ) ;
    int ctr = 1 ;
    String d = null ;
    for ( int p = nextPermutation ( new String ( x ) ) ;
    p > 0 ;
    p -- ) {
      if ( ctr == 0 ) {
        break ;
      }
      d = p ;
      ctr -- ;
    }
    d = sb . toString ( ) ;
    if ( x . equals ( d ) ) {
      d = d . substring ( 0 , d . length ( ) - 1 ) ;
      d =