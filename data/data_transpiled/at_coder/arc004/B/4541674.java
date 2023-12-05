public static void print ( int N ) {
  int [ ] ds = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ds [ i ] = Integer . parseInt ( input ( ) ) ;
  double maxD = max ( ds ) ;
  double sumD = sum ( ds ) ;
  System . out . println ( sumD ) ;
  System . out . println ( max ( 0 , maxD - ( sumD - maxD ) ) ) ;
}
