@ VisibleForTesting static File getFile ( String inFile , String outFile ) {
  String problemName = "D" ;
  String testCase = "small" ;
  int attempt = 0 ;
  {
    int N = Integer . parseInt ( inFile ) ;
    int [ ] matrix = new int [ N ] ;
    for ( ;
    ;
    ) {
      matrix [ 0 ] = Integer . parseInt ( inFile ) ;
    }
    int result = solution ( N , matrix ) ;
    File outFile = new File ( outFile ) ;
    outFile . deleteOnExit ( ) ;
    if ( isValidSolution ( Arrays . asList ( people ) , Arrays . asList ( machines ) , matrix ) ) {
      return outFile ;
    }
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      if ( matrix [ i ] [ j ] == 1 ) {
        if ( ! isValidSolution ( Arrays . asList ( people ) , Arrays . asList ( machines ) , matrix ) ) {
          return outFile ;
        }
        noValidMachines = false ;
      }
    }
    if ( noValidMachines ) {
      return outFile ;
    }
  }
  {
    return isValidSolution ( Arrays . asList ( matrix ) , Arrays . asList ( matrix ) ) ;
  }
  private int solution ( int N , int [ ] [ ] matrix ) {
    if ( isValidSolution ( Arrays . asList ( matrix ) ) ) {
      return 0 ;
    }
    List < Integer > emptySlots = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      for ( int j = 0 ;
      j < N ;
      ++ j ) {
        if ( matrix [ i ] [ j ] == 0 ) {
          emptySlots . add ( new Integer ( i ) ) ;
        }
      }
    }
    for ( int result = 0 ;
    result < N + 1 ;
    ++ result ) {
      for ( List < Integer > possibleTeaching : combinations ( emptySlots , result ) ) {
        List < Integer > matrixCopy = new ArrayList < > ( ) ;
        for ( int j = 0 ;
        j < matrix . length ;
        ++ j ) {
          matrixCopy . add ( Collections . singletonList ( matrix [ j ] ) ) ;
        }
        Iterator < Integer > it = possibleTeaching . iterator ( ) ;
        while ( it . hasNext ( ) ) {
          Integer a = it . next ( ) ;
          Integer b = a . intValue ( ) ;
          matrixCopy . add ( b ) ;
        }
        if ( isValidSolution ( matrixCopy ) ) {
          return result ;
        }
      }
    }
    return - 1 ;
  }
}
