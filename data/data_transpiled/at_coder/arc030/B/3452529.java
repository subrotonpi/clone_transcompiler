public static void main ( String input ) {
  int n = input . length ( ) ;
  int x = input . charAt ( 0 ) ;
  int [ ] r = new int [ n + 1 ] ;
  int [ ] H = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    H [ i ] = 0 ;
  }
  List < List < Integer >> T = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T . add ( i ) ;
  }
  T . add ( H ) ;
}
