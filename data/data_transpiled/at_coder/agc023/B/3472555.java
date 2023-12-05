public static void print ( int N ) {
  String [ ] Sss = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Sss [ i ] = input . nextLine ( ) ;
  List < String > Sss_tr = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Sss_tr . add ( "" ) ;
  int ans = 0 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ( Sss [ i ] . length ( ) - k ) + Sss [ i ] . substring ( 0 , Sss [ i ] . length ( ) - k ) != Sss_tr . get ( i - k ) ) break ;
    }
  }
  System . out . println ( ans ) ;
}
