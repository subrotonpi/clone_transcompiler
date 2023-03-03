static String lines = FileUtil . readFileToString ( "A-large.txt" ) ;
int T = Integer . parseInt ( lines . get ( 0 ) ) ;
{
  int [ ] [ ] arrows = new int [ T ] [ T ] ;
  for ( int i = 0 ;
  i < arrows . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < arrows [ i ] . length ;
    j ++ ) {
      if ( arrows [ i ] [ j ] != '.' ) {
        arrows [ i ] [ j ] = arrows [ i ] [ j ] ;
      }
    }
  }
  int total = 0 ;
  for ( int i = 0 ;
  i < arrows . length ;
  i ++ ) {
    int j = arrows [ i ] [ j ] ;
    char arrow = arrows [ i ] [ j ] ;
    boolean ok = false ;
    if ( arrow == 'v' ) {
      for ( int i2 : xrange ( i + 1 , R ) ) {
        if ( arrows [ i2 ] [ j ] != '.' ) {
          ok = true ;
        }
      }
    }
    else if ( arrow == '^' ) {
      for ( int i2 : xrange ( i ) ) {
        if ( arrows [ i2 ] [ j ] != '.' ) {
          ok = true ;
        }
      }
    }
    if ( arrow == '>' ) {
      for ( int j2 : xrange ( j + 1 , C ) ) {
        if ( arrows [ i2 ] [ j2 ] != '.' ) {
          ok = true ;
        }
      }
    }
    else if ( arrow == '<' ) {
      for ( int j2 : xrange ( j ) ) {
        if ( arrows [ i2 ] [ j2 ] != '.' ) {
          ok = true ;
        }
      }
    }
    if ( ! ok ) {
      total ++ ;
      for ( int i2 : xrange ( i + 1 , R ) ) {
        if ( arrows [ i2 ] [ j ] != '.' ) {
          ok = true ;
        }
      }
      for ( int i2 : xrange ( i ) ) {
        if ( arrows [ i2 ] [ j ] != '.' ) {
          ok = true ;
        }
      }
      for ( int i2 : xrange ( j + 1 , C ) ) {
        if ( arrows [ i2 ] [ j2 ] != '.' ) {
          ok = true ;
        }
      }
      for ( int j2 : xrange ( j ) ) {
        if ( arrows [ i2 ] [ j2 ] != '.' ) {
          ok = true ;
        }
      }
      if ( ! ok ) {
        return "IMPOSSIBLE" ;
      }
    }
    