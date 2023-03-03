static final int [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] h1 = new int [ n ] ;
  int [ ] sum1 = new int [ n ] ;
  sum1 [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum1 [ 0 ] += a [ i ] ;
    heapify ( h1 , a [ i ] ) ;
  }
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    int sum = sum1 [ i - n ] ;
    int aa = heapify ( h1 , a [ i ] ) ;
    if ( ( aa < a [ i ] ) && ( aa < a [ i ] ) ) {
      heapify ( h1 , a [ i ] ) ;
      sum += ( a [ i ] - aa ) ;
    }
    else {
      heapify ( h1 , aa ) ;
    }
    sum1 [ i ] = sum ;
  }
  int [ ] h2 = new int [ n ] ;
  int [ ] sum2 = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum2 [ 0 ] -= a [ 3 * n - i - 1 ] ;
    heapify ( h2 , - 1 * a [ 3 * n - i - 1 ] ) ;
  }
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    int sum = sum2 [ i - n ] ;
    int aa = heapify ( h2 , a [ i ] ) ;
    if ( ( aa < - 1 * a [ 3 * n - i - 1 ] ) && ( aa < - 1 * a [ 3 * n - i - 1 ] ) ) {
      heapify ( h2 , - 1 * a [ 3 * n - i - 1 ] ) ;
      sum += ( - 1 * a [ 3 * n - i - 1 ] - aa ) ;
    }
    else {
      heapify ( h2 , aa ) ;
    }
    sum2 [ i ] = sum ;
  }
  int ans = - 10 * 15 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    ans = Math . max ( ans , sum1 [ i ] + sum2 [ n - i ] ) ;
  }
  