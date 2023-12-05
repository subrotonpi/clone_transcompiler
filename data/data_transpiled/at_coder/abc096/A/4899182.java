public static void print ( int a , int b ) {
  int ans = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  ans = a ;
  if ( a > b ) {
    ans -- ;
  }
  System . out . println ( ans ) ;
}
