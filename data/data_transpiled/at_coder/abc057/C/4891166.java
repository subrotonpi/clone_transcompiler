public static int N = Integer . parseInt ( input ) {
  final int X = Math . ceil ( Math . sqrt ( N ) ) ;
  final List < Integer > FACT = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= X ;
  i ++ ) {
    if ( N % i == 0 ) FACT . add ( i ) ;
  }
  int ANS = 10 * 10 ;
  for ( int f : FACT ) {
    final int x = N / f ;
    ANS = Math . min ( ANS , Math . max ( x , Integer . toString ( x ) . length ( ) , Integer . toString ( f ) . length ( ) ) ) ;
  }
  System . out . println ( ANS ) ;
  return ANS ;
}
