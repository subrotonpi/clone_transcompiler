static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  if ( N == 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int v = 2 ;
  int [ ] ans = new int [ N ] ;
  while ( N != 0 ) {
    if ( N % v == 0 ) {
      ans [ N ] = 0 ;
    }
    else {
      N -= ( v / 2 ) ;
      ans [ N ] = 1 ;
    }
    v *= - 2 ;
  }
  System . out . println ( Arrays . toString ( ans ) ) ;
}
