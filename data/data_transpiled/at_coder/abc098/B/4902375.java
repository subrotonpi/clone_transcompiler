public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N - 1 ;
  i ++ ) {
    int cnt = 0 ;
    String X = s . substring ( 0 , i ) ;
    String Y = s . substring ( i ) ;
    int [ ] alpX = new int [ 26 ] ;
    int [ ] alpY = new int [ 26 ] ;
    for ( int j = 0 ;
    j < 26 ;
    j ++ ) alpX [ j ] = 0 ;
    for ( int j = 0 ;
    j < 26 ;
    j ++ ) alpY [ j ] = 0 ;
    int lenX = i ;
    int lenY = N - i ;
    for ( int j = 0 ;
    j < lenX ;
    j ++ ) alpX [ ( X . charAt ( j ) - 97 ) ] ++ ;
    for ( int j = 0 ;
    j < lenY ;
    j ++ ) alpY [ ( Y . charAt ( j ) - 97 ) ] ++ ;
    for ( int j = 0 ;
    j < 26 ;
    j ++ ) if ( alpX [ j ] != 0 && alpY [ j ] != 0 ) ++ cnt ;
    if ( ans < cnt ) ans = cnt ;
  }
  System . out . println ( Integer . toString ( ans ) ) ;
  return ans ;
}
