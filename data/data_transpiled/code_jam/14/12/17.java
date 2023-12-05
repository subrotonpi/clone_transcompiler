static private HashMap < String , Integer > parseLine ( String line ) throws Exception {
  BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String [ ] [ ] data = line . split ( " " ) ;
  int tn = Integer . parseInt ( data [ 0 ] [ 0 ] ) ;
  int ln = 1 ;
  for ( int ti = 0 ;
  ti < tn ;
  ti ++ ) {
    int n = Integer . parseInt ( data [ ln ] [ 0 ] ) ;
    int [ ] [ ] graph = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) graph [ i ] = new int [ n ] [ n ] ;
    for ( int j = 0 ;
    j < n - 1 ;
    j ++ ) {
      int a = Integer . parseInt ( data [ ln + 1 + j ] [ 0 ] ) - 1 ;
      int b = Integer . parseInt ( data [ ln + 1 + j ] [ 1 ] ) - 1 ;
      graph [ a ] [ b ] = b ;
      graph [ b ] [ a ] = a ;
    }
    HashMap < String , Integer > dpt = new HashMap < String , Integer > ( ) ;
    /* dp(s, f) {
    }
    */
    if ( ! ( graph [ n - 1 ] == null ) ) {
      ArrayList < HashMap < Integer , Integer >> childsc = new ArrayList < HashMap < Integer , Integer >> ( ) ;
      for ( int b : graph [ n - 1 ] ) {
        if ( b != null ) childsc . add ( dp ( b , s ) ) ;
      }
      int numn = 1 ;
      for ( HashMap < Integer , Integer > sc : childsc ) numn += sc . size ( ) ;
      int chn = childsc . size ( ) ;
      switch ( chn ) {
        case 0 : dpt . put ( ( String ) graph [ n - 1 ] [ 0 ] , new Integer ( numn ) ) ;
        break ;
        case 1 : dpt . put ( ( String ) graph [ n - 1 ] [ 0 ] , new Integer ( numn ) ) ;
        break ;
        default : TreeSet < Integer > gain = new TreeSet < Integer > ( ) ;
        for ( HashMap < Integer , Integer > sc : childsc ) gain . add ( sc . get ( 1 ) - sc . get ( 0 ) ) ;
        dpt . put ( ( String ) graph [ n - 1 ] [ 0 ] , new Integer