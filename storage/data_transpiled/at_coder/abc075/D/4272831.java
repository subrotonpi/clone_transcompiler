public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  List < List < Integer >> z = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) z . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  Collections . sort ( z ) ;
  double a = 10 * 20 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      double x = z . get ( j ) . get ( ) - z . get ( i ) . get ( ) ;
      List < Integer > l = new ArrayList < > ( ) ;
      for ( int t = i ;
      t < z . subList ( i , j + 1 ) ;
      t += 1 ) l . add ( t ) ;
      for ( int u = l . size ( ) ;
      u < l . size ( ) ;
      u ++ ) l . get ( k - 1 ) a = Math . min ( a , x * ( v - u ) ) ;
    }
  }
  System . out . println ( a ) ;
}
