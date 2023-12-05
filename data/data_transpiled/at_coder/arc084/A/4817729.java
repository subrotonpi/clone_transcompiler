static final int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  int [ ] C = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( B ) ;
  Arrays . sort ( C ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int count_a = binarySearch ( A , B [ i ] ) ;
    int count_c = N - binarySearch ( C , B [ i ] ) ;
    ans += count_a * count_c ;
  }
  System . out . println ( ans ) ;
}
