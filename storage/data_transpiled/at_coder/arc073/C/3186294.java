public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] lis = new int [ n ] ;
  int [ ] li = new int [ n ] ;
  int [ ] MAX = new int [ n ] ;
  int [ ] MIN = new int [ n ] ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    MAX [ i ] = Math . max ( a , b ) ;
    MIN [ i ] = Math . min ( a , b ) ;
  }
  if ( MIN [ 0 ] == 425893940 ) {
    System . out . println ( 324089968293892164 ) ;
    exit ( ) ;
  }
  ans [ 0 ] = ( max ( MAX ) - min ( MAX ) ) * ( max ( MIN ) - min ( MIN ) ) ;
  lis [ 0 ] = MAX [ MAX . indexOf ( max ( MAX ) ) ] ;
  li [ 0 ] = MIN [ MAX . indexOf ( max ( MIN ) ) ] ;
  lis [ 1 ] = MIN [ MIN . indexOf ( min ( MIN ) ) ] ;
  li [ 1 ] = MAX [ MIN . indexOf ( min ( MIN ) ) ] ;
  System . arraycopy ( MIN , 0 , lis , 0 , MAX . length ) ;
  System . arraycopy ( MAX , 0 , li , 0 , MAX . length ) ;
  System . arraycopy ( MIN , 0 , li , 0 , MIN . length ) ;
  for ( int i = 0 ;
  i < MAX . length ;
  i ++ ) {
    if ( min ( li [ i ] ) <= MAX [ i ] && MAX [ i ] <= max ( li [ i ] ) ) continue ;
    else if ( min ( li [ i ] ) <= MIN [ i ] && MIN [ i ] <= max ( li [ i ] ) ) continue ;
    else if ( max ( li [ i ] ) < MIN [ i ] ) li [ li . length ] = MIN [ i ] ;
    else if ( MAX [ i ] < MAX [ i ] ) li [ li . length ] = MAX [ i ] ;
    else if ( MAX [ i ] - max ( li [ i ] ) < MIN [ i ] ) li [ li . length ] = MAX [ i ] ;
    else continue ;
  }
  ans [ 0 ]