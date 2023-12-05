@ VisibleForTesting static void run ( ) {
  final MemoizedSupplier < String > supplier = new MemoizedSupplier < String > ( ) {
    private final Map < String , Integer > mem = new HashMap < > ( ) ;
    @ Override public String get ( String ... args ) {
      if ( ! mem . containsKey ( args [ 0 ] ) ) {
        mem . put ( args [ 0 ] , supplier . get ( args [ 0 ] ) ) ;
      }
      return mem . get ( args [ 0 ] ) ;
    }
    @ Override public String get ( String ... args ) {
      return "__main__" ;
    }
  }
  ;
  final String FILE = new File ( "__main__" ) . getName ( ) ;
  @ SuppressWarnings ( "resource" ) final String [ ] args = new String [ 1 ] ;
  String [ ] args = new String [ 2 ] ;
  args [ 0 ] = "__main__" ;
  System . out . println ( "Filename given: " + args [ 0 ] ) ;
  final String FILE = new String [ args . length - 1 ] ;
  System . out . println ( "Initialization done." ) ;
  final Solver solver = new Solver ( ) {
    @ Override public String get ( ) {
      return FILE ;
    }
    @ Override public void process ( String [ ] args ) {
      throw new UnsupportedOperationException ( ) ;
    }
    @ Override public void run ( Scanner in , int ncase ) {
      throw new UnsupportedOperationException ( ) ;
    }
    @ Override public void run ( Scanner in , PrintStream out ) {
      int cases = Integer . parseInt ( in . nextLine ( ) ) ;
      for ( int ncase = 0 ;
      ncase < cases ;
      ncase ++ ) {
        System . out . println ( "Case #" + ( nc + 1 ) ) ;
        String data = in . nextLine ( ) ;
        out . println ( "Case #" + ( nc + 1 ) + ": " + data ) ;
      }
    }
  }
  ;
  final Solver . Result result = solver . run ( args , nthreads -> nthreads ) ;
  int city_count = Integer . parseInt ( args [ 0 ] ) ;
  final int path_count = Integer . parseInt ( args [ 1 ] ) ;
  final int [ ] endurances = Integer . parseInt ( args [ 2 ] ) ;
  final int [ ] speeds = new int [ city_count ] ;
  for ( int i = 0 ;
  i < city_count ;
  i ++ ) {
    distances [ i ] = readInts ( in ) ;
  }
  final Set <