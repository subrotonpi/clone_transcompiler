static final String getNeighboringCell ( int [ ] cell , int direction ) throws IOException {
  assert direction == 0 || direction == 1 || direction == 2 || direction == 3 ;
  switch ( direction ) {
    case 0 : return ( cell [ 0 ] - 1 ) ;
    case 1 : return ( cell [ 0 ] ) ;
    case 2 : return ( cell [ 0 ] ) ;
    case 3 : return ( cell [ 0 ] ) ;
    case 4 : return ( cell [ 0 ] ) ;
    case 5 : return ( cell [ 1 ] ) ;
    case 6 : return ( cell [ 0 ] + 1 ) ;
  }
  /* solve case */
  int height = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int width = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  byte [ ] [ ] mapHeights = readMapHeights ( System . console ( ) , height , width ) ;
  Map < Integer , byte [ ] > [ ] sinkHeights = getLabelledCells ( System . console ( ) , height , width ) ;
  return "\n" + Arrays . toString ( Arrays . copyOf ( labelHeights , width ) ) ;
  /* recAddCellSink */
}
