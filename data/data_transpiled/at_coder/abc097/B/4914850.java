public static int x = Integer . parseInt ( input ) {
  if ( n % 2 == 0 || n % 3 == 0 ) return true ;
  if ( n < 3 ) return false ;
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i == 0 ) return false ;
  }
  return true ;
}
