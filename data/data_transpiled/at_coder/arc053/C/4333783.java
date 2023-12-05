[ ] ;
for ( int i = 0 ;
i < x . length ;
i ++ ) a = Integer . parseInt ( input . nextLine ( ) ) ;
b = Integer . parseInt ( input . nextLine ( ) ) ;
x [ i ] = new int [ ] {
  a * ( a < b ) ? 2 * 35 - b : a , a , a - b }
  ;
  Arrays . sort ( x ) ;
  int t = 0 ;
  int m = 0 ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) m = Math . max ( m , t + a ) ;
  t += x [ i ] ;
  System . out . println ( m ) ;
}
