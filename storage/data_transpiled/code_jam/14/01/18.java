public static void readFile ( File f ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  String [ ] data = br . readLine ( ) . split ( "\n" ) ;
  int cases = Integer . parseInt ( data [ 0 ] ) ;
  for ( int testCase : xrange ( cases ) ) {
    int ans1 = Integer . parseInt ( data [ 1 + testCase * 10 ] ) ;
    String [ ] grid1 = data . substring ( 2 + testCase * 10 , 1 + testCase * 10 + 5 ) . split ( " " ) ;
    List < Integer > grade1 = Arrays . asList ( grid1 ) ;
    Set < Integer > set1 = new HashSet < Integer > ( grade1 . get ( ans1 - 1 ) ) ;
    int ans2 = Integer . parseInt ( data [ 1 + testCase * 10 + 5 ] ) ;
    String [ ] grid2 = data . substring ( 7 + testCase * 10 , 11 + testCase * 10 ) . split ( " " ) ;
    List < Integer > grade2 = Arrays . asList ( grid2 ) ;
    Set < Integer > set2 = new HashSet < Integer > ( grade2 . get ( ans2 - 1 ) ) ;
    Set < Integer > ans = set1 . retainAll ( set2 ) ;
    String show ;
    if ( ans . size ( ) == 1 ) show = Integer . toString ( ans . iterator ( ) . next ( ) ) ;
    else if ( ans . size ( ) == 0 ) show = "Volunteer cheated!" ;
    else show = "Bad magician!" ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + show ) ;
  }
}
