static void prime ( ) {
  final int [ ] prime = new int [ 100000 ] ;
  Arrays . fill ( prime , 2 ) ;
  final boolean [ ] tab = new boolean [ 100001 ] ;
  tab [ 2 ] = true ;
  for ( int i = 3 ;
  i <= 100000 ;
  i += 2 ) {
    int x = ( int ) Math . sqrt ( i ) ;
    x += x % 2 == 0 ? 1 : 0 ;
    boolean found = false ;
    for ( int p : prime ) {
      if ( x < p ) break ;
      if ( i % p == 0 ) {
        found = true ;
        break ;
      }
    }
    if ( ! found ) {
      prime [ i ] = i ;
      tab [ i ] = true ;
    }
  }
  int q = Integer . parseInt ( input ( ) ) ;
  int [ ] ac = new int [ tab . length ] ;
  for ( int i = 1 ;
  i < ac . length ;
  i ++ ) {
    ac [ i ] = ac [ i - 1 ] + ( tab [ i ] && tab [ ( i + 1 ) / 2 ] ? 1 : 0 ) ;
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = Integer . parseInt ( input ( ) ) ;
    int r = Integer . parseInt ( input ( ) ) ;
    int ans = ac [ r ] - ac [ l - 1 ] ;
    System . out . println ( ans ) ;
  }
}
