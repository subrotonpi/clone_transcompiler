public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
  }
  int [ ] count = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < count . length ;
  i ++ ) {
    count [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < A . size ( ) ;
  i ++ ) {
    count [ A . get ( i ) ] ++ ;
  }
  int res = 1 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( count [ i ] == 2 ) {
      res *= 2 ;
    }
    else {
      if ( count [ i ] != 0 ) {
        if ( N % 2 == 1 && i != 0 ) {
          System . out . println ( 0 ) ;
          exit ( ) ;
        }
      }
    }
  }
  System . out . println ( res % ( 10 * 9 + 7 ) ) ;
}
