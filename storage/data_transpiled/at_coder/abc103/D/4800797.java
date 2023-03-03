static final int [ ] [ ] solve ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  List < List < Student >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab . add ( Collections . singletonList ( new Student ( input ) ) ) ;
  }
  Collections . sort ( ab , new Comparator < Student > ( ) {
    @ Override public int compare ( Student student , Student s1 ) {
      return s1 . compareTo ( s1 ) ;
    }
  }
  ) ;
  int [ ] temp = {
    0 , 0 }
    ;
    int count = 0 ;
    for ( List < Student > list : ab ) {
      if ( list . get ( 0 ) <= temp [ 0 ] && temp [ 1 ] <= list . get ( 1 ) ) {
        continue ;
      }
      else {
        temp [ 0 ] = list . get ( 1 ) - 1 ;
        temp [ 1 ] = list . get ( 1 ) ;
        count ++ ;
      }
    }
    System . out . println ( count ) ;
    return temp ;
  }
  