public static int N ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] -- ;
  }
  a -- ;
  ArrayList < Integer > visit = new ArrayList < > ( ) ;
  visit . add ( a ) ;
  int ind = k ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a = L [ a ] ;
    if ( ! visit . contains ( a ) ) {
      visit . add ( a ) ;
    }
    else {
      ind = visit . indexOf ( a ) ;
      break ;
    }
  }
  int ans ;
  return ans ;
}
