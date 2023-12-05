public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    c += a * b ;
  }
  System . out . println ( ( int ) ( c * 1.05 ) ) ;
}
