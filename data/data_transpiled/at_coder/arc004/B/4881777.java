public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  D = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D [ i ] = Integer . parseInt ( input ( ) ) ;
  System . out . println ( sum ( D ) ) ;
  System . out . println ( max ( 0 , max ( D ) * 2 - sum ( D ) ) ) ;
}
