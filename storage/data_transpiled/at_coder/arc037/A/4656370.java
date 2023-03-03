public static void N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  m = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int sum = 0 ;
  for ( int i : m ) {
    sum += Math . max ( 0 , 80 - i ) ;
  }
  System . out . println ( sum ) ;
}
