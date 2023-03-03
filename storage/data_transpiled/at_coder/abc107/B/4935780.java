public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  String [ ] a = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a [ i ] = input . split ( " " ) ;
  }
  Arrays . sort ( a ) ;
  List < Integer > sharp = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    int flg = 0 ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      if ( a [ j ] . charAt ( i ) == '#' ) {
        flg = 1 ;
      }
    }
    if ( flg == 1 ) {
      sharp . add ( i ) ;
    }
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    String ans = "" ;
    for ( int j = 0 ;
    j < sharp . size ( ) ;
    j ++ ) {
      ans += a [ i ] . charAt ( sharp . get ( j ) ) ;
    }
    System . out . println ( ans ) ;
  }
}
