public static void print ( int n ) {
  int [ ] A = list ( Integer . parseInt ( input ( ) ) ) ;
  int ans = - 100 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tmp = - 1000 ;
    int J = - 100 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == j ) continue ;
      int l = new Integer ( i ) ;
      int r = new Integer ( j ) ;
      if ( Arrays . binarySearch ( A , l + 1 , r + 1 , 2 ) > tmp ) {
        J = j ;
        tmp = Arrays . binarySearch ( A , l + 1 , r + 1 , 2 ) ;
      }
    }
    int l = new Integer ( i ) ;
    int r = new Integer ( j ) ;
    ans = Math . max ( Arrays . binarySearch ( A , l , r + 1 , 2 ) , ans ) ;
  }
  System . out . println ( ans ) ;
}
