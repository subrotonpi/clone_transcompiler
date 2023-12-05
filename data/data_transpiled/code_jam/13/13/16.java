@ VisibleForTesting static Map < Integer , Integer > cardMap ( ) throws IOException {
  final BufferedReader br = new BufferedReader ( new FileReader ( "C-small-1-attempt0.in" ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) ) ;
  final int [ ] nums = {
    2 , 3 , 4 , 5 }
    ;
    final List < Integer > tuples = new ArrayList < > ( ) ;
    for ( int x = 0 ;
    x < T ;
    x ++ ) for ( int y = 0 ;
    y < T ;
    y ++ ) for ( int z = 0 ;
    z < T ;
    z ++ ) tuples . add ( new Integer ( x ) ) ;
    for ( int x = 0 ;
    x < T ;
    x ++ ) tuples . add ( new Integer ( nums [ x ] ) ) ;
    for ( int y = 0 ;
    y < T ;
    y ++ ) tuples . add ( new Integer ( nums [ y ] ) ) ;
    for ( int z = 0 ;
    z < T ;
    z ++ ) tuples . add ( new Integer ( nums [ z ] ) ) ;
    final Map < Integer , Integer > lookup = new HashMap < > ( ) ;
    for ( int t = 0 ;
    t < tuples . size ( ) ;
    t ++ ) lookup . put ( t , t ) ;
    for ( int test = 1 ;
    test <= T ;
    test ++ ) {
      final int R = Integer . parseInt ( br . readLine ( ) ) ;
      final int N = Integer . parseInt ( br . readLine ( ) ) ;
      final int M = Integer . parseInt ( br . readLine ( ) ) ;
      final int K = Integer . parseInt ( br . readLine ( ) ) ;
      System . out . println ( "Case #" + test + ": " ) ;
      for ( int x = 0 ;
      x < R ;
      x ++ ) {
        final List < Integer > prods = new ArrayList < > ( ) ;
        for ( int num = 0 ;
        num < nums [ x ] ;
        num ++ ) {
          prods . add ( Integer . parseInt ( nums [ x ] ) ) ;
        }
        int bestscore = 0 ;
        Integer bestt = null ;
        for ( int t = 0 ;
        t < tuples . size ( ) ;
        t ++ ) {
          int curscore = 1 ;
          for ( int prod : prods ) {
            curscore *= lookup . get ( t ) . get ( prod ) ;
          }
          if ( curscore > bestscore ) {
            bestscore = curscore ;
            bestt = t ;
          }
        }
        