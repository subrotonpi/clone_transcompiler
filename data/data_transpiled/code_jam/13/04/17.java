@ org . python . Method ( __doc__ = "" ) public static org . python . Object __main__ ( ) {
  xrange range = xrange ;
  copy . IntDict dp = new HashMap ( ) ;
  boolean debug = false ;
  /* main program */
  String in_filename = sys . argv [ 0 ] ;
  String out_filename = sys . argv [ 1 ] ;
  if ( sys . argv . length >= 4 ) debug = true ;
  in_filename = sys . argv [ 2 ] ;
  out_filename = sys . argv [ 3 ] ;
  if ( args . length >= 3 ) {
    /* print out */
    for ( int i = 0 ;
    i < results . length ;
    i ++ ) {
      int num = i + 1 ;
      out . printf ( "Case #%d: %s\n" , num , results [ i ] ) ;
    }
  }
  if ( __name__ . equals ( "__main__" ) ) {
    main ( ) ;
  }
  else {
    /* print out */
    for ( int i = 0 ;
    i < results . length ;
    i ++ ) {
      int k = i ;
      int n = nexts_int ( in ) ;
      int [ ] start_keys = nexts_int ( in ) ;
      Chest [ ] chests = new Chest [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        chests [ j ] = new Chest ( nexts_int ( in ) ) ;
      }
      int answer = solve ( k , n , start_keys , chests ) ;
      results [ i ] = Integer . toString ( answer ) ;
    }
    print_out ( results , out_filename , debug ) ;
  }
  class Chest {
    int [ ] param ;
    int open_type = param [ 0 ] ;
    int t = param [ 1 ] ;
    int [ ] contain_keys = param [ 2 ] ;
  }
  /* print out */
  dp . clear ( ) ;
  String answer = solve ( new String [ 0 ] , start_keys , chests ) ;
  if ( answer . equals ( "" ) ) return "IMPOSSIBLE" ;
  else return answer ;
}
