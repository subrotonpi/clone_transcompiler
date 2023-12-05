static final long [ ] getDistances ( ) {
  final int MAX_N = 10 * 5 + 1 ;
  final long MOD = 1000000007 ;
  final long [ ] sameDist = new long [ MAX_N + 1 ] ;
  Arrays . fill ( sameDist , 0 ) ;
  sameDist [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= MAX_N ;
  i ++ ) {
    sameDist [ i ] = sameDist [ i - 1 ] * Math . pow ( 2 , i - 1 , MOD ) ;
    sameDist [ i ] %= MOD ;
  }
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  final int [ ] cnNum = CollectionUtil . countItems ( a ) ;
  if ( ! ( cnNum [ 0 ] == 1 && a [ 0 ] == 0 ) ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  if ( a . length == 1 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  long ans = 1 ;
  int cnt = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( cnNum [ i ] == 0 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    else {
      ans *= sameDist [ cnNum [ i ] ] ;
      ans %= MOD ;
      ans *= Math . pow ( ( 2 * cnNum [ i - 1 ] - 1 ) , cnNum [ i ] , MOD ) ;
      ans %= MOD ;
    }
    cnt += cnNum [ i ] ;
    if ( cnt == a . length ) {
      System . out . println ( ans ) ;
      exit ( ) ;
    }
  }
  return new long [ ] {
    ans }
    ;
  }
  