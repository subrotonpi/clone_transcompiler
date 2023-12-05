public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int a : A ) {
    do {
      if ( a % 2 != 0 && a % 3 != 2 ) break ;
      a -- ;
      c ++ ;
    }
    while ( true ) ;
  }
  return c ;
}
