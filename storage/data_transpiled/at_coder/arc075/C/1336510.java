public static BinaryIndexedTree < Integer > binaryIndexedTree ( int size ) {
  int [ ] data = new int [ size + 1 ] ;
  int i ;
  int j = size ;
  BinaryIndexedTree < Integer > bit ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int t = 0 ;
  List < Integer > B = new ArrayList < Integer > ( ) ;
  for ( int a : A ) {
    t += a - K ;
    B . add ( t ) ;
  }
  List < Integer > temp = new ArrayList < Integer > ( B ) ;
  List < Integer > C = new ArrayList < Integer > ( ) ;
  for ( int b : B ) {
    C . add ( b ) ;
  }
  int result = 0 ;
  bit = binaryIndexedTree ( N + 1 ) ;
  for ( int c : C ) {
    result += bit . sum ( c ) ;
    bit . add ( c , 1 ) ;
  }
  System . out . println ( result ) ;
  return bit ;
}
