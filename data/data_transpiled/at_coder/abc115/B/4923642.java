public static void main ( int N ) {
  int N = input ( ) ;
  int list_n [ ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) list_n [ i ] = ( int ) input ( ) ;
  System . out . println ( sum ( list_n ) - max ( list_n ) / 2 ) ;
}
