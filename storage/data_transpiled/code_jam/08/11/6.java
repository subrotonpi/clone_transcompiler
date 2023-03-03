public static final void main ( String [ ] args ) throws IOException {
  if ( args . length == 0 ) {
    BufferedReader ifi = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    String line = ifi . readLine ( ) ;
    int Tests = Integer . parseInt ( line ) ;
    for ( int test = xrange ( 0 , Tests ) ;
    test < Tests ;
    test ++ ) {
      System . out . println ( "Case #" + ( test + 1 ) + ":" ) ;
      line = ifi . readLine ( ) ;
      int N = Integer . parseInt ( line ) ;
      line = ifi . readLine ( ) ;
      int [ ] vec1 = ArrayUtil . toIntArray ( line . trim ( ) . split ( "\\s+" ) ) ;
      line = ifi . readLine ( ) ;
      int [ ] vec2 = ArrayUtil . toIntArray ( line . trim ( ) . split ( "\\s+" ) ) ;
      Arrays . sort ( vec1 ) ;
      Arrays . sort ( vec2 , Collections . reverseOrder ( ) ) ;
      int sum = 0 ;
      for ( int k : xrange ( 0 , N ) ) sum += vec1 [ k ] * vec2 [ k ] ;
      System . out . println ( sum ) ;
    }
  }
}
