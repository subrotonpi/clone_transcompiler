public static void BlueCard ( ) {
  BlueCard = new int [ Integer . parseInt ( input ( ) ) ] ;
  Red_Card = new int [ Integer . parseInt ( input ( ) ) ] ;
  Ans [ ] = new int [ 1 ] ;
  for ( int i = 0 ;
  i < Integer . MAX_VALUE ;
  i ++ ) {
    ans [ i ] = BlueCard . count ( i ) - Red_Card . count ( i ) ;
  }
  System . out . println ( max ( ans ) ) ;
}
