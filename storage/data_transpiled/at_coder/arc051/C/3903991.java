public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > a = new ArrayList < > ( ) ;
  for ( int n = 0 ;
  n < ( Integer ) Integer . parseInt ( input . nextLine ( ) ) ;
  n ++ ) {
    a . add ( new Integer ( n ) ) ;
  }
  int mod = 10 * 9 + 7 ;
  int _d = 1 ;
  if ( A > 1 ) {
    while ( B > 0 && a . get ( 0 ) . intValue ( ) * A * ( a . get ( 0 ) . intValue ( ) + 1 ) < a . get ( a . size ( ) - 1 ) . intValue ( ) * A * ( a . get ( a . size ( ) - 1 ) . intValue ( ) ) ) {
      int d = a . get ( 0 ) . intValue ( ) * A / mod , m = a . get ( 0 ) . intValue ( ) * A % mod ;
      a . get ( 0 ) . intValue ( ) + = d ;
      a . get ( 0 ) . intValue ( ) = m ;
      a . forEach ( i -> {
      }
      ) ;
      B -- ;
    }
    _d = B / N ;
    B = B % N ;
    while ( B -- > 0 ) {
      int d = a . get ( 0 ) . intValue ( ) * A / mod , m = a . get ( 0 ) . intValue ( ) * A % mod ;
      a . get ( 0 ) . intValue ( ) + = d ;
      a . get ( 0 ) . intValue ( ) = m ;
      a . forEach ( i -> {
      }
      ) ;
      B -- ;
    }
  }
  for ( final int ans : a ) {
    System . out . println ( ( ans * Math . pow ( A , _d , mod ) ) % mod ) ;
  }
  return N ;
}
