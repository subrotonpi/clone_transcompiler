static final String readString ( Reader in , int ... shape ) {
  final String s = in . readString ( ) ;
  final Set < String > whitespaces = new HashSet < > ( Arrays . asList ( string . whitespace ( ) . split ( s ) ) ) ;
  {
    final char [ ] readWord = new char [ shape . length ] ;
    in . read ( Arrays . copyOf ( shape , shape . length ) ) ;
    final char [ ] [ ] it = s . toCharArray ( ) ;
    for ( char c : it ) {
      if ( ! whitespaces . contains ( c ) ) {
        readWord [ 0 ] = c ;
      }
    }
    return readWord ;
  }
  private int [ ] [ ] arr ( int ... length ) {
    switch ( length ) {
      case 1 : return new int [ length ] [ ] ;
      case 2 : return new int [ length ] [ ] ;
      case 3 : return Arrays . copyOf ( Arrays . copyOfRange ( Arrays . copyOf ( it , length ) , 0 ) , length ) ;
    }
  }
  private int [ ] [ ] arr ( int ... length ) {
    return new int [ length ] [ ] ;
  }
  public static void debug ( Map < Integer , Integer > map ) {
    System . err . println ( Arrays . toString ( arr ) ) ;
  }
  public static void main ( String [ ] args ) {
    int n = read ( Integer . class ) ;
    final Map < Integer , Integer > G = new TreeMap < > ( ) ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      int a = read ( Integer . class , 2 ) ;
      int b = read ( Integer . class , 2 ) ;
      G . put ( a , b ) ;
      G . put ( b , a ) ;
    }
    final int MOD = 1000000000 + 7 ;
    {
      int w = 1 , b = 1 ;
      for ( int node : G . get ( cur ) ) {
        if ( node != prev ) {
          int wChild = dfs ( node , cur ) ;
          int bChild = dfs ( node , cur ) ;
          w *= ( wChild + bChild ) % MOD ;
          w %= MOD ;
          b *= wChild ;
          b %= MOD ;
        }
      }
    }
  }
}
