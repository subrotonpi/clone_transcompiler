public static void input ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean up ;
  if ( n != 1 && h [ 0 ] > h [ 1 ] ) up = false ;
  else up = true ;
  int i = 0 , num = 1 , ans = 1 ;
  while ( i < n - 1 ) {
    if ( up ) {
      if ( h [ i ] < h [ i + 1 ] ) num ++ ;
      else up = false ;
      num = false ;
    }
    else up = false ;
    num = 2 ;
    ans = Math . max ( ans , num ) ;
  }
  i ++ ;
  System . out . println ( Math . max ( ans , num ) ) ;
}
