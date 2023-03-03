public static void n ( ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int tmp = 1 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      tmp ++ ;
      if ( tmp > l ) {
        cnt ++ ;
        tmp = 1 ;
      }
    }
    else {
      tmp -- ;
    }
  }
  System . out . println ( cnt ) ;
}
