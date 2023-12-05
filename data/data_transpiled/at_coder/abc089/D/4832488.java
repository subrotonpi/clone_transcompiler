public static int mp ( int p , int q ) {
  int x ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i <= h ;
  i ++ ) {
    a [ i ] = new int [ h ] ;
    for ( int j = 0 ;
    j <= w ;
    j ++ ) {
      a [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ q ] ;
  int [ ] r = new int [ q ] ;
  for ( int i = 0 ;
  i <= q ;
  i ++ ) {
    int li = Integer . parseInt ( input . nextLine ( ) ) ;
    int ri = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ i ] = li ;
    r [ i ] = ri ;
  }
  int [ ] [ ] cor = new int [ h * w + 1 ] [ w ] ;
  int [ ] s = new int [ h * w + 1 ] ;
  for ( int i = 0 ;
  i <= h ;
  i ++ ) {
    for ( int j = 0 ;
    j <= w ;
    j ++ ) {
      cor [ a [ i ] [ j ] ] = i ;
    }
  }
  / * ▁ int ▁ p ▁ = ▁ ( p ▁ - ▁ 1 ) ▁ & & ▁ ( q ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & & ▁ ( d ▁ - ▁ 1 ) ▁ & ▁ ( d ▁ - ▁ 1 ) ▁ & ▁ ( d ▁ - ▁ 1 ) ▁ & ▁ ( d ▁ - ▁ 1 ) ▁ & ▁ ( d ▁ - ▁ 1 ) ▁ & ▁ ( d ▁ - ▁ 1 ) ▁ & ▁ ( d ▁ - ▁ 1 ) ▁ & ▁ ( d