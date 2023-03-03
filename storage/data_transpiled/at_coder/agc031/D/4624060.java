@ Operator . OperatorType public static List < Integer > identity ( ) {
  return Lists . newArrayList ( 1 , n + 1 ) ;
  List < Integer > ppp = Lists . newArrayList ( ) ;
  List < Integer > qqq = Lists . newArrayList ( ) ;
  for ( int q = 0 ;
  q < n ;
  q ++ ) {
    ppp . add ( ppp . get ( q - 1 ) ) ;
  }
  List < Integer > reverseComposition ( ppp , qqq ) {
    return Lists . newArrayList ( ) ;
  }
  List < Integer > res = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ppp . add ( i ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ppp . add ( i ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    qqq . add ( i ) ;
  }
  List < Integer > ans = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans . add ( i ) ;
  }
  return ans ;
}
