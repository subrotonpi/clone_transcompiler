public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int X = A [ 0 ] , Y = sum ( A ) - A [ 0 ] ;
  int ans = Math . abs ( X - Y ) ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    X += A [ i + 1 ] ;
    Y -= A [ i + 1 ] ;
    if ( Math . abs ( X - Y ) < ans ) ans = Math . abs ( X - Y ) ;
  }
  System . out . println ( ans ) ;
}
