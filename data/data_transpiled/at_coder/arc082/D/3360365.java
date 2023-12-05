public static int X = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ami = new int [ K + 1 ] ;
  int [ ] ama = new int [ K + 1 ] ;
  int [ ] cusummi = new int [ K + 1 ] ;
  int [ ] cusumma = new int [ K + 1 ] ;
  int [ ] cusum = new int [ K + 1 ] ;
  int pr = 0 ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    int r = R [ i ] ;
    int d = i % 2 == 0 ? pr - r : r - pr ;
    cusum [ i + 1 ] = cusum [ i ] + d ;
    cusummi [ i + 1 ] = Math . min ( cusummi [ i ] , cusum [ i + 1 ] ) ;
    cusumma [ i + 1 ] = Math . max ( cusumma [ i ] , cusum [ i + 1 ] ) ;
    ami [ i + 1 ] = Math . min ( Math . max ( ami [ i ] + d , 0 ) , X ) ;
    ama [ i + 1 ] = Math . min ( Math . max ( ama [ i ] + d , 0 ) , X ) ;
    pr = r ;
  }
  final int ans ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int i = Arrays . binarySearch ( R , t ) ;
    int t1 = i != 0 ? R [ i - 1 ] : 0 ;
    int t2 = t - t1 ;
    int d = i % 2 == 0 ? - t2 : t2 ;
    if ( ama [ i ] == ami [ i ] ) {
      System . out . println ( Math . min ( Math . max ( ama [ i ] + d , 0 ) , X ) ) ;
      continue ;
    }
    ans = a + cusum [ i ] ;
    if ( - cusummi [ i ] > a ) ans += - cusummi [ i ] - a ;
    if ( cusumma [ i ] > ( X - a ) ) ans -= cusumma [ i ] - ( X -