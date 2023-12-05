public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  double X = a [ 0 ] ;
  double Y = sum ( a ) - a [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( Math . abs ( X - Y ) < ans ) ans = Math . abs ( X - Y ) ;
    X += a [ i ] ;
    Y -= a [ i ] ;
  }
  System . out . println ( ans ) ;
}
