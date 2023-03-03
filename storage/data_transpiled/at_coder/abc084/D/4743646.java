static void prime ( ) {
  final int [ ] prime = {
    2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 }
    ;
    final boolean [ ] tab = new boolean [ 100001 ] ;
    tab [ 2 ] = true ;
    for ( int i = prime [ prime . length - 1 ] + 2 ;
    i <= 100000 ;
    i += 2 ) {
      int x = ( int ) Math . sqrt ( i ) ;
      x += x % 2 == 0 ? 1 : 0 ;
      boolean found = false ;
      for ( int p : prime ) {
        if ( x < p ) {
          break ;
        }
        if ( i % p == 0 ) {
          found = true ;
          break ;
        }
      }
      if ( ! found ) {
        prime [ p ] = i ;
      }
    }
    for ( int p : prime ) {
      tab [ p ] = true ;
    }
    int q = Integer . parseInt ( input ( ) ) ;
    int [ ] ac = new int [ tab . length ] ;
    for ( int i = 3 ;
    i < ac . length ;
    i += 2 ) {
      ac [ i - 1 ] = ac [ i - 2 ] ;
      ac [ i ] = ac [ i - 1 ] + ( tab [ i ] && tab [ ( i + 1 ) / 2 ] ? 1 : 0 ) ;
    }
    for ( ;
    ;
    ) {
      int l = Integer . parseInt ( input ( ) ) ;
      int r = Integer . parseInt ( input ( ) ) ;
      int ans = ac [ r ] - ac [ l - 1 ] ;
      System . out . println ( ans ) ;
    }
  }
  