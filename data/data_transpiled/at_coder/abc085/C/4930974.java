public static void print ( int n , int y ) {
  boolean flag = false ;
  int [ ] list = new int [ 3 ] ;
  for ( int i = n ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j <= n - i ;
    j ++ ) {
      int k = n - i - j ;
      if ( i * 10000 + j * 5000 + k * 1000 == y && ! ( flag ) ) {
        flag = true ;
        list = new int [ ] {
          i , j , k }
          ;
        }
      }
    }
    if ( ! ( flag ) ) {
      System . out . println ( - 1 + " " + - 1 + " " + - 1 ) ;
    }
    else {
      System . out . println ( list [ 0 ] + " " + list [ 1 ] + " " + list [ 2 ] ) ;
    }
  }
  