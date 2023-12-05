static final void solve ( ) throws IOException {
  InputStream in = new FileInputStream ( "a-large.in" ) ;
  OutputStream out = new FileOutputStream ( "a.out" ) ;
  System . in = in ;
  System . out = out ;
  /* Check if winner is 'R' */
  if ( winner == 'S' ) {
    return 'S' ;
  }
  if ( winner == 'S' ) {
    return 'P' ;
  }
  if ( winner == 'P' ) {
    return 'R' ;
  }
  assert false ;
  /* Check if winner is 'R' */
  if ( n == 0 ) {
    return winner ;
  }
  int other = calc ( winner ) ;
  int l = check ( n - 1 , other ) ;
  int r = check ( n - 1 , other ) ;
  if ( l < r ) {
    return ;
  }
  else {
    return ;
  }
}
