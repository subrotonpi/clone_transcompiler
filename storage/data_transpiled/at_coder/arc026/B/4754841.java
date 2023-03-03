public static final int input ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int sub = 0 ;
  if ( Math . sqrt ( N ) != Integer . MAX_VALUE ) {
    for ( int i = 1 ;
    i <= ( int ) Math . sqrt ( N ) ;
    i ++ ) {
      if ( N % i == 0 ) {
        sub += i + N / i ;
      }
    }
    if ( sub / 2 == N ) {
      System . out . println ( "Perfect" ) ;
    }
    else if ( sub / 2 > N ) {
      System . out . println ( "Abundant" ) ;
    }
    else {
      System . out . println ( "Deficient" ) ;
    }
  }
  else {
    for ( int i = 1 ;
    i <= ( int ) Math . sqrt ( N ) ;
    i ++ ) {
      if ( N % i == 0 ) {
        sub += i + N / i ;
      }
    }
    sub -= N * 0.5 ;
    sub -= N ;
    if ( sub == N ) {
      System . out . println ( "Perfect" ) ;
    }
    else if ( sub > N ) {
      System . out . println ( "Abundant" ) ;
    }
    else {
      System . out . println ( "Deficient" ) ;
    }
  }
  return sub ;
}
