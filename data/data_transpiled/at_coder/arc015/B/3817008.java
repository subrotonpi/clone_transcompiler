public static int N = Integer . parseInt ( input ) {
  int one = 0 ;
  int two = 0 ;
  int three = 0 ;
  int four = 0 ;
  int five = 0 ;
  int six = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double high = ( Double . parseDouble ( input . nextLine ( ) ) ) ;
    double low = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( high >= 35 ) {
      one ++ ;
    }
    if ( high >= 30 && high < 35 ) {
      two ++ ;
    }
    if ( low >= 25 && high < 30 ) {
      three ++ ;
    }
    if ( low >= 25 && high < 30 ) {
      five ++ ;
    }
    if ( low >= 0 ) {
      five ++ ;
    }
    if ( high < 0 ) {
      six ++ ;
    }
  }
  return one ;
}
