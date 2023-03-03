public static int [ ] [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > li = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > lis = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > lisa = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > cou = new ArrayList < Integer > ( ) ;
  int touch = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    lis . add ( new Integer ( x ) ) ;
  }
  for ( int x = 0 ;
  x < lis . size ( ) ;
  x ++ ) {
    cou . add ( new Integer ( x + y ) ) ;
  }
  Iterator < Integer > it = cou . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    li . add ( it . next ( ) ) ;
    lisa . add ( it . next ( ) ) ;
  }
  int coux = Math . max ( li . size ( ) , Math . min ( li . size ( ) , Math . max ( lisa . size ( ) , Math . min ( lisa . size ( ) , Math . max ( lisa . size ( ) , Math . max ( coux ) ) ) ) ) ) ;
  int couy = 0 ;
  int [ ] ans = new int [ 4 ] ;
  ans [ 0 ] = new int [ 4 ] ;
  ans [ 1 ] = new int [ 4 ] ;
  ans [ 2 ] = new int [ 4 ] ;
  ans [ 3 ] = new int [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    ans [ i ] = ( ans [ i ] + key / 2 ) / 2 ;
    ans [ i ] = new int [ 4 ] ;
    ans [ i ] = new int [ 4 ] ;
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    ans [ i ] = new int [ 4 ] ;
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    ans [ i ] = new int [ 4 ] ;
  }
  return ans ;
}
