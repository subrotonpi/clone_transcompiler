static final ForkJoinPool < Result > getPool ( ) {
  final ClassLoader loader = Thread . currentThread ( ) . getContextClassLoader ( ) ;
  final MemoizedSupplier < Result > supplier = new MemoizedSupplier < Result > ( ) {
    final Map < Integer , Result > se = Maps . newHashMap ( ) ;
    @ Override public Result get ( ) {
      if ( se . containsKey ( ) ) {
        return se . get ( ) ;
      }
      Result x = supplier . get ( ) ;
      se . put ( ) ;
      return x ;
    }
  }
  ;
  final LinkedHashMap < Integer , Result > sides = Maps . newLinkedHashMap ( 2 * radii ) ;
  List < Integer > keys = Lists . reverse ( sides . keySet ( ) ) ;
  final Result [ ] outs = new Result [ sides . size ( ) ] ;
  curr = new Result [ radii . size ( ) ] ;
  for ( int i = 0 ;
  i < radii . size ( ) ;
  i ++ ) {
    final int r = keys . get ( i ) ;
    do {
      final int x = random . nextInt ( W ) , y = random . nextInt ( L ) ;
      boolean yay = true ;
      for ( int xx = 0 , yy = curr . get ( ) ;
      yy < x ;
      yy ++ , rr = curr . get ( ) ) {
        if ( Math . abs ( xx - x ) < r + rr && Math . abs ( yy - y ) < r + rr ) {
          yay = false ;
          break ;
        }
      }
      if ( yay ) {
        break ;
      }
      curr [ i ] = new Result ( x , y , r ) ;
      outs [ i ] = new Result ( x , y ) ;
    }
    while ( true ) ;
  }
  private String formatAnswer ( int cn , Result answer ) {
    return "Case #" + cn + ": " + StringUtil . join ( answer , " " ) ;
  }
  private List < Result > parseInput ( ) {
    final BufferedReader cin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    final int N = Integer . parseInt ( cin . readLine ( ) ) ;
    for ( int t = 0 ;
    t < N ;
    t ++ ) {
      final int N = Integer . parseInt ( cin . readLine ( ) . trim ( ) ) ;
      final int W = Integer . parseInt ( cin . readLine ( ) . trim ( ) ) ;
      final int L = Integer . parseInt ( cin . readLine ( ) . trim ( ) ) ;
      final List < Result > result = new ArrayList < Result > ( ) ;
      result .