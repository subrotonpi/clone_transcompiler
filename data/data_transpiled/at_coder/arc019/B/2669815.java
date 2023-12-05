@ InputFunction public static void input ( ) {
  String A = input . nextLine ( ) ;
  int N = A . length ( ) ;
  int X = 0 ;
  for ( int i = 0 ;
  i < Math . ceil ( N / 2 ) ;
  i ++ ) {
    if ( A . charAt ( i ) != A . charAt ( A . length ( ) - i - 1 ) ) {
      X ++ ;
    }
  }
  if ( X >= 2 ) {
    System . out . println ( 25 * N ) ;
  }
  else if ( X == 0 ) {
    if ( N % 2 == 0 ) {
      System . out . println ( 25 * N ) ;
    }
    else {
      System . out . println ( 25 * ( N - 1 ) ) ;
    }
  }
  else {
    System . out . println ( 25 * ( N - 2 ) + 48 ) ;
  }
}
