public static void input ( ) {
  String s = input ( ) ;
  String t = s . substring ( 0 , s . length ( ) - 1 ) ;
  Iterator < String > it = t . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    String a = it . next ( ) ;
    if ( ( ! "*" . equals ( a ) ) && a . length ( ) != 1 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
