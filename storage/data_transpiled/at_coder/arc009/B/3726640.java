public static void print ( String b ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> a = new ArrayList < List < String >> ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( new ArrayList < String > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int su = 0 ;
    int l = a . get ( i ) . size ( ) ;
    for ( int j = 0 ;
    j < l ;
    j ++ ) {
      su += b . indexOf ( a . get ( i ) . get ( j ) ) * 10 * ( l - j - 1 ) ;
    }
    a . set ( i , new ArrayList < String > ( a . get ( i ) ) . add ( su ) ) ;
  }
  Collections . sort ( a , new Comparator < List < String >> ( ) {
    @ Override public int compare ( List < String > o1 , List < String > o2 ) {
      return o2 . get ( 1 ) . compareTo ( o1 . get ( 0 ) ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < a . get ( i ) . size ( ) ;
    j ++ ) {
      System . out . print ( a . get ( i ) . get ( j ) + " " ) ;
    }
    System . out . println ( ) ;
  }
}
