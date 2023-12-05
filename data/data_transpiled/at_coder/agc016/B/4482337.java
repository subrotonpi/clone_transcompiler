static final void read ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int [ ] li = map ( Integer . parseInt ( stdin . readLine ( ) ) , li ) ;
  final int [ ] li_ = map ( Integer . parseInt ( stdin . readLine ( ) ) , li ) ;
  final float [ ] lf = map ( Float . parseFloat ( stdin . readLine ( ) ) , lf ) ;
  final int [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  final String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  final int [ ] lc = list ( ns ) ;
  final int [ ] ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  final float [ ] nf = Float . parseFloat ( stdin . readLine ( ) ) ;
  final int n = ni [ 0 ] ;
  final List < Integer > a = list ( li ) ;
  boolean exist = true ;
  if ( max ( a ) - min ( a ) > 1 ) {
    exist = false ;
  }
  else if ( max ( a ) >= n ) {
    exist = false ;
  }
  else if ( max ( a ) - min ( a ) == 1 ) {
    if ( a . stream ( ) . mapToInt ( min ( a ) ) . getAsInt ( ) < max ( a ) . getAsInt ( ) && 2 * ( max ( a ) - a . stream ( ) . mapToInt ( min ( a ) ) . getAsInt ( ) ) <= a . getAsInt ( ) ) {
      exist = true ;
    }
    else {
      exist = false ;
    }
  }
  System . out . println ( exist ? "Yes" : "No" ) ;
}
