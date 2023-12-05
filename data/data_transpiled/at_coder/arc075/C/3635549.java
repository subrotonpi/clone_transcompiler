public static int [ ] inpl ( ) {
  return inpl ( ) ;
  class BIT {
    int size ;
    int [ ] tree = new int [ n + 1 ] ;
    public int suma ( int i ) {
      int s = 0 ;
      while ( i > 0 ) {
        s += tree [ i ] ;
        i -= i & - i ;
      }
      return s ;
    }
    public int add ( int i , int x ) {
      while ( i <= size ) {
        tree [ i ] += x ;
        i += i & - i ;
      }
      return i ;
    }
  }
  int N = inpl ( ) ;
  int K = inpl ( ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = a [ i ] + Integer . parseInt ( input ( ) ) - K ;
  Map < Integer , Integer > c = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) c . put ( a [ i ] , i + 1 ) ;
  BIT Tr = new BIT ( N + 1 ) ;
  int ans = 0 ;
  for ( int v : a ) {
    ans += Tr . suma ( c . get ( v ) ) ;
    Tr . add ( c . get ( v ) , 1 ) ;
  }
  System . out . println ( ans ) ;
  return a ;
}
