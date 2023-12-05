public static int k = Integer . parseInt ( input ) {
  int a = 1 , b = 1 ;
  for ( int _ = 0 ;
  _ < k ;
  _ ++ ) {
    a = a + b ;
    b = a ;
  }
  return a + b ;
}
