public static int [ ] getA ( String input , int B ) {
  List < String > listA = new ArrayList < String > ( ) ;
  List < String > listB = new ArrayList < String > ( ) ;
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int k = 0 ;
  k < 3 ;
  k ++ ) {
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      if ( k == 0 && i == 0 ) {
      }
      else {
        List < String > T = new LinkedList < String > ( ) ;
        T . add ( String . valueOf ( A ) ) ;
        T . set ( k , String . valueOf ( i ) ) ;
        String temp = "" ;
        for ( int j = 0 ;
        j < 3 ;
        j ++ ) {
          temp += T . get ( j ) ;
        }
        listB . add ( temp . replaceAll ( " " , "" ) ) ;
      }
    }
  }
  return listA . toArray ( ) ;
}
