static int n , int k , int l = Integer . parseInt ( input ) {
  int [ ] ar = new int [ n ] ;
  int [ ] ah = new int [ n ] ;
  int [ ] br = new int [ n ] ;
  int [ ] bh = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ar [ i ] = i ;
    ah [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    br [ i ] = i ;
    bh [ i ] = 0 ;
  }
  {
    int ip = root ( ar , i ) ;
    int jp = root ( ah , i ) ;
    if ( ip == jp ) {
      return 0 ;
    }
    else {
      if ( h [ ip ] < h [ jp ] ) {
        l [ ip ] = jp ;
      }
      else if ( h [ ip ] > h [ jp ] ) {
        l [ jp ] = ip ;
      }
      else {
        if ( ip < jp ) {
          l [ jp ] = ip ;
          h [ ip ] ++ ;
        }
        else {
          l [ ip ] = jp ;
          h [ jp ] ++ ;
        }
      }
    }
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( p < q ) {
      union ( ar , ah , p - 1 , q - 1 ) ;
    }
    else {
      union ( ar , ah , q - 1 , p - 1 ) ;
    }
  }
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( r < s ) {
      union ( br , bh , r - 1 , s - 1 ) ;
    }
    else {
      union ( br , bh , s - 1 , r - 1 ) ;
    }
  }
  HashMap < Integer , Integer > abd = new HashMap < > ( ) ;
  for ( int a = 0 ;
  a < ar . length ;
  a ++ ) {
    int b = abd . get ( a ) ;
    if ( abd . containsKey ( ( root ( ar , a ) ) ) ) {
      abd . put ( ( root ( ar , a ) ) , ( root ( br , b ) ) ) ;
    }
    else {
      abd . put ( ( root ( ar , a