static final String print ( ) throws IOException {
  FileReader fi = new FileReader ( "B-large.in" ) ;
  FileWriter fo = new FileWriter ( "B-large.out" ) ;
  int t = Integer . parseInt ( fi . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    String in = fi . readLine ( ) . split ( " " ) ;
    int C = Integer . parseInt ( in . substring ( 0 , 1 ) ) ;
    String [ ] cb = in . substring ( 1 , C + 1 ) . split ( " " ) ;
    in = in . substring ( C + 1 ) ;
    int D = Integer . parseInt ( in . substring ( 0 , 1 ) ) ;
    String [ ] op = in . substring ( 1 , D + 1 ) . split ( " " ) ;
    in = in . substring ( D + 1 ) ;
    int n = Integer . parseInt ( in . substring ( 0 , 1 ) ) ;
    in = in . substring ( 1 ) ;
    String base = "QWERASDF" ;
    Map < String , String > trs = Maps . newHashMap ( ) ;
    for ( String s : cb ) {
      if ( ! ( new HashSet < > ( Arrays . asList ( s . substring ( 0 , 2 ) ) ) . contains ( base ) && ! base . contains ( s ) ) ) {
        throw new IllegalArgumentException ( ) ;
      }
      trs . put ( s . substring ( 0 , 2 ) , s ) ;
      trs . put ( s . substring ( 1 + s . substring ( 0 , 2 ) ) , s ) ;
    }
    Map < String , Set < String >> ops = Maps . newHashMap ( ) ;
    for ( String s : op ) {
      if ( ! ( new HashSet < > ( Arrays . asList ( s . substring ( 0 , 2 ) ) ) . contains ( base ) ) ) {
        throw new IllegalArgumentException ( ) ;
      }
      if ( ops . containsKey ( s ) ) {
        ops . put ( s , s ) ;
      }
      else {
        ops . put ( s , s ) ;
      }
    }
    List < String > r = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      char c = in . charAt ( i ) ;
      if ( r . size ( ) > 0 && trs . containsKey ( r . get ( r . size ( ) - 1 ) + c ) ) {
        r . set ( r . get ( r . size ( ) - 1 ) + c , trs . get ( c