public static void main ( String input , int a , int b , int c , int x ) {
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    int result = 0 ;
    for ( int aa = 0 ;
    aa < a + 1 ;
    aa ++ ) {
      for ( int bb = 0 ;
      bb < b + 1 ;
      bb ++ ) {
        for ( int cc = 0 ;
        cc < c + 1 ;
        cc ++ ) {
          if ( x == aa * 500 + bb * 100 + cc * 50 ) {
            result = result + 1 ;
          }
        }
      }
    }
  }
  System . out . println ( result ) ;
}
