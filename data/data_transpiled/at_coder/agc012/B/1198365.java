static final void dp ( int v , int d , int c ) {
  final int [ ] [ ] dic = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( memo [ v - 1 ] [ d ] ) return ;
    memo [ v - 1 ] [ d ] = true ;
    if ( d == 0 ) {
      res [ v - 1 ] = Integer . toString ( c ) ;
      return ;
    }
    dp ( v , d - 1 , c ) ;
    for ( int e : dic [ v - 1 ] ) dp ( e , d - 1 , c ) ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  final int [ ] vdc = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) res [ i ] = '0' ;
}
