public static void print ( int N ) {
  int [ ] A = new int [ N + 2 ] ;
  for ( String _ : input . split ( " " ) ) {
    A [ i ] = Integer . parseInt ( _ ) ;
  }
  List < Integer > left = new LinkedList < > ( ) ;
  List < Integer > right = new LinkedList < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    left . add ( i ) ;
    right . add ( i ) ;
  }
  Map < Integer , Integer > index = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    index . put ( A [ i - 1 ] , i ) ;
  }
  long ans = 0 ;
  for ( int a = N ;
  a > 0 ;
  a -- ) {
    int i = index . get ( a ) ;
    int l = left . get ( i ) ;
    int r = right . get ( i ) ;
    ans += a * ( i - l + 1 ) * ( r - i + 1 ) ;
    left . set ( r + 1 , l ) ;
    right . set ( l - 1 , r ) ;
  }
  System . out . println ( ans ) ;
}
