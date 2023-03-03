public static String Ackerman ( int in , HashMap < Integer , Integer > memo ) {
  in = Math . max ( Integer . MIN_VALUE , in ) ;
  if ( memo . containsKey ( in ) ) return memo . get ( in ) ;
  else if ( in <= 5 ) {
    memo . put ( in , 2 * ackerman ( in - 1 ) ) ;
    return memo . get ( in ) ;
  }
  else {
    System . out . println ( "Such a number is not representable by all the subatomic\nparticles in the universe." ) ;
    ackerman ( 4 ) ;
    String out = ( in - 4 ) * "2**" + memo . get ( 4 ) ;
    System . out . println ( out ) ;
    System . out . println ( "Testing complete." ) ;
  }
}
