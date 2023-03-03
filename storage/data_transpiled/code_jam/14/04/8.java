public static boolean win ( int [ ] n , int [ ] k ) {
  return Arrays . stream ( xrange ( n . length ) ) . allMatch ( i -> n [ i ] > k [ i ] ) ;
}
