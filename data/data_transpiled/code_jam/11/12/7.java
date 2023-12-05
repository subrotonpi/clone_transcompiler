static final String readFile ( String inFile ) throws IOException {
  File outFile = new File ( "input2.txt" ) ;
  File inFile = new File ( "output2.txt" ) ;
  String [ ] [ ] L = new String [ Integer . parseInt ( llLine [ 0 ] ) ] [ ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) L [ i ] = new String ( inFile . readLine ( ) . trim ( ) ) ;
  List < String > result = solve1 ( D , L ) ;
  String resStr = "Case #" + cnt + ":" ;
  for ( int i = 0 ;
  i < result . size ( ) ;
  i ++ ) {
    String [ ] ll = result . get ( i ) . split ( " " ) ;
    resStr += " " + ll [ i ] ;
  }
  resStr = resStr + "\n" ;
  outFile . createNewFile ( ) ;
  System . out . println ( resStr ) ;
}
