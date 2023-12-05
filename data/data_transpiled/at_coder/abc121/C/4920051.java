static final int [ ] combinations ( int N , int M ) {
  int [ ] AB = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    AB [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  int count = 0 ;
  for ( int a = 0 ;
  a < AB . length ;
  a ++ ) {
    int b = AB [ a ] ;
    if ( M - count <= b ) {
      ans += ( M - count ) * a ;
      break ;
    }
    else {
      count += b ;
      ans += a * b ;
    }
  }
  System . out . println ( ans ) ;
  return AB ;
}
