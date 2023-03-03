@ Sys public static int [ ] [ ] getInt ( ) {
  /* return Integer.parseInt(stdin.readLine()); */
  /* return Array of ints */
  for ( int i = 0 ;
  i < 1 ;
  i ++ ) {
    /* return */
    int [ ] ps = new int [ i ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      /* return */
      ps [ j ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
  }
  for ( int cn : xrange ( 1 , 1 + getInt ( ) ) ) {
    int n = getInt ( ) ;
    int [ ] ps = getInts ( ) ;
    int m1 = Math . max ( ( ps [ 0 ] ) . intValue ( ) , Integer . parseInt ( stdin . readLine ( ) ) ) ;
    int m2 = Math . max ( ( ps [ 1 ] ) . intValue ( ) , Integer . parseInt ( stdin . readLine ( ) ) ) ;
    int [ ] [ ] plan = new int [ n ] [ n ] ;
    for ( int k = 0 ;
    k < n ;
    k ++ ) plan [ k ] [ m1 ] = ps [ k ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) if ( j != m1 && j != m2 ) {
      for ( int z = 0 ;
      z < ps [ j ] ;
      z ++ ) plan [ k ] [ j ] = ps [ j ] ;
    }
    for ( int j = 0 ;
    j < ps [ m2 ] ;
    j ++ ) plan [ m2 ] [ m1 ] = ps [ m2 ] ;
    System . out . println ( "Case #" + cn + ": " + Arrays . toString ( plan ) ) ;
  }
  return plan ;
}
