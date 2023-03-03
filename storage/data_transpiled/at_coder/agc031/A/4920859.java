public static int n = Integer . parseInt ( input ) {
  String s = new Scanner ( input ) . next ( ) ;
  int [ ] [ ] box = new int [ 26 ] [ ] ;
  char [ ] alfa = new char [ 26 ] ;
  for ( int i = 0 ;
  i < alfa . length ;
  i ++ ) {
    alfa [ i ] = ( char ) ( 'a' + i ) ;
  }
  int ans = 1 ;
  for ( int hoge = 0 ;
  hoge < alfa . length ;
  hoge ++ ) {
    ans *= box [ hoge ] [ 1 ] + 1 ;
  }
  return ans ;
}
