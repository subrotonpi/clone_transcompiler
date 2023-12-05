static final Scanner getScanner ( ) {
  System . in = new Scanner ( System . in ) ;
  System . out = new PrintWriter ( System . out ) ;
  int best = 10 * 100 ;
  char [ ] ba = null , bb = null ;
  {
    int i = 0 ;
    int test = 0 ;
    if ( i == n ) {
      int v = Math . abs ( Integer . parseInt ( pa ) - Integer . parseInt ( pb ) ) ;
      if ( v < best || ( v == best && pa < ba ) || ( v == best && pa == ba && pb < bb ) ) {
        best = v ;
        ba = pa ;
        bb = pb ;
      }
      return null ;
    }
  }
  int tn = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i < tn ;
  i ++ ) {
    char [ ] a = input . toCharArray ( ) ;
    int [ ] b = null ;
    if ( a [ i ] == '?' && b [ i ] != '?' ) {
      try0 ( i + 1 , a , b , pa + a [ i ] , pb + b [ i ] ) ;
    }
    else if ( a [ i ] == '?' && b [ i ] == '?' ) {
      if ( pa == pb ) {
        try0 ( i + 1 , a , b , pa + '0' , pb + '0' ) ;
        try0 ( i + 1 , a , b , pa + '0' , pb + '1' ) ;
        try0 ( i + 1 , a , b , pa + '1' , pb + '0' ) ;
      }
      else if ( pa > pb ) {
        try0 ( i + 1 , a , b , pa + '0' , pb + '0' ) ;
      }
      else {
        try0 ( i + 1 , a , b , pa + '0' , pb + '0' ) ;
      }
    }
    else if ( a [ i ] == '?' ) {
      if ( pa == pb ) {
        try0 ( i + 1 , a , b , pa + a [ i ] , pb + a [ i ] ) ;
        if ( b [ i ] > '0' ) {
          try0 ( i + 1 , a , b , pa + Integer . toString ( b [ i ] - 1 ) , pb + b [ i ] ) ;
        }
        if ( b [ i ] < '9' ) {
          try0 ( i + 1 , a , b , pa + Integer . toString ( b [ i ] + 1 ) , pb + b [ i ] ) ;
          