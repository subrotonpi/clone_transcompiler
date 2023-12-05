public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > numbers = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    numbers . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int [ ] sums = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < sums . length ;
  i ++ ) {
    sums [ i ] = sums [ i - 1 ] + numbers . get ( i ) ;
  }
  Arrays . sort ( sums ) ;
  String temp = "" ;
  int count = 0 ;
  long res = 0 ;
  for ( int i = 0 ;
  i < sums . length ;
  i ++ ) {
    if ( temp . equals ( sums [ i ] ) ) {
      count ++ ;
    }
    else {
      if ( count >= 2 ) {
        int c = 1 ;
        for ( int j = count - 1 ;
        j <= count ;
        j ++ ) {
          c *= j ;
        }
        res += c / 2 ;
      }
      count = 1 ;
      temp = sums [ i ] ;
    }
  }
  System . out . println ( Integer . toString ( res ) ) ;
}
