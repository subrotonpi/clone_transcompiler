public static void input ( int n , int l ) {
  String s = input . nextLine ( ) ;
  int tab = 1 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      tab ++ ;
      if ( tab > l ) {
        cnt ++ ;
        tab = 1 ;
      }
    }
    else {
      tab -- ;
    }
  }
  System . out . println ( cnt ) ;
}
