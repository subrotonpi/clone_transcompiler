public static void print ( String input ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final int B = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int aMin = min ( a ) ;
  final int aMax = max ( a ) ;
  if ( aMin != aMax ) {
    final double p = B / ( aMax - aMin ) ;
    final double q = A - ( Math . pow ( a , 2 ) ) * p / N ;
    System . out . println ( p + " " + q ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
