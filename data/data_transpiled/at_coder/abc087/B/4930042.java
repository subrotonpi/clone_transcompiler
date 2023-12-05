public static void main ( String input , int a , int b , int c , int x ) {
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    int ans = 0 ;
    for ( int ia = 0 ;
    ia < a + 1 ;
    ia ++ ) {
      for ( int ib = 0 ;
      ib < b + 1 ;
      ib ++ ) {
        for ( int ic = 0 ;
        ic < c + 1 ;
        ic ++ ) {
          if ( input . equals ( x ) ) {
            ans ++ ;
          }
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
