public static void print ( int n , int m ) {
  String s = Integer . toString ( input ( ) ) ;
  int ans = 0 ;
  int tab = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      tab ++ ;
      if ( tab > m ) {
        ans ++ ;
        tab = 1 ;
      }
    }
    else {
      tab -- ;
    }
  }
  System . out . println ( ans ) ;
}
