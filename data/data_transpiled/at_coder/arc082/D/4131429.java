static void main ( String [ ] args ) {
  final int X = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int r [ ] = new int [ X ] ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] q_list = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    q_list [ i ] = new int [ X ] ;
    for ( int j = 0 ;
    j < X ;
    j ++ ) {
      q_list [ i ] [ j ] = i ;
    }
  }
  int [ ] a = new int [ K + 1 ] ;
  int [ ] upper_limit = new int [ K + 1 ] ;
  int [ ] lower_limit = new int [ K + 1 ] ;
  int x = 0 , ux = X , lx = 0 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    int diff = r [ i ] - r [ i - 1 ] ;
    if ( i % 2 == 1 ) {
      x -= diff ;
      ux -= diff ;
      ux = Math . max ( ux , 0 ) ;
      lx -= diff ;
      lx = Math . max ( lx , 0 ) ;
    }
    else {
      x += diff ;
      ux += diff ;
      ux = Math . min ( ux , X ) ;
      lx += diff ;
      lx = Math . min ( lx , X ) ;
    }
    a [ i ] = x ;
    upper_limit [ i ] = ux ;
    lower_limit [ i ] = lx ;
  }
  int [ ] asc_i = new int [ K + 1 ] ;
  int [ ] dsc_i = new int [ K + 1 ] ;
  x = 0 ;
  for ( int i = 2 ;
  i <= K ;
  i += 2 ) {
    if ( x < a [ i ] ) {
      x = a [ i ] ;
      asc_i [ i ] = i ;
    }
  }
  x = a [ 1 ] ;
  for ( int i = 3 ;
  i <= K ;
  i += 2 ) {
    if ( a [ i ] < x ) {
      x = a [ i ] ;
      dsc_i [ i ] = i ;
    }
  }
  int [ ] asc_a = new int [ K + 1 ] ;
  int [ ] dsc_a = new int [ K + 1 ] ;
  for ( int i = 0 ;
  i < asc_i . length ;
  i ++ ) {
    int t = q_list [ i ] ;
    int ri