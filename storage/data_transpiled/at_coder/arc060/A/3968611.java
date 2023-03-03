II ) public static Integer II = new Integer ( input . nextInt ( ) ) {
  private static final long serialVersionUID = - 5748902862977L ;
  private static final long serialVersionUID = - 5748902862977L ;
  private static final long [ ] MI = map ( input . nextInt ( ) , Integer . MAX_VALUE ) ;
  private static long [ ] sumcnt ( int [ ] values ) {
    long [ ] sc = new long [ 50 * 50 + 1 ] ;
    sc [ 0 ] = 1 ;
    long max_sc = 0 ;
    for ( int v : values ) {
      for ( int i = max_sc ;
      i >= 0 ;
      i -- ) sc [ i + v ] += sc [ i ] ;
      max_sc += v ;
    }
    return sc ;
  }
  public static void main ( String [ ] args ) {
    int N = MI . nextInt ( ) ;
    int A = MI . nextInt ( ) ;
    int [ ] ds = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) ds [ i ] = MI . nextInt ( ) - A ;
    int count0 = 0 ;
    int [ ] dp = new int [ N ] , dm = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int d = ds [ i ] ;
      if ( d == 0 ) count0 ++ ;
      else if ( d > 0 ) dp [ i ] = d ;
      else dm [ i ] = - d ;
    }
    Arrays . sort ( dp ) ;
    Arrays . sort ( dm ) ;
    int scp [ ] = sumcnt ( dp ) ;
    int scpmax = dp [ 0 ] ;
    int scm [ ] = sumcnt ( dm ) ;
    int scmmax = dm [ 0 ] ;
    long ans = 0 ;
    for ( int i = 1 ;
    i <= Math . min ( scpmax , scmmax ) ;
    i ++ ) ans += scp [ i ] * scm [ i ] ;
    ans = ans * ( 2 * count0 ) + 2 * count0 - 1 ;
  }
}
