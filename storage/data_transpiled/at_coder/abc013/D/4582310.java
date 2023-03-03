@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int [ ] ints ( ) {
  final int n = Integer . parseInt ( "" ) ;
  final int m = Integer . parseInt ( "" ) ;
  final int [ ] a = new int [ n + 1 ] ;
  final int [ ] b = new int [ n + 1 ] ;
  {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = i ;
    }
  }
  {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      b [ i + 1 ] = i ;
    }
  }
  {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = i ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i + 1 ] = i ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i + 1 ] = a [ b [ i ] ] ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i + 1 ] = a [ b [ i ] ] ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      a [ i ] = a [ b [ i ] ] ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = n ;
    i < a . length ;
    i ++ ) {
      a [ i + 1 ] = a [ b [ i ] ] ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = n ;
    i < a . length ;
    i ++ ) {
      a [ i ] = a [ b [ i ] ] ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = a . length - 1 ;
    i >= 0 ;
    i -- ) {
      a [ i ] = a [ b [ i ] ] ;
    }
  }
  {
    final int [ ] a = new int [ n + 1 ] ;
    for ( int i = a . length - 1 ;
    i >= 0 ;
    