static final void solve ( int it ) {
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  List < Tuple < String , Integer >> words = new ArrayList < > ( ) ;
  for ( ;
  it < n ;
  it ++ ) {
    String line = System . console ( ) . readLine ( ) ;
    words . add ( new Tuple < > ( line . trim ( ) . split ( " " ) ) ) ;
  }
  int ans = 0 ;
  for ( boolean mask : new boolean [ ] {
    true , false }
    ) {
      int newans = n - Integer . numberOfLeadingZeros ( mask ) ;
      if ( newans <= ans ) continue ;
      Set < String > firstWords = new HashSet < > ( ) ;
      for ( int i = 0 ;
      i < words . size ( ) ;
      i ++ ) {
        if ( mask [ i ] ) {
          firstWords . add ( words . get ( i ) . x ) ;
        }
        Set < String > secondWords = new HashSet < > ( ) ;
        for ( int i = 0 ;
        i < words . size ( ) ;
        i ++ ) {
          if ( mask [ i ] ) {
            secondWords . add ( words . get ( i ) . y ) ;
          }
        }
      }
      boolean good = true ;
      for ( int i = 0 ;
      i < words . size ( ) ;
      i ++ ) {
        Tuple < String , Integer > w = words . get ( i ) ;
        if ( ! firstWords . contains ( w . x ) || ! secondWords . contains ( w . y ) ) {
          good = false ;
          break ;
        }
      }
      if ( good ) ans = newans ;
    }
    System . console ( >> System . err ) . println ( it ) ;
    System . console ( "Case #" + it + ": " + ans ) ;
    int iters = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int it = 0 ;
    it < iters ;
    it ++ ) {
      solve ( it + 1 ) ;
    }
  }
  