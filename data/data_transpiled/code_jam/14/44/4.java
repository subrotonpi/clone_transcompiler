@ VisibleForTesting static < T > Collection < Pair < T , Integer >> get ( Function < T , Integer > get ) {
  return Maps . uniqueIndex ( input -> {
    Map < T , Integer > cache = Maps . newHashMap ( ) ;
    return ( a , b ) -> {
      if ( a < b ) {
        cache . put ( a , b ) ;
      }
      return a ;
    }
    ;
  }
  , ( f , n ) -> {
    if ( n == 0 ) return 1 ;
    return fact ( n - 1 ) * n ;
  }
  , ( f , n ) -> {
    int n = n - 1 ;
    return n * n ;
  }
  , ( f , n ) -> {
    int n = n - 1 ;
  }
  , ( f , n ) -> {
    int n = n - 1 ;
    @ Override public int nodeCount ( List < T > s ) {
      return n ;
    }
  }
  , ( f , n ) -> n ) {
    int n = n - 1 ;
    @ Override public int nodeCount ( List < T > s ) {
      return n ;
    }
    @ Override public int nodeCount ( List < T > s ) {
      return n ;
    }
  }
  , ( f , n ) -> n - 1 ;
  @ Override public List < Pair < T , Integer >> splits ( List < T > s , int n ) {
    if ( s . isEmpty ( ) ) return Arrays . asList ( Pair . of ( ) ) ;
    if ( n == 1 ) return Arrays . asList ( Pair . of ( new T ( s ) , n ) ) ;
    List < Pair < T , Integer >> results = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < 1 << s . size ( ) ;
    i ++ ) {
      List < T > items = new ArrayList < > ( ) ;
      List < T > oitems = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < s . size ( ) ;
      j ++ ) {
        T item = s . get ( j ) ;
        if ( ( i > j ) & 1 ) {
          items . add ( item ) ;
        }
        else {
          oitems . add ( item ) ;
        }
      }
      for ( int res : splits ( Pair . of ( oitems ) , n - 1 ) ) {
        results . add ( Pair . of ( new T ( items ) , res ) ) ;
      }
    }
    return results ;
  }
  ) ;
  T = get . apply ( input ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    