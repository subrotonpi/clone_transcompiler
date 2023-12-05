public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    res += a * b ;
  }
  System . out . println ( ( int ) ( res * 1.05 ) ) ;
}
