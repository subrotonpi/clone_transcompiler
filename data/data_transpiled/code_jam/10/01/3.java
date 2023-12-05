public static int tn = Integer . parseInt ( Scanner in ) {
  int loop ;
  for ( loop = xrange ( tn ) ;
  loop < tn ;
  loop ++ ) {
    String n , k ;
    n = in . next ( ) ;
    k = in . next ( ) ;
    n = Integer . parseInt ( n ) ;
    k = Integer . parseInt ( k ) ;
    int x = 2 * n ;
    boolean on = false ;
    if ( k % x == x - 1 ) on = true ;
    System . out . println ( "Case #" + ( loop + 1 ) + ": " + Arrays . asList ( "OFF" , "ON" ) . get ( on ) ) ;
  }
  return loop ;
}
