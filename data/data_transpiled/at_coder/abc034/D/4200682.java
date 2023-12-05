public static void calculate ( int [ ] a ) {
  int salt = 0 ;
  int tot = 0 ;
  for ( int w = 0 ;
  w < a . length ;
  w ++ ) {
    int p = a [ w ] ;
    salt += w * p ;
    tot += w ;
  }
  /*prioritize(a, target)*/
  Collections . sort ( a , target ) ;
  /*search(a, K)*/
  int ng = 100 ;
  int ok = 0 ;
  int mid = ( ok + ng ) / 2 ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    int prev = mid ;
    a = prioritize ( a , mid ) ;
    int rho = calculate ( a , 0 , K ) ;
    if ( rho >= mid ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
    mid = ( ok + ng ) / 2 ;
    if ( Math . abs ( mid - prev ) < 1e-9 ) {
      break ;
    }
  }
  /*main();
  int N = Integer.parseInt(input());
  int K = Integer.parseInt(input());
  a[N] = new int[N];
  for(int i=0; i<N; i++){
  int w = Integer.parseInt(input());
  int p = Integer.parseInt(input());
  a[i] = new int[] { w, p };
  }
  int aa[] = search(a, K);
  System.out.println(calculate(aa));*/
  if ( getClass ( ) . getName ( ) . equals ( "com.google.common.util.Main" ) ) {
    main ( ) ;
  }
}
