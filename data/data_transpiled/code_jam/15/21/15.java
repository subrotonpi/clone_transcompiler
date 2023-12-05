static final String getLargeString ( ) throws IOException {
  System . nanoTime ( ) ;
  System . setIn ( new FileInputStream ( "A-large.in" ) ) ;
  System . setOut ( new PrintStream ( "A-large.out" ) ) ;
  /* flip the input */
  int n = 100002 ;
  int [ ] f = new int [ n ] ;
  Arrays . fill ( f , 1 ) ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    f [ i + 1 ] = Math . min ( f [ i + 1 ] , f [ i ] + 1 ) ;
    if ( flip ( i ) < n ) f [ flip ( i ) ] = Math . min ( f [ flip ( i ) ] , f [ i ] + 1 ) ;
  }
  /* get check point */
  int l = String . valueOf ( n ) . length ( ) ;
  if ( String . valueOf ( n ) . endsWith ( "0" ) * ( l - l / 2 ) ) {
    /* get check point */
  }
  else {
    int ret = Integer . parseInt ( String . valueOf ( n ) . substring ( 0 , l / 2 ) + "0" * ( l - l / 2 - 1 ) + "1" ) ;
    if ( String . valueOf ( n ) . equals ( "1" + "0" ) ) {
      /* get check point */
      ret = ret - 2 ;
    }
    return ret ;
  }
  /* calc the number of digits */
  if ( n < 100 ) return f [ n ] ;
  int cp = getCheckPoint ( n ) ;
  /* calc the number of digits */
  int n = calc ( flip ( cp ) ) + 1 + n - cp ;
  /* Work the number of digits */
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  /* if (n < 100) return f[n]; */
  /* return calc the number of digits */
  if ( getClass ( ) . getName ( ) . equals ( "java.util.Scanner" ) ) {
    /* print the input */
    System . out . println ( "case #" + ( i + 1 ) + ": " + Work ( n ) ) ;
  }
  System . err . printf ( "completed %.3f\n" , System .