@ GwtIncompatible ( "java.lang.ref.WeakReference" ) public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( args [ i ] ) ) ;
  }
  int [ ] counter = new int [ a . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    counter [ i ] = a [ i ] ;
  }
  if ( N == 1 && a [ 0 ] == 0 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  if ( a [ 0 ] != 0 || counter [ 0 ] > 1 || counter [ 1 ] == 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int maxV = Math . max ( a ) + 1 , mod = 10 * 9 + 7 , answer = 1 ;
  for ( int i = 1 , j = 1 ;
  i < maxV ;
  i ++ , j ++ ) {
    int prev = counter [ i ] , current = counter [ j ] ;
    double c1 = Math . pow ( Math . pow ( 2 , prev , mod ) - 1 , current , mod ) ;
    double c2 = Math . pow ( 2 , current * ( current - 1 ) / 2 , mod ) ;
    answer = answer * c1 * c2 % mod ;
  }
  System . out . println ( answer ) ;
}
