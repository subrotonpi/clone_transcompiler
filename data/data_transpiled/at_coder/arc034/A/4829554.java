public static int [ ] getStdOut ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] res = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    int d = Integer . parseInt ( input ( ) ) ;
    int e = Integer . parseInt ( input ( ) ) ;
    res [ i ] = a + b + c + d + e * 110 / 900 ;
  }
  System . out . println ( max ( res ) ) ;
  return res ;
}
