static private void MFP ( ) {
  int i ;
  int Len = num ;
  L = new int [ num ] [ ] ;
  for ( i = 0 ;
  i < Len ;
  i ++ ) {
    L [ i ] [ 0 ] = i ;
  }
  {
    int a = 0 ;
    int b = 0 ;
    int x = 0 ;
  }
  @ SuppressWarnings ( "unchecked" ) int N = Integer . parseInt ( input ) , E = Integer . parseInt ( input ) ;
  int p = 0 ;
  int [ ] [ ] ab = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    Arrays . fill ( ab [ i ] , 1 ) ;
  }
  int [ ] [ ] F = new int [ T ] [ ] ;
  MFP m = new MFP ( T ) ;
  while ( Q . length > 0 ) {
    int t = Q . popLeft ( ) ;
    F [ t ] = 1 ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      if ( Data [ t ] [ i ] == 1 ) {
        m . setL ( t , i , 1 ) ;
        if ( F [ i ] == 0 ) {
          F [ i ] = 1 ;
          Q . add ( i ) ;
        }
      }
    }
  }
  {
    int t = 0 ;
    for ( int i = 0 ;
    i < X . length ;
    i ++ ) {
      Y [ i ] = n ;
    }
  }
  {
    int t = 0 ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      Y [ i ] = n ;
    }
  }
  int [ ] [ ] Y = new int [ T ] [ ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    Y [ i ] = n ;
  }
  int [ ] [ ] D = new int [ T ] [ T ] ;
  while ( S . length != 0 ) {
    int [ ] k = S . pop ( ) ;
    P [ k [ 1 ] ] = k [ 0 ] ;
    if ( L [ k [ 0 ] ] [ Len - 1 ] > 0 ) {
      P [ k [ 1 ] + 1 ] = Len - 1 ;
      return P ;
    }
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      if ( D [ i ] == 0 && L [ k [ 0 ] ] [ i ] > 0 ) {
        S [ i ] [ k [ 1 ] + 1 ] = 1 ;
        D [ i ] = 1 ;
      }
    }
  }
  