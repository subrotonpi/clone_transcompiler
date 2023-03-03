public static List < Integer > solve ( int n , int a , int b ) {
  if ( n < a + b - 1 ) return Arrays . asList ( - 1 ) ;
  if ( n > a * b ) return Arrays . asList ( - 1 ) ;
  if ( b == 1 ) return Collections . singletonList ( 1 ) ;
  if ( a == 1 ) return Collections . singletonList ( n ) ;
  List < Integer > ans = new LinkedList < > ( ) ;
  ans . add ( b ) ;
  ans . add ( 0 ) ;
  ans . add ( n - a + 2 ) ;
  int t = b ;
  for ( ;
  t > 2 * b - 1 ;
  t -- ) ans . add ( t ) ;
  return ans ;
}
