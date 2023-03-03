public static int [ ] getDistance ( ) {
  String S = input ( ) ;
  int [ ] dif = new int [ S . length ( ) - 2 ] ;
  for ( int i = 0 ;
  i < dif . length ;
  i ++ ) {
    dif [ i ] = Math . abs ( 753 - Integer . parseInt ( S . substring ( i , i + 3 ) ) ) ;
  }
  return dif ;
}
