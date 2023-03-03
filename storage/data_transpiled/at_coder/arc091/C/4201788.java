public static void print ( int n , int a , int b ) {
  if ( a + b - 1 > n || a * b < n ) {
    System . out . println ( - 1 ) ;
  }
  else if ( b == 1 ) {
    System . out . println ( ( List ) Arrays . asList ( 1 , n + 1 ) ) ;
  }
  else {
    List ans = Lists . newArrayList ( ) ;
    int num = b - 1 ;
    int mod = n - a - ( n - a ) / ( b - 1 ) * ( b - 1 ) ;
    int size1 = ( n - a ) / ( b - 1 ) ;
    int size2 = size1 + 1 ;
    int mi = n - a ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      if ( i < num - mod ) {
        ans . add ( Lists . newArrayList ( ) ) ;
        mi = mi - size1 ;
      }
      else {
        ans . add ( Lists . newArrayList ( ) ) ;
        mi = mi - size2 ;
      }
    }
    System . out . println ( ans ) ;
  }
}
