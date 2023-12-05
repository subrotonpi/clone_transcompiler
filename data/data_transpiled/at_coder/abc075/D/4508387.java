public static void input ( int n , int k ) {
  List < List < Integer >> list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    list . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int answer = 10 * 100 ;
  List < Integer > sortx = new ArrayList < > ( list ) ;
  Collections . sort ( sortx , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  for ( int a = 0 ;
  a < n - k + 1 ;
  a ++ ) {
    Integer pt1 = sortx . get ( a ) ;
    for ( int b = a + k - 1 ;
    b < sortx . size ( ) ;
    b ++ ) {
      Integer pt2 = sortx . get ( b + k - 1 ) ;
      List < Integer > sorty = new ArrayList < > ( sortx . subList ( a , a + k + b ) ) ;
      int sortyLen = sorty . size ( ) ;
      for ( int c = 0 ;
      c < sortyLen - k + 1 ;
      c ++ ) {
        Integer pt3 = sorty . get ( c + k - 1 ) ;
        Integer pt4 = sorty . get ( c + k - 1 ) ;
        if ( pt3 . intValue ( ) <= pt1 . intValue ( ) && pt3 . intValue ( ) <= pt2 . intValue ( ) && pt4 . intValue ( ) >= pt1 . intValue ( ) && pt4 . intValue ( ) >= pt2 . intValue ( ) ) {
          answer = Math . min ( answer , ( pt2 . intValue ( ) - pt1 . intValue ( ) ) * ( pt4 . intValue ( ) - pt3 . intValue ( ) ) ) ;
        }
      }
    }
  }
  System . out . println ( answer ) ;
}
