public static boolean cldouble ( char car , char letter ) {
  char ll = '.' ;
  char occ = 0 ;
  for ( char c : car ) {
    if ( ( c == letter ) && ( c != ll ) ) occ ++ ;
    ll = c ;
  }
  if ( occ > 1 ) return true ;
  return false ;
}
{
  int poss = 0 ;
  for ( int i = 0 ;
  i < poss ;
  i ++ ) {
    if ( car [ 0 ] != letter ) return false ;
    if ( car [ 0 ] == letter && end [ 0 ] > 0 ) frends ++ ;
    if ( start [ letter ] == letter && end [ letter ] == letter ) frends ++ ;
  }
  poss *= fac ( only [ letter ] ) ;
  return poss % 1000000007 ;
}
int cases = input . nextInt ( ) ;
for ( int i = 1 ;
i < cases ;
i ++ ) {
  System . out . println ( "Case #" + i + ":" ) ;
  doit ( ) ;
}
