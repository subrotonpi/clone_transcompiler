static final PriodictDictionary < Integer , String > DIJKSTRA = new PriodictDictionary < Integer , String > ( ) {
  private static final long INF = Long . MAX_VALUE ;
  private final long [ ] [ ] D = new long [ N ] [ N ] ;
  private final long [ ] [ ] P = new long [ N ] [ N ] ;
  private final long [ ] Q = new long [ N ] ;
  {
    Q [ 0 ] = start ;
    int n = G . length ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Q [ i ] = G [ i ] ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      Q [ i ] = Q [ j ] ;
      if ( Q [ j ] == end ) break ;
      for ( int w = 0 ;
      w < n ;
      w ++ ) {
        long vwLength = D [ v ] + G [ v ] [ w ] ;
        if ( Q [ w ] > D [ w ] ) {
          if ( vwLength < D [ w ] ) throw new IllegalArgumentException ( ) ;
        }
        else if ( ! Q [ w ] . contains ( V ) || vwLength < Q [ w ] ) {
          Q [ w ] = vwLength ;
          P [ w ] = v ;
        }
      }
    }
  }
  private long [ ] [ ] fullTimegraph ( ) {
    final int n = Gtable . length ;
    long [ ] [ ] ans = new long [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) ans [ i ] = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final long [ ] result = Dijkstra ( Gtable , i ) ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( result [ j ] > 0 ) ans [ i ] [ j ] = result [ j ] ;
      }
    }
    return ans ;
  }
  private String inname = "input.txt" ;
  private String outname = "output.txt" ;
  try {
    BufferedReader in = new BufferedReader ( new FileReader ( inname ) ) ;
    int cases = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int tc = 1 ;
    tc <= cases ;
    tc ++ ) {
      String [ ] line = in . readLine ( ) . split ( "\\s+" ) ;
      final int N = Integer . parseInt ( line [ 0 ] ) ;
      final