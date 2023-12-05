public static double getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> Open = Arrays . asList ( Collections . nCopies ( N , 1 ) ) ;
  List < List < Integer >> Profit = Arrays . asList ( Collections . nCopies ( N , 1 ) ) ;
  double ans = - 1 * Double . MAX_VALUE ;
  for ( int x = 1 ;
  x <= 2 * 10 ;
  x ++ ) {
    String check = Integer . toBinaryString ( x ) ;
    check = "0" + check ;
    long now = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int cnt = 0 ;
      for ( int k = 0 ;
      k < 10 ;
      k ++ ) {
        if ( Integer . parseInt ( check . substring ( k , k + 1 ) ) * Open . get ( i ) . get ( k ) == 1 ) ++ cnt ;
      }
      now += Profit . get ( i ) . get ( cnt ) ;
    }
    ans = Math . max ( ans , now ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
