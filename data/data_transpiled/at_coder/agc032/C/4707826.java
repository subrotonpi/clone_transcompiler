static boolean ta ( int x , int y , int [ ] [ ] p ) {
  final int xc = 0 ;
  final int yc = 0 ;
  for ( int i = 0 ;
  i < p [ x ] . length ;
  i ++ ) {
    int bc = x ;
    int c = i ;
    do {
      if ( c == x ) {
        xc ++ ;
        break ;
      }
      else if ( c == y ) {
        yc ++ ;
        break ;
      }
      int [ ] cs = p [ c ] ;
      for ( int j = 0 ;
      j < cs . length ;
      j ++ ) {
        if ( cs [ j ] != bc ) {
          bc = c ;
          c = cs [ j ] ;
          break ;
        }
      }
    }
    while ( c != y ) ;
    if ( xc == yc ) return true ;
    else return false ;
  }
  final int [ ] d = new int [ 4 ] ;
  final int [ ] p = new int [ 4 ] ;
  final String n = input . nextLine ( ) . trim ( ) ;
  final int m = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < Integer . parseInt ( n ) ;
  i ++ ) {
    d [ i ] = 0 ;
    p [ i ] = new LinkedList < Integer > ( ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    x = input . nextLine ( ) . trim ( ) ;
    y = input . nextInt ( ) ;
    x = Integer . parseInt ( x ) ;
    y = Integer . parseInt ( y ) ;
    d [ x ] ++ ;
    d [ y ] ++ ;
    p [ x ] . add ( y ) ;
    p [ y ] . add ( x ) ;
  }
  boolean r = false ;
  int fc = 0 ;
  final int [ ] fcs = new int [ 4 ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    y = d [ i ] ;
    if ( y % 2 != 0 ) {
      r = false ;
      break ;
    }
    if ( y >= 6 ) {
      r = true ;
    }
    if ( y >= 4 ) {
      fc ++ ;
      fcs [ fc ] = i ;
    }
  }
  if ( r == null ) {
    if ( fc >= 3 ) {
      r = true ;
    }
    else if ( fc == 2 ) {
      x = fcs [ 0 ] ;
      y = fcs [ 1 ] ;
      r = ta ( x , y , p ) ;
    }
    else {
      r = false ;
    }
  }
  if ( r ) {
    System . out . println ( "Yes"