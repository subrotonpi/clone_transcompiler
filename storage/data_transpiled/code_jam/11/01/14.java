@ java . lang . Deprecated public static void main ( String [ ] args ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( "a-large.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "a-large.out" ) ) ) ;
  int cases = Integer . parseInt ( fin . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int case = 0 ;
  /* answer */
  case ++ ;
  System . out . println ( >>> fout . println ( "Case #" + case ) + ": " + Integer . toString ( cases ) ) ;
  System . out . println ( "Case #" + case + ": " + Integer . toString ( cases ) ) ;
  for ( int test = xrange ( cases ) ;
  test < cases ;
  test ++ ) {
    int orange = 1 ;
    int blue = 1 ;
    int lastblue = 0 ;
    int lastorange = 0 ;
    int cont = 0 ;
    String s = fin . readLine ( ) . split ( " " ) ;
    int n = Integer . parseInt ( s . substring ( 0 , 1 ) ) ;
    for ( int i = xrange ( n ) ;
    i < xrange ( i ) ;
    i ++ ) {
      if ( s . charAt ( 2 * i + 1 ) == 'O' ) {
        int move = Math . abs ( Integer . parseInt ( s . substring ( 2 * i + 2 ) ) - orange ) - ( cont - lastorange ) ;
        if ( move < 0 ) {
          move = 0 ;
        }
        cont = cont + move + 1 ;
        lastorange = cont ;
        orange = Integer . parseInt ( s . substring ( 2 * i + 2 ) ) ;
      }
      if ( s . charAt ( 2 * i + 1 ) == 'B' ) {
        int move = Math . abs ( Integer . parseInt ( s . substring ( 2 * i + 2 ) ) - blue ) - ( cont - lastblue ) ;
        if ( move < 0 ) {
          move = 0 ;
        }
        cont = cont + move + 1 ;
        lastblue = cont ;
        blue = Integer . parseInt ( s . substring ( 2 * i + 2 ) ) ;
      }
    }
    answer ( Integer . toString ( cont ) ) ;
  }
}
