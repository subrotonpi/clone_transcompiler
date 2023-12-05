public static void debug ( Map < String , Integer > a ) {
  System . out . println ( Arrays . toString ( a . entrySet ( ) . toArray ( ) ) ) ;
  /* read ints from input stream */
  for ( Map . Entry < String , Integer > e : a . entrySet ( ) ) {
    System . out . println ( e . getKey ( ) + "=" + e . getValue ( ) ) ;
  }
  /* main loop */
  Arrays . stream ( readInts ( ) ) . forEach ( t -> {
    Arrays . stream ( readInts ( ) ) . forEach ( r -> {
      System . out . println ( r . getKey ( ) + " " + r . getValue ( ) ) ) ;
    }
    ) ;
  }
  /* main loop */
  Arrays . stream ( readInts ( ) ) . forEach ( t -> {
    Arrays . stream ( readInts ( ) ) . forEach ( r -> {
      System . out . println ( r . getKey ( ) + " " + r . getValue ( ) ) ) ;
    }
    ) ;
  }
  /* main loop */
  for ( int t : xrange ( 1 , T + 1 ) ) {
    Arrays . stream ( readInts ( ) ) . forEach ( r -> {
      System . out . println ( r . getKey ( ) + " " + r . getValue ( ) ) ;
      System . out . println ( r . getValue ( ) ) ;
    }
    ) ;
  }
  /* main loop */
  System . out . println ( ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    Arrays . stream ( readInts ( ) ) . forEach ( r -> {
      System . out . println ( r . getKey ( ) + " " + r . getValue ( ) ) ;
      System . out . println ( r . getValue ( ) ) ;
    }
    ) ;
  }
  /* main loop */
  System . out . println ( ) ;
}
