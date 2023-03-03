{
  c = new int [ 8 ] ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new LinkedList < Integer > ( ) ;
  c . add ( n ) ;
  int r = 0 ;
  for ( int i : a ) {
    if ( i > 3199 ) r ++ ;
    else c . add ( i / 400 ) ;
  }
}
