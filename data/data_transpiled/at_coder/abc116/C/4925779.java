public static int a = Integer . parseInt ( input ) {
  String [ ] b = input . split ( " " ) ;
  int len = b . length ;
  int [ ] check = new int [ len ] ;
  int [ ] length = new int [ len ] ;
  int head = 0 ;
  int foot = 0 ;
  int many = 0 ;
  for ( int i = 0 ;
  i <= a ;
  i ++ ) {
    length [ i ] = 0 ;
    check [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i <= a ;
  i ++ ) {
    if ( b [ i ] == length [ i ] ) {
      check [ i ] = 1 ;
    }
    else {
      dum = 0 ;
    }
  }
  for ( int i = 0 ;
  i <= a ;
  i ++ ) {
    if ( check [ i ] == 0 ) {
      head = i ;
    }
    else {
      dum = 0 ;
    }
  }
  for ( int i = head ;
  i <= a ;
  i ++ ) {
    if ( check [ i ] == 1 ) {
      foot = i ;
      break ;
    }
    else {
      foot = a ;
      dum = 0 ;
    }
  }
  while ( sum ( check ) != a ) {
    for ( int i = head ;
    i <= foot ;
    i ++ ) {
      length [ i ] ++ ;
    }
    for ( int i = 0 ;
    i <= a ;
    i ++ ) {
      if ( b [ i ] == length [ i ] ) {
        check [ i ] = 1 ;
      }
      else {
        dum = 0 ;
      }
    }
    for ( int i = head ;
    i <= a ;
    i ++ ) {
      if ( check [ i ] == 1 ) {
        foot = i ;
        break ;
      }
      else {
        foot = a ;
      }
    }
    many ++ ;
  }
  System . out . println ( many ) ;
  return many ;
}
