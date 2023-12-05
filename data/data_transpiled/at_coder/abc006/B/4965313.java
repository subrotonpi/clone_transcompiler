[ ] a = {
  0 , 0 , 1 }
  ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n < 4 ) exec ( "print(a[n-1]);exit()" ) ;
  for ( int i = 0 ;
  i < n - 3 ;
  i ++ ) a [ i ] = a [ i ] ;
  return ( a [ i ] + a [ i ] ) % 10007 ;
}
