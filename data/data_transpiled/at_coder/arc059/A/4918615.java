public static int [ ] getMin ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Arrays . stream ( input . split ( " " ) ) . map ( i -> Integer . parseInt ( i ) ) . toArray ( ) ;
  c = Collections . singletonList ( c ) ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c_ = c [ i ] ;
    int ans = ( int ) Math . pow ( ( ( a_ - c_ ) * ( a_ - c_ ) ) , 2 ) ;
    d [ i ] = ans ;
  }
  return d ;
}
