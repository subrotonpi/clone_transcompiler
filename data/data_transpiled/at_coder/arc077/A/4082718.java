public static List < Integer > convert ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 1 ) aodd . add ( a . get ( i ) ) ;
    else aeven . add ( a . get ( i ) ) ;
  }
  List < Integer > ans = null ;
  if ( n % 2 == 0 ) {
    ans = aeven ;
  }
  return ans ;
}
