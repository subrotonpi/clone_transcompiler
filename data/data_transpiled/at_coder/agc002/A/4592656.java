public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  Map < Integer , String > ans = new HashMap < > ( ) ;
  ans . put ( 1 , "Positive" ) ;
  ans . put ( - 1 , "Negative" ) ;
  ans . put ( 0 , "Zero" ) ;
  Integer res = null ;
  if ( a > 0 ) {
    res = 1 ;
  }
  else if ( a == b ) {
    res = 0 ;
  }
  else {
    res = ( - 1 ) * ( ( Math . abs ( a - b ) + 1 ) % 2 ) ;
  }
  System . out . println ( ans . get ( res ) ) ;
}
