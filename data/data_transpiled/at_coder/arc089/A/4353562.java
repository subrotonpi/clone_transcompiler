public static String N = Integer . parseInt ( input ) {
  List < Pair < Integer , Point >> t = new LinkedList < > ( ) ;
  t = new ArrayList < > ( ) ;
  t . add ( new Pair < > ( 0 , new Point ( 0 , 0 ) ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int T = Integer . parseInt ( input . readLine ( ) ) ;
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    t . add ( new Pair < > ( T , new Point ( a , b ) ) ) ;
  }
  String ans = "Yes" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int n = Math . abs ( t . get ( i ) . getSecond ( ) . x - t . get ( i + 1 ) . getSecond ( ) . x ) + Math . abs ( t . get ( i ) . getSecond ( ) . y - t . get ( i + 1 ) . getSecond ( ) . y ) ;
    if ( ( n % 2 != ( t . get ( i + 1 ) . getSecond ( ) . x - t . get ( i ) . getSecond ( ) . x ) ) || n > ( t . get ( i + 1 ) . getSecond ( ) . x - t . get ( i ) . getSecond ( ) . x ) ) {
      ans = "No" ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
