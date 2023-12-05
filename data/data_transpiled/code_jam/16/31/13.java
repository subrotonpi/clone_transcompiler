{
  A = new A [ 26 ] ;
  for ( int i : xrange ( 26 ) ) {
    A [ i ] = ( char ) ( 'A' + i ) ;
  }
  for ( int nnn : xrange ( 1 , Integer . parseInt ( readLine ( ) ) ) ) {
    System . out . println ( "Case #" + nnn + ":" ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] P = new int [ N ] ;
    for ( String s : readLine ( ) . split ( " " ) ) {
      P [ i ] = Integer . parseInt ( s ) ;
    }
    List < Integer > S = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < P . length ;
    i ++ ) {
      S . add ( P [ i ] ) ;
    }
    Collections . sort ( S ) ;
    if ( S . get ( 0 ) . intValue ( ) > S . get ( 1 ) . intValue ( ) ) {
      System . out . println ( new String ( Arrays . copyOfRange ( S . get ( 0 ) . intValue ( ) , S . get ( 1 ) . intValue ( ) - S . get ( 1 ) . intValue ( ) ) ) + " " ) ;
    }
    for ( int i : xrange ( 2 , S . size ( ) ) ) {
      System . out . println ( new String ( Arrays . copyOfRange ( S . get ( i ) . intValue ( ) , S . get ( i ) . intValue ( ) ) + " " ) ) ;
    }
    System . out . println ( new String ( Arrays . copyOfRange ( S . get ( 0 ) . intValue ( ) , S . get ( 1 ) . intValue ( ) + S . get ( 1 ) . intValue ( ) ) + " " ) ) ;
  }
  return new String ( Arrays . copyOfRange ( A , 1 , S . size ( ) ) ) ;
}
