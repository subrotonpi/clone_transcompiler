static final int [ ] binarySearch ( int N , int M ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] al = new int [ N ] ;
  int [ ] bl = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    al [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    bl [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int a = 0 , b = 0 ;
  int t = 0 ;
  int ans = 0 ;
  while ( al [ al . length - 1 ] >= t && bl [ bl . length - 1 ] >= t ) {
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a >= N - 1 && al [ al . length - 1 ] < t ) break ;
    t = al [ a ] + X ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( b >= M - 1 && bl [ bl . length - 1 ] < t ) break ;
    ans ++ ;
    t = bl [ b ] + Y ;
  }
  System . out . println ( ans ) ;
}
