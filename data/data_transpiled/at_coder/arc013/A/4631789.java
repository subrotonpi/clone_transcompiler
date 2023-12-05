static final int [ ] [ ] S ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int P = Integer . parseInt ( input . readLine ( ) ) ;
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int R = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] K = {
    P , Q , R }
    ;
    LinkedList < Integer > S = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < 6 ;
    i ++ ) {
      S . add ( K [ i ] [ 0 ] ) ;
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < 6 ;
    i ++ ) {
      int mul = ( N / S . get ( i ) [ 0 ] ) * ( M / S . get ( i ) [ 1 ] ) * ( L / S . get ( i ) [ 2 ] ) ;
      if ( ans <= mul ) {
        ans = mul ;
      }
    }
    System . out . println ( ans ) ;
    return K ;
  }
  