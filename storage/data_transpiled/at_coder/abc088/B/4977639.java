public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] Ai = input . split ( " " ) ;
  Arrays . sort ( Ai ) ;
  Arrays . sort ( Ai ) ;
  int Alice = 0 ;
  int Bob = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) Alice += Ai [ i ] ;
    else Bob += Ai [ i ] ;
  }
  System . out . println ( Alice - Bob ) ;
}
