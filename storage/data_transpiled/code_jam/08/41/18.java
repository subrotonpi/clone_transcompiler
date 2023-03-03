@ Test public static String doFile ( String fname , String outfname ) throws IOException {
  String result = doStr ( file ( fname ) . read ( ) ) ;
  file ( outfname , "w" ) . write ( result ) ;
  /* do it */
  String [ ] dat = s . split ( " " ) ;
  int N = Integer . parseInt ( dat [ 0 ] ) ;
  dat = Arrays . copyOf ( dat , dat . length ) ;
  StringBuilder results = new StringBuilder ( ) ;
  for ( int i : xrange ( N ) ) {
    final int M = Integer . parseInt ( dat [ 0 ] ) ;
    final int V = Integer . parseInt ( dat [ 1 ] ) ;
    if ( a == null ) {
      vand = a ;
    }
    else {
      vand = a ;
    }
    if ( a == null ) {
      mor = a ;
    }
    else {
      mor = a ;
    }
    if ( a == null ) {
      vor = a ;
    }
    if ( b == null ) {
      mor = b ;
    }
    if ( a == null ) {
      mor = a ;
    }
    else {
      mor = a ;
    }
  }
  /* do it */
  String exmple = "1\n10001 1\n" + "1 1\n" + "2 1\n" + "500" ;
  String [ ] inner = new String [ ( M - 1 ) / 2 ] ;
  String [ ] outer = new String [ ( M - 1 ) / 2 ] ;
  System . arraycopy ( outer , 0 , inner , 0 , ( M - 1 ) ) ;
  System . arraycopy ( inner , 0 , outer , ( M - 1 ) , ( M - 1 ) ) ;
  Node [ ] nodes = new Node [ outer . length ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    nodes [ i ] = new Node ( outer [ i ] , null , null ) ;
  }
  /* print "final " */
  int res ;
  if ( a == V ) {
    res = 0 ;
  }
  else {
    if ( aa >= 100000 ) {
      res = - 1 ;
    }
    else {
      res = aa ;
    }
  }
  /* print " */
  if ( res == - 1 ) {
    return "Case #" + ind + ": IMPOSSIBLE" ;
  }
  /* print " */
  return exmple ;
}
