public static int [ ] getMatchingIndices ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int l = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i ;
  }
  int [ ] renzokuLength = new int [ n ] ;
  lastUndo = - 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    renzokuLength [ i ] = a [ i ] ;
  }
  return renzokuLength ;
}
