public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 0 , b = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int e = Integer . parseInt ( input . nextLine ( ) ) ;
    int f = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( a / e + ( a % e != 0 ? 1 : 0 ) ) * f >= b ) {
      b = f * ( a / e + ( a % e != 0 ? 1 : 0 ) ) ;
      a = e * ( a / e + ( a % e != 0 ? 1 : 0 ) ) ;
    }
    else {
      a = e * ( b / f + ( b % f != 0 ? 1 : 0 ) ) ;
      b = f * ( b / f + ( b % f != 0 ? 1 : 0 ) ) ;
    }
  }
  System . out . println ( a + b ) ;
}
