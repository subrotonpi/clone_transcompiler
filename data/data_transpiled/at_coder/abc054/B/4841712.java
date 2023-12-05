public static String input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ N ] ;
  int [ ] [ ] B = new int [ M ] [ M ] ;
  String ans = "No" ;
  for ( int i = 0 ;
  i < N - M + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N - M + 1 ;
    j ++ ) {
      boolean check = true ;
      for ( int k = 0 ;
      k < M ;
      k ++ ) {
        for ( int l = 0 ;
        l < M ;
        l ++ ) {
          if ( A [ i + k ] [ j + l ] != B [ k ] [ l ] ) {
            check = false ;
          }
        }
      }
      if ( check == true ) {
        ans = "Yes" ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
