public static void inpl ( ) {
  return new LinkedList < Integer > ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] TA = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    TA [ i ] = inpl ( ) ;
  }
  int a = TA [ 0 ] [ 0 ] , b = TA [ 0 ] [ 1 ] ;
  for ( int i = 1 ;
  i < TA . length ;
  i ++ ) {
    int ta = TA [ i ] [ 0 ] ;
    int ao = TA [ i ] [ 1 ] ;
    if ( ta >= a && ao >= b ) {
      a = ta ;
      b = ao ;
    }
    else {
      int tmpA = - ( - 1 * a / ta ) ;
      int tmpB = - ( - 1 * b / ao ) ;
      int tmp = Math . max ( tmpA , tmpB ) ;
      a = ta * tmp ;
      b = ao * tmp ;
    }
  }
  System . out . println ( a + b ) ;
}
