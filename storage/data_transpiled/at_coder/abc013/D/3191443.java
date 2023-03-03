public static List < List < Integer >> readIntList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < Integer > rec = Lists . newLinkedList ( ) ;
  for ( int a = 1 ;
  a <= N ;
  a ++ ) {
    rec . add ( A [ a - 1 ] ) ;
  }
  List < Integer > kaijou = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < 30 ;
  i ++ ) {
    int c = 2 * i ;
    if ( c > D ) {
      c = 1 ;
    }
    kaijou . add ( i ) ;
  }
  List < Integer > ans = Lists . newLinkedList ( ) ;
  for ( int k : kaijou ) {
    ans . add ( R . get ( k ) . get ( i - 1 ) ) ;
  }
  System . out . println ( ( ans ) ) ;
  return ans ;
}
