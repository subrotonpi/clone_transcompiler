public static void n ( ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  int tab = 1 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      tab ++ ;
      if ( tab > l ) {
        ans ++ ;
        tab = 1 ;
      }
    }
    else {
      if ( tab > 1 ) tab -- ;
    }
  }
  System . out . println ( ans ) ;
}
