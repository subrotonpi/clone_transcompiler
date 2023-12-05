static final int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > nums = new ArrayList < > ( ) ;
  String [ ] preNums = {
    "3" , "5" , "7" }
    ;
    for ( int i = 3 ;
    i < 10 ;
    i ++ ) {
      for ( String ids : Splitter . on ( ',' ) . split ( preNums ) ) {
        if ( ids . contains ( "3" ) && ids . contains ( "5" ) && ids . contains ( "7" ) ) {
          nums . add ( Integer . parseInt ( StringUtils . trimToEmpty ( ids ) ) ) ;
        }
      }
    }
    for ( int i = 0 ;
    i < nums . size ( ) ;
    i ++ ) {
      int num = nums . get ( i ) ;
      if ( n < num ) {
        System . out . println ( i ) ;
        break ;
      }
    }
    else {
      System . out . println ( nums . size ( ) ) ;
    }
    return nums . toArray ( new Integer [ nums . size ( ) ] ) ;
  }
  