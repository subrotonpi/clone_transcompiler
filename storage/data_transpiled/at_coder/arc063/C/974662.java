@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static String toString ( ) {
  R < Integer > R = range ;
  I < Integer > I = map ( Integer :: parseInt , input -> input . split ( " " ) ) ;
  n = Integer . parseInt ( input ) ;
  g = new ArrayList < > ( R . size ( n + 1 ) ) ;
  z = new int [ n ] ;
  d = new double [ n + 1 ] ;
  q = new int [ n + 1 ] ;
  r = "" ;
  Q = new int [ n ] ;
  heapify ( Q , 0 , - 2 , n ) ;
  for ( int i = R . size ( n - 1 ) ;
  i >= 0 ;
  i -- ) {
    int a = I . get ( i ) ;
    int b = I . get ( i ) ;
    a -- ;
    b -- ;
    g [ a ] . add ( new int [ ] {
      1 , a , b }
      ) ;
      g [ b ] . add ( new int [ ] {
        1 , b , a }
        ) ;
      }
      for ( int i = R . size ( ) ;
      i >= 0 ;
      i -- ) {
        int a = I . get ( i ) ;
        int b = I . get ( i ) ;
        a -- ;
        g [ n ] . add ( new int [ ] {
          b , n , a }
          ) ;
          z [ a ] = b ;
        }
        while ( Q . size ( ) > 0 ) {
          int e = heapify ( Q ) ;
          if ( q [ e [ 2 ] ] != - 1 ) continue ;
          q [ e [ 2 ] ] = e [ 1 ] ;
          for ( int f : g [ e [ 2 ] ] ) {
            if ( d [ f ] > e [ 0 ] + f [ 0 ] ) d [ f ] = e [ 0 ] + f [ 0 ] ;
            heapify ( Q , e [ 0 ] + f [ 0 ] , f [ 1 ] , f [ 2 ] ) ;
          }
        }
        for ( int i : g ) {
          if ( ArrayUtils . isNotEmpty ( n ) && Math . abs ( d [ e [ 1 ] ] - d [ e [ 2 ] ] ) != 1 ) r = "No" ;
        }
        if ( ArrayUtils . isNotEmpty ( z ) && z [ i ] != d [ i ] ) r = "No" ;
        System . out . println ( r == null ? "Yes\n" + Arrays . toString ( d ) : r