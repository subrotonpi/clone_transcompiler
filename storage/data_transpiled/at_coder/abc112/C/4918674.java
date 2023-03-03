static final void solve ( int N , @ Nonnull final int [ ] x , @ Nonnull final int [ ] y , @ Nonnull final int [ ] h ) {
  int idx = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( h [ i ] > 0 ) {
      idx = i ;
      break ;
    }
  }
  for ( int cx = 0 ;
  cx < 101 ;
  cx ++ ) {
    for ( int cy = 0 ;
    cy < 101 ;
    cy ++ ) {
      final int H = h [ idx ] + Math . abs ( cx - x [ idx ] ) + Math . abs ( cy - y [ idx ] ) ;
      boolean found = true ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int tmpH = Math . max ( H - Math . abs ( cx - x [ i ] ) - Math . abs ( cy - y [ i ] ) , 0 ) ;
        if ( tmpH != h [ i ] ) {
          found = false ;
          break ;
        }
      }
      if ( H > 0 && found ) {
        System . out . println ( cx + " " + cy + " " + H ) ;
        return ;
      }
    }
  }
  System . out . println ( "error" ) ;
  return ;
}
