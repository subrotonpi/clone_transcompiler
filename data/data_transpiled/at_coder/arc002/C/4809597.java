@ VisibleForTesting static Iterable < String > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] c = input . split ( " " ) ;
  String [ ] w = {
    "A" , "B" , "X" , "Y" }
    ;
    List < String > s = Arrays . asList ( w ) ;
    double ans = Double . POSITIVE_INFINITY ;
    Iterator < String > it = s . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      String key1 = it . next ( ) ;
      String key2 = it . next ( ) ;
      int i = 0 ;
      int count = 0 ;
      while ( i < n ) {
        if ( i < n - 1 && ( c [ i ] + c [ i + 1 ] == key1 || c [ i ] + c [ i + 1 ] == key2 ) ) {
          i += 2 ;
          count ++ ;
        }
        else {
          i ++ ;
          count ++ ;
        }
      }
      ans = Math . min ( ans , count ) ;
    }
    System . out . println ( ans ) ;
    return s ;
  }
  