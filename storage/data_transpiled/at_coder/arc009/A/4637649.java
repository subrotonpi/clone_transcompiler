public static void print ( int n ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  double tot = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    tot += a * b ;
  }
  System . out . println ( ( int ) ( tot * 1.05 ) ) ;
}
