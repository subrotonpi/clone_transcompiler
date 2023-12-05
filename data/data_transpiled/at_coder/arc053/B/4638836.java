@ Function public static void input ( ) {
  String S = input . nextLine ( ) ;
  Map < String , Integer > c = new HashMap < > ( S ) ;
  c . putAll ( S ) ;
  int odd_cnt = 0 ;
  for ( Integer s : c . values ( ) ) {
    if ( s % 2 != 0 ) {
      odd_cnt ++ ;
    }
  }
  if ( odd_cnt > 0 ) {
    int p = ( S . length ( ) - odd_cnt ) / 2 ;
    System . out . println ( ( p / odd_cnt ) * 2 + 1 ) ;
  }
  else {
    System . out . println ( S . length ( ) ) ;
  }
}
