public static void n ( ) {
  int n = Integer . parseInt ( input ) ;
  String s = input ;
  int num = 0 ;
  Map < String , Integer > map = new HashMap < String , Integer > ( ) ;
  map . put ( "A" , 4 ) ;
  map . put ( "B" , 3 ) ;
  map . put ( "C" , 2 ) ;
  map . put ( "D" , 1 ) ;
  map . put ( "F" , 0 ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    num += map . get ( s . charAt ( i ) ) ;
  }
  System . out . println ( num / n ) ;
}
