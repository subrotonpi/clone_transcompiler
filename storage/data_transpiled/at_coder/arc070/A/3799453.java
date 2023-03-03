public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int [ ] ar = new int [ a ] ;
  int count = 0 ;
  int i = 1 ;
  do {
    count += i ;
    ar [ count ] = i ;
    if ( count >= a ) break ;
    i ++ ;
  }
  while ( true ) ;
  System . out . println ( ar [ ar . length - 1 ] ) ;
}
