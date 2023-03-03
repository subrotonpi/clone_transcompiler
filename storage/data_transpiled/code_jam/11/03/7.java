@ Function public static void xsum ( @ Function < String , Integer > x ) {
  Stream . of ( x ) . map ( v -> Stream . of ( v , s -> v ^ s ) ) . map ( x -> {
    Scanner in = new Scanner ( System . in ) ;
    int testlen = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    String [ ] tests = new String [ testlen ] ;
    int i = 0 ;
    while ( in . hasNextLine ( ) ) {
      if ( i % 2 != 0 ) {
        tests [ i ] = in . nextLine ( ) . trim ( ) ;
      }
      i ++ ;
    }
    String [ ] test = tests [ 0 ] . split ( "\\s+" ) ;
    for ( int j = 0 ;
    j < testlen ;
    j ++ ) {
      System . out . println ( "Case #" + ( j + 1 ) + ": " + solve ( parse ( test ) ) ) ;
    }
  }
  ) . map ( x -> {
    String test = x . split ( "\\s+" ) [ 0 ] ;
    return test . length ( ) == 0 ? Integer . parseInt ( test ) : test ;
  }
  ) . reduce ( Integer :: sum ) ;
}
