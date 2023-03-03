public static int N = Integer . parseInt ( input ) {
  int sumA = 0 ;
  int num = 10e10 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    sumA += a ;
    if ( a > b ) {
      num = Math . min ( num , b ) ;
    }
  }
  if ( num == 10e10 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( sumA - num ) ;
  }
  return sumA ;
}
