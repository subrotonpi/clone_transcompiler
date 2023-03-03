static final int [ ] getChars ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  Counter [ ] S = new Counter [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) S [ i ] = new Counter ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) chars [ i ] = i ;
  return chars ;
}
