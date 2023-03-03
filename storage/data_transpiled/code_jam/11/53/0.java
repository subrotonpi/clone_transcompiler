static final String solve ( ) throws IOException {
  int bigrec = 0 ;
  int [ ] P = new int [ 10000 ] ;
  int [ ] R = new int [ 10000 ] ;
  int k ;
  int q ;
  int v ;
  int qlen = q = 0 ;
  while ( ( k = q / ( q = ( q = ( q = ( q = ( j = ( j = ( j = ( j = ( j = ( j = ( j = ( j = ( j ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) {
    P [ i ] = 0 ;
  }
  if ( ( k = q ) == 0 ) return "0" ;
  if ( ( k = q ) == 1 ) return "0" ;
  prevs [ v ] = new int [ k ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    prevs [ i ] = new int [ k ] ;
    prevs [ v ] [ 0 ] = 1 ;
  }
  int j ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    prevs [ i ] = new int [ k ] ;
    prevs [ v ] [ 0 ] = 1 ;
    prevs [ v ] [ 1 ] = 1 ;
  }
  int q ;
  q = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    q = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int w = q [ i ] ;
      if ( w == 0 ) dummy = 17 ;
      else if ( w == 2 ) {
        if ( ! combine ( w [ 0 ] , w [ 1 ] ) ) P [ i ] = j ;
      }
      else P [ j ] = i ;
      if ( ( w == 1 ) && ( R [ j ] == 0 ) ) R [ i ] ++ ;
    }
  }
  /* usage */
  System . out . println ( "probC.py   runs on test data" ) ;
  System . out . println ( "Parsing " + infilename + " to " + outfilename ) ;
  BufferedReader infilereader = new BufferedReader ( new FileReader ( infilename ) ) ;
  BufferedReader outfilereader = new BufferedReader ( new FileReader ( outfilename ) ) ;
  int N = Integer . parseInt ( infilereader . readLine ( ) ) ;
  try {
    opts = getopt ( ) ;
  }
  catch ( java . lang . Exception e ) {
    System . err . println ( e ) ;
    usage ( )