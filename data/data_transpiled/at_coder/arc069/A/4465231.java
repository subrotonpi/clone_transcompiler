public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int res ;
  if ( N < Integer . MAX_VALUE / 2 ) {
    res = N ;
    M -= N * 2 ;
    if ( M >= 4 ) {
      res += Integer . MAX_VALUE / 4 ;
    }
  }
  else {
    res = Integer . MAX_VALUE / 2 ;
  }
  return res ;
}
