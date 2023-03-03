@ org . junit . experimental . theories . DataPoint public static double [ ] [ ] divide ( double area ) {
  final MemoizedSupplier < DoubleArrayList > supplier = new MemoizedSupplier < DoubleArrayList > ( ) {
    private final Map < Double , Double > mem = new HashMap < Double , Double > ( ) ;
    @ Override public Double get ( ) {
      if ( ! mem . containsKey ( ) ) {
        mem . put ( ) ;
      }
      return supplier . get ( ) ;
    }
  }
  ;
  System . out . println ( "Calculation done." ) ;
  try {
    BufferedReader in = new BufferedReader ( new FileReader ( TASK + ".in" ) ) ;
    PrintWriter out = new PrintWriter ( TASK + ".out" , true ) ;
    int cases = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int ncase = 0 ;
    ncase < cases ;
    ncase ++ ) {
      System . out . println ( "Case #" + ( nc + 1 ) ) ;
      double W = ( int ) in . readLine ( ) ;
      int L = ( int ) in . readLine ( ) ;
      int U = ( int ) in . readLine ( ) ;
      int G = ( int ) in . readLine ( ) ;
      int [ ] [ ] Lp = new int [ L ] [ U ] ;
      for ( int i = 0 ;
      i < L ;
      i ++ ) Lp [ i ] [ 0 ] = Integer . parseInt ( in . readLine ( ) ) ;
      for ( int i = 0 ;
      i < U ;
      i ++ ) Up [ i ] [ 0 ] = Integer . parseInt ( in . readLine ( ) ) ;
      int [ ] [ ] Up = new int [ U ] [ U ] ;
      for ( int i = 0 ;
      i < Up . length ;
      i ++ ) Up [ i ] [ 0 ] = Integer . parseInt ( in . readLine ( ) ) ;
      int [ ] X = new int [ G ] ;
      for ( int i = 0 ;
      i < L ;
      i ++ ) Lp [ i ] [ 1 ] = Integer . parseInt ( in . readLine ( ) ) ;
      for ( int i = 0 ;
      i < U ;
      i ++ ) Up [ i ] [ 1 ] = Integer . parseInt ( in . readLine ( ) ) ;
      int [ ] Y = Up [ i ] [ 0 ] - Lp [ i ] [ 1 ] ;
      area = Math . pow ( ( Y . length + 1 ) / 2 , area ) ;
    }
  }
  