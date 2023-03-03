, n = Integer . parseInt , * a = Integer . parseInt , range = 10 , c = 0 ) ;
f = new int [ 10 * 6 ] ;
l = c = 0 ;
for ( int r = 0 ;
r < n ;
r ++ ) {
  while ( f [ a [ r ] ] ) f [ a [ l ] ] -- ;
  l ++ ;
  f [ a [ r ] ] ++ ;
  c = Math . max ( c , r - l + 1 ) ;
}
System . out . println ( c ) ;
}
