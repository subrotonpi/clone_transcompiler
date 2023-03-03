@ org . junit . experimental . theories . DataPoint public static void main ( final String [ ] args ) throws IOException {
  final MemoizedSupplier < HashMap < String , Double >> supplier = new MemoizedSupplier < HashMap < String , Double >> ( ) {
    private final HashMap < String , Double > mem = new HashMap < String , Double > ( ) ;
    @ Override public Double get ( String key ) {
      if ( ! mem . containsKey ( key ) ) {
        mem . put ( key , supplier . get ( key ) ) ;
      }
      return mem . get ( key ) ;
    }
    @ Override public int size ( ) {
      return Integer . parseInt ( supplier . get ( ) ) ;
    }
    @ Override public int size ( ) {
      return 1 ;
    }
  }
  ;
  final IntStream . of ( args ) . map ( input -> {
    final String TASK = getFileName ( ) ;
    System . out . println ( "Task " + TASK ) ;
    final IntStream . of ( args ) . map ( input -> {
      final int price = input . nextInt ( ) ;
      final int usedFlow = Math . min ( cost , totalFlow ) ;
      totalFlow += price * usedFlow ;
      return price ;
    }
    ) . forEach ( ( flow , cost ) -> {
      final int usedFlow = cost / totalFlow ;
      cost = cost ;
      return cost > usedFlow ;
    }
    ) ;
  }
  ) . filter ( input -> input . contains ( FILE ) ) . map ( input -> input . contains ( FILE ) ) . map ( input -> input . split ( " " ) ) . forEach ( ( input , output ) -> {
    final int cases = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
    for ( int ncase = 0 ;
    ncase < cases ;
    ncase ++ ) {
      System . out . println ( "Case #" + ( nc + 1 ) ) ;
      final double data = cost ;
      final double [ ] [ ] sources = new double [ N ] [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        sources [ i ] = input . split ( " " ) ;
      }
      for ( int i = 0 ;
      i < sources . length ;
      i ++ ) {
        sources [ i ] [ 0 ] = Double . parseDouble ( sources [ i ] [ 1 ] ) ;
      }
      final int hots = cost ;
      final int colds = cost ;
      final double [ ] norms = cost ;
      totalFlow = cost ;
      cost = cost ;
    }
  }
  ) ;
  