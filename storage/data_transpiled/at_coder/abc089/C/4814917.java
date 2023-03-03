public static void print ( int N = Integer . parseInt ( input ) ) {
  String march = "MARCH" ;
  int [ ] l = new int [ march . length ( ) ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String S = input . next ( ) ;
    for ( int j = 0 ;
    j < march . length ( ) ;
    j ++ ) {
      if ( S . charAt ( 0 ) == march . charAt ( j ) ) {
        l [ j ] ++ ;
      }
    }
  }
  int [ ] tmp = new int [ N ] ;
  int lenl = l . length ;
  for ( int i = 0 ;
  i < lenl ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < lenl ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < lenl ;
      k ++ ) {
        tmp [ k ] = l [ i ] * l [ j ] * l [ k ] ;
      }
    }
  }
  System . out . println ( Arrays . toString ( tmp ) ) ;
}
