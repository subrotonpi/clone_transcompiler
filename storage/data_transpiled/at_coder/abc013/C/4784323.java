public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int e = Integer . parseInt ( input ) ;
  int minc = a * n ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int j = Math . max ( 0 , ( n * e - h - i * ( b + e ) ) / ( d + e ) + 1 ) ;
    int k = n - i - j ;
    minc = Math . min ( minc , a * i + c * j ) ;
  }
  System . out . println ( minc ) ;
}
