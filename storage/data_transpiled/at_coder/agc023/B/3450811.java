static final void setIn ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li_ */
  map ( Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
  /* lf */
  map ( Double . parseDouble ( stdin . readLine ( ) ) ) ;
  /* ls */
  String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  String ns = stdin . readLine ( ) ;
  /* lc */
  Collections . sort ( ns ) ;
  /* ni */
  int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  double n = ni ( ) ;
  String [ ] grid = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = ns ( ) ;
    s = s + s ;
    grid [ i ] = s ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    grid [ i ] = grid [ i ] ;
  }
  String [ ] vert = new String [ 2 * n ] ;
  String [ ] hrzn = new String [ 2 * n ] ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    hrzn [ i ] = grid [ i ] ;
  }
  for ( int j = 0 ;
  j < 2 * n ;
  j ++ ) {
    String temp = "" ;
    for ( int i = 0 ;
    i < 2 * n ;
    i ++ ) {
      temp += grid [ i ] . substring ( j , j + 1 ) ;
    }
    vert [ b ] = temp ;
  }
  int ans = 0 ;
  int b = 0 ;
  for ( int a = 0 ;
  a < n ;
  a ++ ) {
    boolean ok = true ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( vert [ b + i ] . substring ( a + i , a + n ) != hrzn [ a + i ] . substring ( b + i , b + n ) ) {
        ok = false ;
        break ;
      }
    }
    if ( ok ) {
      ans ++ ;
    }
  }
  System . out . println ( ans * n ) ;
}
