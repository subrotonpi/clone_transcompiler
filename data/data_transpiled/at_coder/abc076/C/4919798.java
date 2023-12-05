public static void input ( ) {
  String Sd = input ( ) ;
  String T = input ( ) ;
  Sd = Sd . substring ( 0 , Sd . length ( ) - 1 ) ;
  int len = T . length ( ) ;
  boolean flg = false ;
  for ( int s = 0 ;
  s < Sd . length ( ) - len + 1 ;
  s ++ ) {
    int cnt = 0 ;
    for ( int t = 0 ;
    t < len ;
    t ++ ) {
      if ( Sd . substring ( s + t , s + t + 1 ) . equals ( T ) || Sd . substring ( s + t , s + t + 1 ) . equals ( "?" ) ) {
        cnt ++ ;
      }
      else {
        continue ;
      }
    }
    if ( cnt == len ) {
      String S = Sd . replace ( Sd . substring ( s , s + len ) , T , 1 ) ;
      S = S . replace ( "?" , "a" ) ;
      System . out . println ( S . substring ( 0 , S . length ( ) - 1 ) ) ;
      flg = true ;
      break ;
    }
  }
  if ( flg == false ) {
    System . out . println ( "UNRESTORABLE" ) ;
  }
}
