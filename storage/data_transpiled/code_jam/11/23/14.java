static void findcycles ( List < String > path , int depth ) {
  int currv = path . get ( path . size ( ) - 1 ) ;
  for ( int nextv = 0 ;
  nextv < N ;
  nextv ++ ) {
    if ( adjacent [ currv ] [ nextv ] ) {
      if ( path . contains ( nextv ) ) {
        String cycle = path . get ( path . indexOf ( nextv ) ) ;
        if ( cycle . length ( ) > 2 ) {
          cycles . add ( cycle ) ;
        }
        continue ;
      }
      findcycles ( path . toArray ( new String [ cycle . size ( ) ] ) , depth + 1 ) ;
    }
  }
  /* colour */
  List < String > colours = new ArrayList < String > ( ) ;
  int numColours ;
  int i ;
  int j ;
  int i ;
  int c ;
  int numColours = 0 ;
  if ( colours . size ( ) == N ) {
    for ( i = 0 ;
    i < cycles . size ( ) ;
    i ++ ) {
      String cycle = cycles . get ( i ) ;
      String [ ] currColours = new String [ cycle . length ( ) ] ;
      for ( j = 0 ;
      j < cycle . length ( ) ;
      j ++ ) {
        currColours [ i ] = colours . get ( cycle [ j ] ) ;
      }
      for ( i = 0 ;
      i < numColours ;
      i ++ ) {
        if ( ! currColours [ i ] . equals ( colours . get ( i ) ) ) {
          return ;
        }
      }
    }
    return ;
  }
  for ( i = 0 ;
  i < numColours ;
  i ++ ) {
    colours . add ( colour ( colours . toArray ( new String [ 0 ] ) ) ) ;
    if ( colours . size ( ) > 0 ) {
      colours . add ( colours . get ( i ) ) ;
    }
  }
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    N = Integer . parseInt ( input ( ) ) ;
    M = Integer . parseInt ( input ( ) ) ;
    U = Integer . parseInt ( input ( ) ) ;
    V = Integer . parseInt ( input ( ) ) ;
    adjacent = new boolean [ N ] [ M ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      adjacent [ 0 ] [ N - 1 ] = true ;
      adjacent [ N - 1 ] [ V - 1 ] = true ;
      adjacent [ V - 1 ] [ U - 1 ] = true ;
    }
  }
  List