static final int [ ] getPermutation ( int [ ] input ) {
  int N = input . length ;
  int P = input [ 0 ] ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = input [ i ] ;
  }
  int even = ( ( A % 2 ) == 0 ) ? A . length : A . length ;
  int odd = A . length - even ;
  boolean flag = true ;
  if ( ( P == 1 ) & ( odd == 0 ) ) {
    System . out . println ( 0 ) ;
    flag = false ;
  }
  if ( flag ) {
    if ( odd == 0 ) {
      System . out . println ( 2 * even ) ;
    }
    else {
      System . out . println ( ( 2 * even ) * ( 2 * ( odd - 1 ) ) ) ;
    }
  }
  return A ;
}
