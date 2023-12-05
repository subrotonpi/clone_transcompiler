static final int [ ] getSortingList ( ) {
  final int N [ ] = input . nextInt ( ) ;
  final int K = input . nextInt ( ) ;
  final List < Integer > dList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N . length ;
  i ++ ) {
    dList . add ( Integer . parseInt ( input . next ( ) ) ) ;
  }
  final List < Integer > useList = new ArrayList < > ( ) ;
  for ( int d : dList ) {
    useList . remove ( d ) ;
  }
  final StringBuffer result = new StringBuffer ( ) ;
  if ( Integer . parseInt ( N [ 0 ] ) > Math . max ( useList . size ( ) ) ) {
    if ( useList . get ( 0 ) != 0 ) {
      result . append ( useList . get ( 0 ) ) ;
    }
    else {
      result . append ( useList . get ( 1 ) ) ;
    }
    result . append ( useList . get ( 0 ) ) ;
  }
  else {
    for ( int i = 0 ;
    i < N . length ;
    i ++ ) {
      final int a = Integer . parseInt ( N [ i ] ) ;
      if ( useList . contains ( a ) ) {
        result . append ( N [ i ] ) ;
        continue ;
      }
      else {
        int count = 0 ;
        if ( a > Math . max ( useList . size ( ) ) ) {
          while ( ! Math . max ( useList . size ( ) , Integer . parseInt ( result . toString ( ) ) ) ) {
            count ++ ;
            result . setLength ( 0 ) ;
            if ( result . length ( ) == 0 ) {
              break ;
            }
          }
          if ( result . length ( ) == 0 ) {
            if ( useList . get ( 0 ) != 0 ) {
              result . append ( useList . get ( 0 ) ) ;
            }
            else {
              result . append ( useList . get ( 1 ) ) ;
            }
            result . append ( useList . get ( 0 ) ) ;
            break ;
          }
          count ++ ;
          final int sect = Integer . parseInt ( result . toString ( ) ) ;
          result . setLength ( 0 ) ;
          result . append ( useList . get ( binarySearch ( useList , sect ) ) ) ;
          result . append ( useList . get ( 0 ) ) ;
        }
        else {
          result . append ( useList . get ( binarySearch ( useList , a ) ) ) ;
          result . append ( useList . get ( 0 ) ) ;
          result . append ( i