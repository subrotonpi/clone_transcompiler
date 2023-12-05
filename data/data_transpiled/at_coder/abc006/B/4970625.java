public static void print ( int n ) {
  int a ;
  int a2 = 0 ;
  int a1 = 0 ;
  int a0 = 1 ;
  for ( int i = 3 ;
  i < n ;
  i ++ ) {
    a = ( a2 + a1 + a0 ) % 10007 ;
    a2 = a1 ;
    a1 = a0 ;
    a0 = a ;
  }
  print ( a ) ;
}
