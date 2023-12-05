public static int input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
  String s = input . readLine ( ) ;
  String t = input . readLine ( ) ;
  /* if (y == 0) {
  return x;
  } else {
  return gcd(y,x%y);
  }*/
  /* lcm(x,y) */
  int l = lcm ( n , m ) ;
  int a = l / n ;
  int b = l / m ;
  int [ ] ln = new int [ n ] ;
  int [ ] lm = new int [ m ] ;
  int i = 0 ;
  while ( i < n ) {
    ln [ i ++ ] = i ;
    i += b ;
  }
  i = 0 ;
  while ( i < m ) {
    lm [ i ++ ] = i ;
    i += a ;
  }
  int p = 0 ;
  for ( ;
  i < ln . length ;
  i ++ ) {
    if ( s . charAt ( ln [ i ] ) != t . charAt ( lm [ i ] ) ) {
      p = 1 ;
    }
  }
  if ( p == 0 ) {
    System . out . println ( l ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return l ;
}
