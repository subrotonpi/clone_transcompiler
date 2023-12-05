static final ExecutorService executorService = Executors . newFixedThreadPool ( 3 , new ThreadFactory ( ) {
  final int n = 3 ;
  @ Override public Thread newThread ( Runnable r ) {
    final Map < String , Object > se = Maps . newHashMap ( ) ;
    return new Thread ( r ) {
      @ Override public void run ( ) {
        if ( se . containsKey ( n ) ) {
          return ;
        }
        Object o = r . run ( ) ;
        se . put ( n , o ) ;
      }
    }
    ;
  }
  private int gooey = 0 ;
  private final List < Double > solve ( List < Integer > scores ) {
    final int Z = Integer . valueOf ( scores . size ( ) ) ;
    final List < Double > out = new ArrayList < Double > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final double score = scores . get ( i ) ;
      double low = 0.0 , high = 1.0 ;
      for ( int t : xrange ( 60 ) ) {
        final double mid = ( low + high ) * 0.5 ;
        final double myScore = score + Z * mid ;
        final double zu = Math . max ( 0.0 , ( myScore - qq ) * 1.0 / Z ) ;
        if ( zu + mid < 1.0 ) low = mid ;
        else high = mid ;
      }
      out . add ( mid * 100.0 ) ;
    }
    return out ;
  }
  private final String formatAnswer ( int cn , final List < Double > answer ) {
    return "Case #" + cn + ": " + StringUtil . join ( answer , " " ) ;
  }
  private final List < Pair < Double , Double >> parseInput ( ) {
    final Scanner cin = new Scanner ( System . in ) ;
    final int N = Integer . valueOf ( cin . nextLine ( ) ) ;
    for ( int t : xrange ( N ) ) {
      final double [ ] Q = new double [ N ] ;
      for ( int i = 0 ;
      i < Q . length ;
      i ++ ) Q [ i ] = Double . valueOf ( cin . nextLine ( ) . trim ( ) ) ;
      return new Pair < > ( Q [ 1 ] , ans ) ;
    }
  }
  public static void main ( String [ ] args ) {
    final Options options = new Options ( ) ;
    final int np = options . nprocs ;
    final int skip = options . skip ;
    if ( np != 0 ) {
      ExecutorService pool = Executors . newFixedThreadPool ( np ) ;
      List < Pair < Integer , Integer >> procs = new ArrayList < Pair < Integer ,