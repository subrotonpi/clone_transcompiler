public static void getChecks ( PriorityQueue < Integer > lefts , PriorityQueue < Integer > rights , boolean [ ] used ) {
  /* left check */
  int e , i ;
  /* right check */
  while ( lefts . size ( ) > 0 ) {
    e = lefts . poll ( ) ;
    i = i ;
    if ( ! used [ i ] ) break ;
    /* else return */
    used [ i ] = true ;
    if ( pos >= e ) return ;
    /* left check */
  }
  /* right check */
  while ( rights . size ( ) > 0 ) {
    e = rights . poll ( ) ;
    i = i ;
    if ( ! used [ i ] ) break ;
    /* else return */
    used [ i ] = true ;
    if ( pos <= e ) return ;
    /* left check */
  }
  /* simulate */
  int ans = 0 ;
  int pos = 0 ;
  java . util . PriorityQueue < Integer > lefts = lefts . clone ( ) ;
  java . util . PriorityQueue < Integer > rights = rights . clone ( ) ;
  used = new boolean [ n ] ;
  lefts . clear ( ) ;
  rights . clear ( ) ;
  used [ 0 ] = false ;
  /* left check */
  int leftCheck = getChecks ( lefts , rights , used ) ;
  rights . clear ( ) ;
  funcs = leftFirst ? new funcs [ ] {
    rightCheck , leftCheck }
    : new funcs [ ] {
      rightCheck , leftCheck }
      ;
      int dir = 0 ;
      while ( true ) {
        Integer e = funcs [ dir ] . run ( pos ) ;
        if ( e == null ) break ;
        ans += Math . abs ( e - pos ) ;
        pos = e ;
        dir ^= 1 ;
      }
      ans += Math . abs ( pos ) ;
      /* return ans; */
      n = Integer . parseInt ( input . nextLine ( ) ) ;
      lefts = new ArrayList < > ( ) ;
      rights = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int l = Integer . parseInt ( input . nextLine ( ) ) ;
        int r = Integer . parseInt ( input . nextLine ( ) ) ;
        lefts . add ( new Integer ( l ) ) ;
        rights . add ( new Integer ( r ) ) ;
      }
      Collections . sort ( lefts ) ;
      Collections . sort ( rights ) ;
      int lf = simulate ( true ) ;
      int rf = simulate ( false )