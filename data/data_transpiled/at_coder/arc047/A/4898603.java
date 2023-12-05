public static void input ( int n , int l ) {
  String s = input . nextLine ( ) ;
  int count = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) count ++ ;
    else count -- ;
    if ( count == l ) {
      ans ++ ;
      count = 0 ;
    }
  }
  System . out . println ( ans ) ;
}
