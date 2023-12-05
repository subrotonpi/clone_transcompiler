public static int n ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n % 2 != 0 ) System . out . println ( ( n - 1 ) * ( n - 1 ) / 2 ) ;
  else System . out . println ( ( n - 2 ) * n / 2 ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j <= n ;
  j ++ ) if ( i + j != n + 1 - n % 2 ) System . out . println ( i + " " + j ) ;
  return n ;
}
