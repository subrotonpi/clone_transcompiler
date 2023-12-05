static private int doTest ( Scanner input ) {
  final String str = input . nextLine ( ) . substring ( 0 , input . nextLine ( ) . length ( ) - 1 ) ;
  final int L = str . length ( ) ;
  final int [ ] [ ] num = new int [ L + 1 ] [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    num [ i ] = new int [ 210 ] ;
  }
  num [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    for ( int d = 1 ;
    d <= L - i ;
    d ++ ) {
      final int n = Integer . parseInt ( str . substring ( i , i + d ) ) % 210 ;
      for ( int x = 0 ;
      x < 210 ;
      x ++ ) {
        num [ i + d ] [ ( x + n ) % 210 ] += num [ i ] [ x ] ;
      }
      if ( i > 0 ) {
        for ( int x = 0 ;
        x < 210 ;
        x ++ ) {
          num [ i + d ] [ ( x - n ) % 210 ] += num [ i ] [ x ] ;
        }
      }
    }
  }
  int res = 0 ;
  for ( int x = 0 ;
  x < 210 ;
  x ++ ) {
    if ( 0 == x % 2 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0 ) {
      res += num [ L ] [ x ] ;
    }
  }
  input . close ( ) ;
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int test = 0 ;
  test < N ;
  test ++ ) {
    final int answer = doTest ( input ) ;
    System . out . printf ( "Case #%d: %d%n" , test + 1 , answer ) ;
  }
  return res ;
}
