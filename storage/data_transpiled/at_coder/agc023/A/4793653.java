public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  HashMap < Integer , Integer > dic = new HashMap < > ( ) ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tmp += a [ i ] ;
    dic . putIfAbsent ( tmp , 0 ) ;
    dic . putIfAbsent ( tmp , 0 ) ;
    dic . get ( tmp ) ;
    dic . put ( tmp , 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < dic . size ( ) ;
  i ++ ) ans += dic . get ( i ) * ( dic . get ( i ) - 1 ) / 2 ;
  return ans ;
}
