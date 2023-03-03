public static void BIT ( ) {
  {
    int n ;
    int [ ] lst = new int [ n + 1 ] ;
    int i ;
    int ret ;
    int j ;
    {
      while ( ( i = input . nextInt ( ) ) <= n ) {
        lst [ j ] ++ ;
        i += ( i & - i ) ;
      }
    }
    {
      int i ;
      ret = 0 ;
      while ( ( i = input . nextInt ( ) ) != 0 ) {
        ret += lst [ i ] ;
        i -= ( i & - i ) ;
      }
      return ;
    }
  }
  if ( getClass ( ) . isPrimitive ( ) ) {
    String [ ] ipt = input . split ( "\\s+" ) ;
    n = Integer . parseInt ( ipt [ 0 ] ) ;
    k = Integer . parseInt ( ipt [ 1 ] ) ;
    ArrayList < Integer > a = new ArrayList < Integer > ( ) ;
    a . add ( new Integer ( 0 ) ) ;
    for ( i = 0 ;
    i < n ;
    i ++ ) {
      a . add ( new Integer ( a . get ( a . size ( ) - 1 ) . intValue ( ) + Integer . parseInt ( input . nextInt ( ) ) - k ) ) ;
    }
    Collections . sort ( a ) ;
    BIT bit = new BIT ( n + 1 ) ;
    ret = 0 ;
    for ( int e : a ) {
      ret += bit . get ( e [ 1 ] ) ;
      bit . put ( e [ 1 ] ) ;
    }
    System . out . println ( ret ) ;
  }
}
