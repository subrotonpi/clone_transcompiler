static final String simulate ( BufferedReader inf ) throws IOException {
  final String [ ] args = new String [ 2 ] ;
  int N = 0 ;
  int init_A = 0 ;
  int cur_B = 0 ;
  while ( Q . hasNext ( ) ) {
    Event ev = new Event ( ) ;
    if ( ev . type == Event . S ) {
      if ( cur_A > 0 ) ++ init_A ;
      else heappush ( "B" , ev . endTime + T ) ;
    }
    else {
      if ( cur_B > 0 ) ++ init_B ;
      heappush ( "A" , ev . endTime + T ) ;
    }
    else {
      if ( ev . station == Event . A ) ++ cur_A ;
      else ++ cur_B ;
    }
  }
  int N = Integer . parseInt ( inf . readLine ( ) . trim ( ) ) ;
  for ( int nc = 1 ;
  nc < N ;
  nc ++ ) {
    final int NA = simulate ( inf . readLine ( ) ) ;
    System . out . println ( String . format ( "Case #%d: %d %d" , nc , NA , NB ) ) ;
    nc ++ ;
  }
  return new String ( args ) ;
}
