public static int L ( int l , int a ) {
  return ( ( l - 1 ) / a ) * a + a ;
}
{
  int r = ( r / a ) * a + a - 1 ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > x = new LinkedList < Integer > ( ) ;
  x . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int l = 2 ;
  int r = 2 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    a = x . removeFirst ( ) ;
    l = L ( l , a ) ;
    r = R ( r , a ) ;
    if ( l > r ) {
      l = r = - 1 ;
      System . out . println ( l ) ;
      exit ( ) ;
    }
  }
  return l ;
}
