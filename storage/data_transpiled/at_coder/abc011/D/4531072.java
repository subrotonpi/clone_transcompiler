public static int input ( ) {
  int N = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  int [ ] fact = new int [ 1001 ] ;
  fact [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < 1001 ;
  i ++ ) {
    fact [ i ] = fact [ i - 1 ] * i ;
  }
  if ( X % D != 0 || Y % D != 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    X = Math . abs ( X / D ) ;
    Y = Math . abs ( Y / D ) ;
    if ( X + Y > N || ( X + Y + N ) % 2 != 0 ) {
      System . out . println ( 0 ) ;
    }
    else {
      int ans = 0 ;
      for ( int a = 0 ;
      a < ( N - ( X + Y ) ) / 2 + 1 ;
      a ++ ) {
        int b = ( N - ( X + Y ) ) / 2 - a ;
        ans += fact [ N ] / ( fact [ X + a ] * fact [ a ] * fact [ Y + b ] * fact [ b ] * ( 4 * N ) ) ;
      }
      System . out . println ( ans ) ;
    }
  }
  return 0 ;
}
