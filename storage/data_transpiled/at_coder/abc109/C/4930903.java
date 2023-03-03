public static int gcd ( int a , int b ) {
  if ( b == 0 ) {
    return a ;
  }
  else {
    return gcd ( b , a % b ) ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > X = new ArrayList < Integer > ( ) ;
  X . add ( N ) ;
  ArrayList < Integer > Y = new ArrayList < Integer > ( ) ;
  for ( Integer x : X ) {
    Y . add ( Math . abs ( A - x ) ) ;
  }
  int ans = Math . max ( Y . size ( ) , ans ) ;
  return ans ;
}
