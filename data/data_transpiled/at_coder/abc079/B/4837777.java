public static void print ( int n ) {
  int t ;
  int l1 = 2 ;
  int l2 = 1 ;
  int l3 = 3 ;
  if ( n >= 2 ) {
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      t = l1 + l2 ;
      l1 = l2 ;
      l3 = t ;
      l2 = l3 ;
    }
    print ( l3 ) ;
  }
  else {
    if ( n == 1 ) {
      print ( l2 ) ;
    }
    else {
      print ( l1 ) ;
    }
  }
}
