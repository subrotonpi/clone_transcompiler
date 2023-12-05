public static void n ( ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  int cnt = 1 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) ++ cnt ;
    else if ( s . charAt ( i ) == '-' && cnt > 1 ) -- cnt ;
    if ( cnt > l ) {
      ans ++ ;
      cnt = 1 ;
    }
  }
  System . out . println ( ans ) ;
}
