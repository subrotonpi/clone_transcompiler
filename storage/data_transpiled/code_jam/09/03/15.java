static final String S = "welcome to code jam" ;
final int LS = S . length ( ) ;
{
  int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int I = 0 ;
  I < n ;
  I ++ ) {
    String L = readLine ( ) . trim ( ) ;
    int LL = L . length ( ) ;
    int [ ] [ ] t = new int [ LS + 1 ] [ LL + 1 ] ;
    for ( int j = 0 ;
    j < LL + 1 ;
    j ++ ) t [ 0 ] [ j ] = 1 ;
    for ( int i = 1 ;
    i <= LS ;
    i ++ ) {
      for ( int j = 1 ;
      j <= LL + 1 ;
      j ++ ) {
        if ( S . charAt ( i - 1 ) == L . charAt ( j - 1 ) ) t [ i ] [ j ] = t [ i ] [ j - 1 ] + t [ i - 1 ] [ j ] ;
        else t [ i ] [ j ] = t [ i ] [ j - 1 ] ;
      }
    }
    System . out . printf ( "Case #%d: %04d\n" , I + 1 , t [ LS ] [ LL ] % 10000 ) ;
  }
}
