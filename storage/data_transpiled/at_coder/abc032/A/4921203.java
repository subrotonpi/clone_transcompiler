public static int gcd ( @ Nonnegative int a , @ Nonnegative int b ) {
  if ( a < b ) {
    a = b ;
    b = a ;
  }
  return b == 0 ? a : gcd ( b , a % b ) ;
}
{
  int a = a * b / gcd ( a , b ) ;
  int b = a * b / gcd ( a , b ) ;
  int d ;
  int ans ;
  if ( getClass ( ) . isPrimitive ( ) ) {
    a = Integer . parseInt ( input . readLine ( ) ) ;
    b = Integer . parseInt ( input . readLine ( ) ) ;
    n = Integer . parseInt ( input . readLine ( ) ) ;
    ans = like ( a , b , n ) ;
    System . out . println ( ans ) ;
  }
  return a ;
}
