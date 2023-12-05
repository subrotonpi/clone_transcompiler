public static int N = Integer . parseInt ( input ) {
  int an = input . nextInt ( ) ;
  String ans = Integer . toString ( an ) ;
  int mi = N ;
  int ma = 0 ;
  for ( int i = 1 ;
  i <= 5 ;
  i ++ ) {
    int A = ans . indexOf ( Integer . toString ( i ) , 0 ) ;
    if ( A > ma ) {
      ma = A ;
    }
  }
  return ma ;
}
