static final int [ ] [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] ans = new int [ n ] [ n ] ;
  int Ma = 0 ;
  int iMa = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( Math . abs ( a [ i ] ) > Ma ) {
      Ma = Math . abs ( a [ i ] ) ;
      iMa = i ;
    }
  }
  if ( Ma == 0 ) {
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] * a [ iMa ] < 0 ) {
      a [ i ] += a [ iMa ] ;
      ans [ i ] [ 0 ] = iMa + 1 ;
      ans [ i ] [ 1 ] = i + 1 ;
    }
  }
  if ( a [ iMa ] > 0 ) {
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( a [ i ] > a [ i + 1 ] ) {
        a [ i + 1 ] += a [ i ] ;
        ans [ i ] [ 1 ] = i + 1 ;
        ans [ i ] [ 2 ] = i + 2 ;
      }
    }
  }
  else {
    for ( int i = n - 1 ;
    i > 0 ;
    i -- ) {
      if ( a [ i - 1 ] > a [ i ] ) {
        a [ i - 1 ] += a [ i ] ;
        ans [ i ] [ 1 ] = i + 1 ;
        ans [ i ] [ 2 ] = i + 2 ;
        ans [ i ] [ 3 ] = i + 3 ;
        ans [ i ] [ 4 ] = i + 3 ;
        ans [ i ] [ 5 ] = i + 3 ;
        ans [ i ] [ 6 ] = i + 3 + 3 + 3 + 4 + 5 ;
        ans [ i ] [ 7 ] = i + 3 + 3 + 4 + 5 ;
        ans [ i ] [ 8 ] = i + 3 + 3 + 4 + 5 + 3 + 4 + 5 + 6 + 3 + 4 + 5 + 6 ;
        