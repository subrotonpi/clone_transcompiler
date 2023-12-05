public static void print ( String s ) {
  s = input . split ( " " ) ;
  String ans = "" ;
  for ( String w : s ) {
    ans += w . charAt ( 0 ) ;
  }
  System . out . println ( ans . toUpperCase ( ) ) ;
}
