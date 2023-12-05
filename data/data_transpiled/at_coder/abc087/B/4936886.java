public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int cont = 0 ;
  int total = 0 ;
  int a = 500 ;
  int b = 100 ;
  int c = 50 ;
  for ( int i = 0 ;
  i <= A ;
  i ++ ) {
    for ( int j = 0 ;
    j <= B ;
    j ++ ) {
      for ( int k = 0 ;
      k <= C ;
      k ++ ) {
        total = a * i + b * j + c * k ;
        if ( total == X ) {
          cont ++ ;
        }
      }
    }
  }
  System . out . println ( cont ) ;
  return cont ;
}
