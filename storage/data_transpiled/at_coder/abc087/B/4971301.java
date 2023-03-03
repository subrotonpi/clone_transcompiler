public static void print ( int a500 , int b100 , int c50 ) {
  int X = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int goukei = 0 ;
  boolean isOver = false ;
  for ( int i = 0 ;
  i < a500 + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < b100 + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < c50 + 1 ;
      k ++ ) {
        goukei = i * 500 + j * 100 + k * 50 ;
        if ( goukei == X ) {
          ans ++ ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
