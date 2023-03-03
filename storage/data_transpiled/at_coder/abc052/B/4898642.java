public static void n ( int i ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int curr = 0 ;
  int ans = 0 ;
  for ( int j = 0 ;
  j < s . length ( ) ;
  j ++ ) {
    if ( s . charAt ( j ) == 'I' ) curr ++ ;
    if ( s . charAt ( j ) == 'D' ) curr -- ;
    ans = Math . max ( curr , ans ) ;
  }
  System . out . println ( ans ) ;
}
