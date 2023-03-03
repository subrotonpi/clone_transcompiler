public static int k = Integer . parseInt ( input ) {
  int a = 2 , b = 0 , c = 0 , d = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    d = a ;
    c = 2 * a + b ;
    a = c ;
    b = d ;
  }
  return a + b ;
}
