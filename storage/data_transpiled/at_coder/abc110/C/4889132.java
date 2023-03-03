public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  Map < String , String > ds = Maps . newHashMap ( ) ;
  Map < String , String > dt = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    String s = S . substring ( i , i + 1 ) ;
    String t = T . substring ( i , i + 1 ) ;
    if ( ds . containsKey ( s ) ) {
      if ( ds . get ( s ) != t ) {
        System . out . println ( "No" ) ;
        exit ( ) ;
      }
    }
    else {
      dt . put ( t , s ) ;
    }
  }
  return "Yes" ;
}
