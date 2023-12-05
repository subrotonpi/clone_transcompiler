static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = input . nextInt ( ) ;
  int A = input . nextInt ( ) ;
  int B = input . nextInt ( ) ;
  int [ ] hp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) hp [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int diff = A - B ;
  /* Check for negative HP */
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( hp [ i ] - B * i <= 0 ) break ;
    else cnt += ceil ( ( hp [ i ] - B * i ) / diff ) ;
  }
  /* Solve 2 */
  Arrays . sort ( hp ) ;
  int mi = HP [ 0 ] / A ;
  int ma = ceil ( HP [ 0 ] / B ) ;
  while ( mi <= ma ) {
    int mid = ( mi + ma ) / 2 ;
    if ( check ( mid , hp ) ) ma = mid - 1 ;
    else mi = mid + 1 ;
  }
  System . out . println ( mi ) ;
  /* Solve 3 */
  int [ ] l = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) l [ i ] = hp [ i ] - B * i ;
  int ret = 0 ;
  for ( int a : l ) {
    if ( a <= 0 ) continue ;
    else ret += ceil ( a / diff ) ;
  }
  /* Solve 4 */
  mi = max ( hp ) / A ;
  ma = ceil ( max ( hp ) / B ) ;
  while ( mi <= ma ) {
    int mid = ( mi + ma ) / 2 ;
    if ( check ( mid , hp ) ) ma = mid - 1 ;
    else mi = mid + 1 ;
  }
  System . out . println ( mi ) ;
}
