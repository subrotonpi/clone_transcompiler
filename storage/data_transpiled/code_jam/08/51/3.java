static final Scanner getScanner ( Scanner iScanner ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int [ ] a = new int [ 2 ] ;
  int [ ] idx2 = scanner . nextLine ( ) . split ( " " ) ;
  final int [ ] [ ] res = new int [ 2 ] [ 2 ] ;
  final int T = scanner . nextLine ( ) . split ( " " ) . length ;
  final int [ ] [ ] res = new int [ T ] [ 2 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = scanner . nextLine ( ) . split ( " " ) ;
  }
  final int [ ] [ ] res = new int [ 2 ] [ 2 ] ;
  for ( int i = - 100 ;
  i < res . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < res [ i ] . length ;
    j ++ ) {
      if ( res [ i ] [ j ] == 'F' ) {
        res [ i ] = scanner . nextLine ( ) . split ( " " ) [ j ] [ 0 ] ;
      }
      else {
        res [ i ] = scanner . nextLine ( ) . split ( " " ) [ j ] [ 0 ] ;
      }
    }
  }
  final int [ ] [ ] res = new int [ 2 ] [ 2 ] ;
  int diridx = 0 ;
  for ( int i = - 1 ;
  i < res . length - 1 ;
  i ++ ) {
    if ( res [ i ] [ 0 ] == 'F' ) {
      res [ i ] [ 0 ] = scanner . nextLine ( ) . split ( " " ) [ j ] [ 0 ] ;
    }
    else if ( res [ i ] [ 1 ] == 'R' ) {
      diridx ++ ;
    }
  }
  final int [ ] [ ] res = new int [ 2 ] [ 2 ] ;
  int idx = 0 ;
  for ( int i = 0 ;
  i < res . length ;
  i ++ ) {
    if ( res [ i ] [ 0 ] == 'F' ) {
      res [ idx ++ ] = scanner . nextLine ( ) . split ( " " ) [ 0 ] ;
    }
    else {
      res [ idx ++ ] = scanner . nextLine ( ) . split ( " " ) [ 0 ] ;
    }
  }
  if ( res [ idx ] == 'L' ) {
    res [ idx ++ ] = scanner . nextLine ( ) . split ( " " ) [