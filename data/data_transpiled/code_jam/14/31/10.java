static final int [ ] p2 = new int [ 41 ] ;
for ( int i = 0 ;
i < 41 ;
i ++ ) p2 [ i ] = 2 * i ;
/* if (b == 0) return a; return gcd(b, a%b); */
int T = input . nextInt ( ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  int p = Integer . parseInt ( input . nextLine ( ) ) , q = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = gcd ( p , q ) ;
  p /= d ;
  q /= d ;
  int r = 1 ;
  int ans = - 1 ;
  for ( int i = 0 ;
  i < 41 ;
  i ++ ) {
    if ( p >= q ) {
      ans = i ;
      break ;
    }
    p *= 2 ;
  }
  if ( ! p2 [ q ] ) System . out . println ( "Case #" + ( t + 1 ) + ": impossible" ) ;
  else System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
}
return p2 ;
}
