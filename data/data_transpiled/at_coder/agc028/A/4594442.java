public static void main28 ( String [ ] args ) {
  final int N = ( Integer ) input . nextInt ( ) ;
  final int M = ( Integer ) input . nextInt ( ) ;
  final String S ;
  final String T ;
  if ( N >= M ) {
    S = input . substring ( 0 , N ) ;
    T = input . substring ( N ) ;
  }
  else {
    T = input . substring ( 0 , N ) ;
    S = input . substring ( N ) ;
  }
  /* Compute the gcd of the number of integers */
  int gcd = 0 ;
  for ( int i = 1 ;
  i <= Math . min ( N , M ) ;
  i ++ ) {
    if ( n % i == 0 && m % i == 0 ) {
      gcd = i ;
    }
  }
  /* Compute the gcd of the integers */
  LCM = gcd ;
  a = ( int ) ( LCM / Math . max ( N , M ) ) ;
  b = ( int ) ( LCM / Math . min ( N , M ) ) ;
}
