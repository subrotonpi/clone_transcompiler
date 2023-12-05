static final Map < String , Integer > other = new HashMap < String , Integer > ( ) {
  {
    put ( "B" , "O" ) ;
    put ( "O" , "B" ) ;
  }
  public static void main ( String [ ] args ) throws IOException {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    int testlen = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    String [ ] tests = new String [ testlen ] ;
    for ( int i = 0 ;
    i < tests . length ;
    i ++ ) {
      tests [ i ] = br . readLine ( ) . trim ( ) ;
    }
    int length = tests . length ;
    for ( int i = 0 ;
    i < length ;
    i ++ ) {
      String test = tests [ i ] ;
      int i = i + 1 ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( parse ( test ) ) ) ;
    }
  }
  private static Stream < String > parse ( String test ) throws IOException {
    String [ ] test = test . split ( "\\s+" ) ;
    return Stream . of ( test , 1 , test . length , Integer . parseInt ( test [ 0 ] ) ) ;
  }
  private static int solve ( String [ ] test ) throws IOException {
    Map < String , Integer > time = new HashMap < String , Integer > ( ) ;
    Map < String , Integer > pos = new HashMap < String , Integer > ( ) ;
    int total = 0 ;
    for ( int nc = 0 ;
    nc < test . length ;
    nc ++ ) {
      int np = test [ nc ] . charAt ( nc ) ;
      int d = Math . max ( Math . abs ( pos . get ( nc ) - np ) - time . get ( nc ) , 0 ) + 1 ;
      time . put ( nc , 0 ) ;
      total += d ;
      time . put ( other . get ( nc ) , d ) ;
      pos . put ( nc , np ) ;
    }
    return total - 1 ;
  }
}
