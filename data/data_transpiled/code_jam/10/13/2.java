static final Map < Integer , Integer > cache = new HashMap < Integer , Integer > ( ) {
  int [ ] a = new int [ 10 ] ;
  final int N = 1000003 ;
  {
    fillA ( a ) ;
    main ( System . in ) ;
  }
  {
    fillA ( a ) ;
    main ( System . in ) ;
  }
  {
    fillA ( a ) ;
    main ( System . in ) ;
  }
  {
    fillA ( a ) ;
    main ( System . in ) ;
  }
  {
    int [ ] a = new int [ N ] ;
    int last = 1 ;
    int last2 = 1 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      for ( int j = last ;
      j < Math . min ( a [ i ] + i , N ) ;
      j ++ ) {
        a [ j ] = last2 ;
      }
      last = a [ i ] + i ;
      last2 = i + 1 ;
      if ( ( a [ i ] + i ) >= N ) {
        break ;
      }
      a [ a [ i ] + i ] = i + 1 ;
    }
    int [ ] a = new int [ N ] ;
    int t1 , t2 ;
    int n ;
    int t1 , t2 ;
    int t2 ;
    int t3 ;
    int i , t2 ;
    if ( i > j ) {
      i = j ;
      t2 = i ;
      if ( i == j ) {
        return 0 ;
      }
      if ( ( i < j ) || ( t2 < t1 ) ) {
        t = calc ( i , j ) ;
        cache . put ( ( i , j ) , t ) ;
      }
      return cache . get ( ( i ) ) ;
    }
    /* foo */
    int A1 , A2 , B1 , B2 ;
    for ( i = A1 ;
    i <= A2 ;
    i ++ ) {
      t1 = a [ i ] ;
      t2 = a [ i ] + i ;
      n = B2 - B1 + 1 ;
      t3 = Math . max ( 0 , Math . min ( t2 , B2 + 1 ) - Math . max ( B1 , t1 ) ) ;
      res += n - t3 ;
    }
    /* main(System.in); for (int i=0; i<n; i++) {
    System.out.println("Case #"+(i+1)+": "+foo(i));
    }*/
    for ( int i = 1 ;
    i < 10 ;
    i ++ ) {
      b = null ;
      last = 0 ;
      for ( int