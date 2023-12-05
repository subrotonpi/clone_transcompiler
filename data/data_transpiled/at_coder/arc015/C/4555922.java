@ VisibleForTesting static int [ ] [ ] solve ( Fraction [ ] [ ] par ) {
  int [ ] [ ] par = new int [ 400 ] [ 400 ] ;
  for ( int i = 0 ;
  i < 400 ;
  i ++ ) par [ i ] = i ;
  int [ ] diff = new int [ 400 ] ;
  for ( int i = 0 ;
  i < 400 ;
  i ++ ) diff [ i ] = 1 ;
  {
    if ( par [ i ] == par [ i ] ) return par [ i ] ;
    int r = find ( par [ i ] ) ;
    diff [ i ] *= diff [ par [ i ] ] ;
    par [ i ] = r ;
  }
  {
    find ( par [ i ] ) ;
    return diff [ i ] ;
  }
  {
    int x = par [ 0 ] ;
    int y = par [ 1 ] ;
    par [ 0 ] = x ;
    diff [ 0 ] = y ;
  }
  {
    int x = par [ 0 ] ;
    int y = par [ 1 ] ;
    par [ 1 ] = x ;
    int w = diff [ 0 ] ;
    int n = Integer . parseInt ( input [ 0 ] ) ;
    int [ ] id = new int [ n ] ;
    int [ ] rev = new int [ n ] ;
    int N = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      Arrays . sort ( par ) ;
      int a = Integer . parseInt ( input [ 1 ] ) ;
      int d = Integer . parseInt ( input [ 2 ] ) ;
      int b = Integer . parseInt ( input [ 3 ] ) ;
      int d = Integer . parseInt ( input [ 4 ] ) ;
      if ( ! id [ a ] [ b ] ) {
        id [ a ] = N ;
        rev [ N ] = a ;
        N ++ ;
      }
      if ( ! id [ b ] [ b ] ) {
        id [ b ] = N ;
        rev [ N ] = b ;
        N ++ ;
      }
      unite ( id [ a ] , id [ b ] , new Fraction ( d , 1 ) ) ;
    }
  }
  HashMap < Integer , int [ ] > ws = new HashMap < Integer , int [ ] > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ! ws . containsKey ( i ) ) ws . put ( i , new int [ ] {
      ws . get ( i ) }
      ) ;
    }
    int ans = 0 ;
    for ( int r : ws . keySet ( ) ) {
      List < Integer > w = new ArrayList <