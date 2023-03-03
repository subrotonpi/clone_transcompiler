public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int mt = 1 , ma = 1 ;
  for ( int t = 0 ;
  t < n ;
  t ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Math . max ( ( mt - 1 ) / t , ( ma - 1 ) / a ) + 1 ;
    mt = l * t ;
    ma = l * a ;
  }
  System . out . println ( mt + ma ) ;
}
