public static final String getChars ( ) {
  final String s = input . nextLine ( ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final Set < String > chars = new TreeSet < String > ( ) ;
  chars . addAll ( Arrays . asList ( s . split ( " " ) ) ) ;
  final int n = s . length ( ) ;
  for ( int j = 0 ;
  j < Math . min ( 3 , chars . size ( ) ) ;
  j ++ ) {
    String ans = chars . get ( j ) ;
    K -- ;
    if ( K == 0 ) {
      System . out . println ( ans ) ;
      break ;
    }
    do {
      final int [ ] places = new int [ n ] ;
      int index = - 1 ;
      do {
        index = s . indexOf ( ans , index + 1 ) ;
      }
      while ( index == - 1 ) ;
      places [ index ] = index ;
    }
    while ( ans . length ( ) == s . length ( ) - places [ 0 ] ) ;
    char nextChar = 'z' ;
    for ( int k = 0 ;
    k < places . length ;
    k ++ ) {
      if ( k >= s . length ( ) - ans . length ( ) ) break ;
      nextChar = Math . min ( nextChar , s . charAt ( k + ans . length ( ) ) ) ;
    }
    ans += nextChar ;
    K -- ;
    if ( K == 0 ) {
      System . out . println ( ans ) ;
      System . exit ( 0 ) ;
    }
  }
  return s ;
}
