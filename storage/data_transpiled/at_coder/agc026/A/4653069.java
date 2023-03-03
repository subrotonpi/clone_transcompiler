public static int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  boolean changed = false ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int a = A [ i ] ;
    int b = A [ i ] ;
    if ( changed ) {
      changed = false ;
      continue ;
    }
    if ( a == b ) {
      ans ++ ;
      changed = true ;
    }
  }
  return ans ;
}
