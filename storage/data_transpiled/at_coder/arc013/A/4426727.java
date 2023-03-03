public static void print ( int n , int m , int l ) {
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  for ( int a = p , b = q , c = r ;
  a <= a ;
  b = b ) {
    res = Math . max ( res , ( n / a ) * ( m / b ) * ( l / c ) ) ;
  }
  System . out . println ( res ) ;
}
