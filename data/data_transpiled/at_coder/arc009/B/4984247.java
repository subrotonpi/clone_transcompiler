static final String getSortString ( ) {
  final int N = 1000000 ;
  final String b = input . nextLine ( ) . replaceAll ( " " , "" ) . split ( " " ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String [ ] a = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = input . nextLine ( ) ;
  }
  final StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = null ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final char c = a [ i ] ;
    final int k = b . indexOf ( c ) ;
    sb . append ( Integer . toString ( k ) ) ;
  }
  return Integer . toString ( sb . toString ( ) ) ;
}
