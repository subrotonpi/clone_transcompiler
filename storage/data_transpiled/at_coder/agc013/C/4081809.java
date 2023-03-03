public static int [ ] getAnts ( ) {
  int N = Integer . parseInt ( input . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int L = Integer . parseInt ( input . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int T = Integer . parseInt ( input . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int [ ] ants = new int [ N ] ;
  int numberOneIndex = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) . split ( " " ) [ 0 ] ) ;
    int w = Integer . parseInt ( input . readLine ( ) . split ( " " ) [ 1 ] ) ;
    ants [ i ] = ( int ) ( ( x + ( 3 - w * 2 ) * T ) % L ) ;
    numberOneIndex += ( x + ( 3 - w * 2 ) * T ) / L ;
  }
  Arrays . sort ( ants ) ;
  numberOneIndex %= N ;
  int [ ] result = new int [ N ] ;
  System . arraycopy ( ants , 0 , result , 0 , numberOneIndex ) ;
  System . arraycopy ( result , 0 , result , numberOneIndex , N ) ;
  for ( int x : result ) {
    System . out . println ( x ) ;
  }
  return result ;
}
