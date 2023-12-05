public static int N ( int M , int C ) {
  int [ ] B = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < List < Integer >> A = new ArrayList < > ( ) ;
  int AC_codes = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( new ArrayList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < B . length ;
    j ++ ) {
      A . add ( new ArrayList < Integer > ( ) ) ;
    }
  }
  return AC_codes ;
}
