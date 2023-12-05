, n = Integer . parseInt ( input . nextLine ( ) ) ) ;
{
  if ( n % x == 0 ) return b ;
  return g ( b , n % x ) ;
}
