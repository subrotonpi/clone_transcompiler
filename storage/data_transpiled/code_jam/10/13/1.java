static final int [ ] [ ] range ( int i ) {
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  HashMap < Integer , Boolean > mem = new HashMap < Integer , Boolean > ( ) ;
  /* if (mem.containsKey(new Integer(i))) return mem.get(new Integer(i)); if (a == 0) return false; if (a > b) return winsSlow(b, a); */
  int _b = i ;
  b -= a ;
  while ( b > 0 ) {
    if ( ! winsSlow ( a , b ) ) {
      mem . put ( new Integer ( i ) , Boolean . TRUE ) ;
      return true ;
    }
    b -= a ;
  }
  mem . put ( new Integer ( i ) , Boolean . FALSE ) ;
  /* if (wins(a,b)) return false; if (wins(b,a)) return true; if (b >= 2*a) return true; return !wins(b-a,a); */
  /* if (a == 0) return b; return gcd(b%a,a); */
  double phi = .5 * ( sqrt ( 5 ) + 1 ) ;
  double iphi = 1 / phi ;
  /* total slow */
  int t = 0 ;
  for ( int a : xrange ( a1 , a2 + 1 ) ) for ( int b : xrange ( b1 , b2 + 1 ) ) if ( wins ( a , b ) ) t ++ ;
  /* intersect */
  if ( x2 < b1 ) return 0 ;
  if ( x1 > b2 ) return 0 ;
  /* subtotal */
  int lose = intersect ( ( int ) ( a * iphi + 1 ) , ( int ) ( a * phi ) , b1 , b2 ) ;
  /* sum of the whole */
  if ( a2 - a1 > b2 - b1 ) return totalFast ( b1 , b2 , a1 , a2 ) ;
  t = 0 ;
  for ( int a : xrange ( a1 , a2 + 1 ) ) t += subtotal ( a , b1 , b2 ) ;
  return t ;
}
