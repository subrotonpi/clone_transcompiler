static final String print ( String ... st ) {
  final String [ ] args = new String [ st . length ] ;
  for ( int i = 0 ;
  i < st . length ;
  i ++ ) {
    args [ i ] = "" + st [ i ] ;
  }
  final Generator generator = new Generator ( N , args ) {
    private int a = 0 ;
    private int i = 0 ;
    @ Override public void generate ( int N , List < Integer > l ) {
      int a = 0 ;
      int i = 0 ;
      while ( a < N ) {
        yield ( l . get ( i ++ ) ) ;
        if ( i == l . size ( ) ) {
          i = 0 ;
        }
        a ++ ;
      }
    }
    @ Override public void simulate ( ) {
      List < Integer > l = new ArrayList < > ( ) ;
      for ( int a = 0 ;
      a < N ;
      a ++ ) {
        l . add ( Integer . parseInt ( a ) ) ;
      }
      final int L = l . remove ( 0 ) ;
      final int t = l . remove ( 0 ) ;
      final int N = l . remove ( 0 ) ;
      final int C = l . remove ( 0 ) ;
      printe ( l ) ;
      long sum = 0 ;
      List < Integer > pfactory = new ArrayList < > ( ) ;
      boolean firstBuilt = false ;
      for ( int star : generator . generate ( N , l ) ) {
        if ( sum > t ) {
          pfactory . add ( star ) ;
          if ( ! firstBuilt ) {
            firstBuilt = true ;
            pfactory . add ( ( sum - t ) / 2 ) ;
          }
        }
        sum += star * 2 ;
        printe ( star ) ;
      }
      if ( sum > t ) {
        if ( ! firstBuilt ) {
          pfactory . add ( ( sum - t ) / 2 ) ;
        }
      }
      Collections . sort ( pfactory , Collections . reverseOrder ( ) ) ;
      printe ( "pf" , pfactory ) ;
      for ( int i = 0 ;
      i < L ;
      i ++ ) {
        if ( i >= pfactory . size ( ) ) {
          break ;
        }
        sum -= pfactory . get ( i ) ;
      }
      return ( int ) sum ;
    }
  }
  ;
  if ( className . equals ( "java.util.logging" ) ) {
    for ( int i = 0 ;
    i < Integer . parseInt ( input ) ;
    i ++ ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + simulate ( ) ) ;
    }
    