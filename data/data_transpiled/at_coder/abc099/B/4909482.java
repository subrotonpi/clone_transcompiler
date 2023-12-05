public static int a ( ) {
  int b = map ( Integer . parseInt ( input . nextLine ( ) ) , a ) ;
  int t = 0 ;
  for ( int i = 0 ;
  i < b - a ;
  i ++ ) {
    t += i ;
  }
  return t - a ;
}
