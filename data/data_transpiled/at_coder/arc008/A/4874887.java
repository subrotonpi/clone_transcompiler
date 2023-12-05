public static void print ( int n ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  double num = Double . POSITIVE_INFINITY ;
  for ( i = 0 ;
  i < 100 ;
  i ++ ) {
    num = Math . min ( num , i * 100 + Math . max ( 0 , ( n - i * 10 ) ) * 15 ) ;
  }
  System . out . println ( num ) ;
}
