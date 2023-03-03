@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  final List < List < Integer >> B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    B . add ( Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  final List < List < Integer >> C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    C . add ( Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  final Map < Integer , Integer > memo = Maps . newHashMap ( ) ;
  final Iterable < Integer > nextGrid = new Iterable < > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        int i = 0 ;
        @ Override public boolean hasNext ( ) {
          return i < 9 ;
        }
        @ Override public Integer next ( ) {
          int i = 0 ;
          @ Override public int next ( ) {
            if ( i == 9 ) {
              List < Integer > next = Lists . newArrayList ( ) ;
              next . add ( i ) ;
              next . add ( turn ) ;
              return next . size ( ) ;
            }
            return next . size ( ) ;
          }
        }
        ;
      }
    }
  }
  ;
  final Map < Integer , Integer > initGrid = Maps . newHashMap ( ) ;
  {
    int scoreT = 0 ;
    int scoreN = 0 ;
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        if ( grid . get ( 3 * i + j ) != - 1 && grid . get ( 3 * i + j ) == grid . get ( 3 * ( i + 1 ) + j ) ) {
          scoreT += B . get ( i ) . get ( j ) ;
        }
      }
    }
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        if ( grid . get ( 3 * i + j ) != - 1 && grid . get ( 3 * i + j ) == grid . get ( 3 * ( i + 1 ) + j ) ) {
          scoreN += C . get ( i ) . get ( j ) ;
        }
      }
    }
    return scoreN + scoreT ;
  }
  private int dfs ( int grid , int turn ) {
    if ( memo . containsKey ( grid ) ) {
      return memo . get ( grid