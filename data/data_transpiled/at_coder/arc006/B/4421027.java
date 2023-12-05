public static int n ( String input , int l ) {
  String [ ] line = new String [ l + 1 ] ;
  line [ 0 ] = " " ;
  for ( int i = 0 ;
  i < l + 1 ;
  i ++ ) {
    line [ i ] = new String ( input ) ;
  }
  int posLD = line [ l + 1 ] . indexOf ( "o" ) ;
  /* Route amida */
  if ( width == 1 ) {
    return 1 ;
  }
  else {
    if ( length == 1 ) {
      return ( int ) ( ( n + 2 ) / 2 ) ;
    }
    else {
      if ( n == 0 ) {
        if ( line [ length - 1 ] . charAt ( 1 ) == '-' ) n += 2 ;
      }
      else if ( line [ length - 1 ] . charAt ( n - 1 ) == '-' ) n -= 2 ;
    }
  }
  return 0 ;
}
