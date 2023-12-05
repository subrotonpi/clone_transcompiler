public static void print ( int n ) {
  n = Integer . parseInt ( input ( ) ) ;
  t = [ int . parseInt ( input ( ) ) for i in range ( n ) ] ;
  print ( new TreeSet ( t ) . first ( ) ) ;
}
