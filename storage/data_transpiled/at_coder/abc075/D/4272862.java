public static void input ( ) {
  I . main ( new String [ ] {
  }
  ) ;
  int n = I . nextInt ( ) ;
  int k = I . nextInt ( ) ;
  List < Integer > z = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) z . add ( I . nextInt ( ) ) ;
  Collections . sort ( z ) ;
  int a = 10 * 20 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + k - 1 ;
    j < n ;
    j ++ ) {
      List < Integer > l = new ArrayList < > ( ) ;
      for ( int t = i ;
      t < z . get ( j ) ;
      t += 1 ) l . add ( t ) ;
      a = Math . min ( a , ( l . get ( k ) - 1 ) * ( l . get ( k ) - 1 ) ) ;
    }
  }
  System . out . println ( a ) ;
}
