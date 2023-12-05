public static void input ( ) {
  String s = input ;
  String [ ] arr = s . split ( "\\+" ) ;
  int cnt = 0 ;
  for ( String x : arr ) {
    if ( ! "0" . equals ( x ) ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
