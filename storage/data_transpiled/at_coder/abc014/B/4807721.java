public static void n ( int x , int n ) {
  String [ ] strings = input . split ( " " ) ;
  int len = Integer . decode ( strings [ n ] ) . length ;
  List < Integer > price = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    String flag = strings [ i ] ;
    if ( Integer . parseInt ( flag ) > 0 ) {
      ans += price . get ( i ) ;
    }
  }
  System . out . println ( ans ) ;
}
