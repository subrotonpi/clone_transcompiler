static final String print ( String s ) {
  final int N = 1000000 ;
  final String b = input . nextLine ( ) . split ( " " ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String [ ] A = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = input . nextLine ( ) . split ( " " ) ;
  }
  final StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final char c = s . charAt ( i ) ;
    final int pos = b . indexOf ( c ) ;
    sb . append ( Integer . toString ( pos ) ) ;
  }
  return Integer . parseInt ( sb . toString ( ) ) ;
}
