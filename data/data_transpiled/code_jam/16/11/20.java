static String ans ( String S ) {
  final String ans = "" ;
  for ( String s : S . split ( " " ) ) {
    if ( ( s + ans ) > ( ans + s ) ) {
      ans = s + ans ;
    }
    else {
      ans = ans + s ;
    }
  }
  /* main program */
  String s = System . console ( ) . readLine ( ) ;
  int T = Integer . parseInt ( s ) ;
  for ( int i : xrange ( 0 , T ) ) {
    String S = System . console ( ) . readLine ( ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ans ( S . trim ( ) ) ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
  return ans ;
}
