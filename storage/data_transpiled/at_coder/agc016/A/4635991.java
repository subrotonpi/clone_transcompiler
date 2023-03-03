public static void input ( Scanner scanner ) {
  String s = scanner . nextLine ( ) ;
  List < Integer > s_list = new LinkedList < Integer > ( s ) ;
  List < Integer > minis = new ArrayList < Integer > ( ) ;
  for ( int k : new HashSet < Integer > ( s ) ) {
    int [ ] a = new int [ s_list . size ( ) ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      if ( s_list . get ( i ) == k ) {
        a [ i ] = i ;
      }
    }
    int mini = Math . max ( a [ 0 ] , 0 ) ;
    for ( int m = 0 ;
    m < a . length - 1 ;
    m ++ ) {
      mini = Math . max ( a [ m + 1 ] - a [ m ] - 1 , mini ) ;
    }
    mini = Math . max ( s . length ( ) - a [ a . length - 1 ] - 1 , mini ) ;
    minis . add ( mini ) ;
  }
  System . out . println ( min ( minis ) ) ;
}
