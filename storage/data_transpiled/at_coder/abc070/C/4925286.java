public static void main ( ) {
  int n = input . nextInt ( ) ;
  int t = 1 ;
  final int j ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    j = input . nextInt ( ) ;
    t = t * j / MathUtils . gcd ( t , j ) ;
  }
  System . out . println ( t ) ;
}
