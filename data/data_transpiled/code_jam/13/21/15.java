@ org . junit . experimental . theories . DataPoints public static void main ( final String [ ] args ) throws IOException {
  final MemoizedSupplier < String > supplier = new MemoizedSupplier < String > ( ) {
    final Map < String , Object > mem = new HashMap < String , Object > ( ) ;
    @ Override public String get ( String arg0 ) {
      if ( ! mem . containsKey ( arg0 ) ) {
        mem . put ( arg0 , supplier . get ( arg0 ) ) ;
      }
      return mem . get ( arg0 ) ;
    }
  }
  ;
  final Function < String , Integer > readInteger = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String arg0 ) {
      return Integer . parseInt ( arg0 ) ;
    }
  }
  ;
  final Function < String , Integer > readInts = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String arg0 ) {
      return Integer . parseInt ( arg0 ) ;
    }
  }
  ;
  class ProblemSolver implements ProblemSolver {
    @ Override public void precalculate ( ) {
    }
    @ Override public void process ( Scanner in , int ncase ) {
      throw new UnsupportedOperationException ( ) ;
    }
    @ Override public void run ( Scanner in , PrintStream out ) {
      int cases = in . nextInt ( ) ;
      for ( int ncase = 0 ;
      ncase < cases ;
      ncase ++ ) {
        System . out . println ( "Case #" + ( nc + 1 ) ) ;
        int data = in . nextInt ( ) ;
        out . println ( "Case #" + ( nc + 1 ) + ": " + data ) ;
      }
    }
  }
  ;
  ProblemSolver ( ) {
    @ Override public void precalculate ( ) {
    }
    @ Override public int run ( Scanner in , int ncase ) {
      int base = in . nextInt ( ) ;
      int N = in . nextInt ( ) ;
      int [ ] motes = readInts . apply ( in ) ;
      Arrays . sort ( motes ) ;
      return Math . min ( solutionGen ( base , motes ) , N ) ;
    }
    @ Override public int run ( int base , int [ ] motes ) {
      int generated = 0 ;
      while ( motes != null ) {
        while ( motes . length > 0 && motes [ 0 ] < base ) {
          base += motes [ 0 ] ;
          motes -- ;
        }
        System . out . println ( generated + motes . length ) ;
        if ( base == 1 ) {
          return 0 ;
        }
        generated ++ ;
        base = base * 2 - 1 ;
        