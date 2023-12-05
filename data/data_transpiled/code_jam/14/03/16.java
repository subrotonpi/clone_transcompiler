public static boolean [ ] [ ] solve ( int m , int n , int squares ) throws IOException {
  if ( squares == 1 ) {
    return solve ( m , n , i , j ) ;
  }
  if ( m == 1 ) {
    return solve ( m , n , i , j ) ;
  }
  if ( n == 1 ) {
    return solve ( m , n , i , j ) ;
  }
  for ( int i = 2 ;
  i <= m ;
  i ++ ) {
    for ( int j = 2 ;
    j <= n ;
    j ++ ) {
      int border = squares - ( i * j ) ;
      if ( border == 0 ) {
        return build ( m , n , i , j , 0 , 0 ) ;
      }
      int side1 = i - m < 0 ? j : 0 ;
      int side2 = j - n < 0 ? i : 0 ;
      if ( border > side1 + side2 ) continue ;
      for ( int alloc = 0 ;
      alloc < border + 1 ;
      alloc ++ ) {
        if ( alloc <= side1 && border - alloc <= side2 && alloc != 1 && border - alloc != 1 ) {
          return build ( m , n , i , j , border - alloc , alloc ) ;
        }
      }
    }
  }
  /* build(m, n, i, j, a, b) */
  return solve ( m , n , i , j , a , b ) ;
  /* show() */
}
