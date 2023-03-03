static final String getSumOfDigits ( ) {
  final String input = "Enter a number of digits to display on the input" ;
  final int N = Integer . parseInt ( input ) ;
  final int Q = Integer . parseInt ( input ) ;
  final int [ ] imos = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    imos [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < imos . length ;
  i ++ ) {
  }
  return String . valueOf ( imos [ imos . length - 1 ] ) ;
}
