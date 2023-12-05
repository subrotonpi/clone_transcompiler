static int f ( int k ) {
  final int N ;
  int [ ] h ;
  if ( k == N ) return - 1 ;
  if ( h [ k ] == 0 ) return k ;
  else {
    h [ k ] -- ;
    update = true ;
    f ( k + 1 ) ;
  }
  update = false ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  h = new int [ N ] ;
  int r = 0 ;
  int s = 0 ;
  try {
    do {
      if ( h [ s ] != 0 ) break ;
      s ++ ;
    }
    while ( true ) ;
  }
  catch ( Exception ex ) {
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  return r ;
}
