public static void input ( ) {
  StringBuffer ans = new StringBuffer ( ) ;
  final int len = s . length ( ) ;
  while ( len > 0 ) {
    final Matcher m = Pattern . compile ( Rnd . get ( ) . toString ( ) ) . matcher ( s ) ;
    if ( m . matches ( ) ) {
      ans . append ( s . charAt ( 0 ) ) ;
      ans . append ( m . end ( ) ) ;
      s = s . substring ( m . end ( ) ) ;
    }
    else {
      ans . append ( s . charAt ( 0 ) ) ;
      ans . append ( '1' ) ;
      s = s . substring ( 1 ) ;
    }
  }
  System . out . println ( ans ) ;
}
