static final int D = Integer . parseInt ( input ) {
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int ans = 100000 ;
  for ( int i = 0 ;
  i < 2 * D ;
  i ++ ) {
    String s = Integer . toBinaryString ( i ) . substring ( 2 ) . toString ( ) ;
    int [ ] x = new int [ D ] ;
    for ( int j = 0 ;
    j < D ;
    j ++ ) x [ j ] = Integer . parseInt ( s . substring ( j , j + 1 ) ) ;
    int q = 0 , score = G ;
    for ( int j = 0 ;
    j < D ;
    j ++ ) {
      if ( x [ j ] == 1 ) {
        q += a . get ( j ) . get ( 0 ) ;
        score -= a . get ( j ) . get ( 0 ) * ( j + 1 ) * 100 + a . get ( j ) . get ( 1 ) ;
      }
    }
    if ( score > 0 ) {
      for ( int j = D - 1 ;
      j >= 0 ;
      j -- ) {
        if ( x [ j ] == 0 ) {
          int k = ( a . get ( j ) . get ( 0 ) - 1 ) * ( j + 1 ) * 100 ;
          if ( k >= score ) {
            q += Math . ceil ( score / ( ( j + 1 ) * 100 ) ) ;
            score = - 1 ;
            break ;
          }
          else {
            q += a . get ( j ) . get ( 0 ) - 1 ;
            score -= ( a . get ( j ) . get ( 0 ) - 1 ) * ( j + 1 ) * 100 ;
          }
        }
      }
    }
    if ( score <= 0 ) ans = Math . min ( ans , q ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
