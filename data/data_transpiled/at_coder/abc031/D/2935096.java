public static void f ( int K , int N ) {
  String [ ] gt = new String [ K ] ;
  String [ ] vs = new String [ N ] , ws = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    vs [ i ] = input . split ( " " ) [ 0 ] ;
    ws [ i ] = input . split ( " " ) [ 1 ] ;
  }
  f ( 0 , 0 , 0 ) ;
}
