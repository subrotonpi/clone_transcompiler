public static void print ( String [ ] input ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int M = Integer . parseInt ( input [ 1 ] ) ;
  List < Line > PY = new ArrayList < Line > ( ) ;
  List < Integer > DD = new ArrayList < Integer > ( N + 1 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int P = Integer . parseInt ( input [ 2 ] ) ;
    int Y = Integer . parseInt ( input [ 3 ] ) ;
    PY . add ( new Line ( P , Y , i , "" ) ) ;
  }
  Collections . sort ( PY ) ;
  List < Line > DY = new ArrayList < Line > ( ) ;
  for ( int i = 0 ;
  i < PY . size ( ) ;
  i ++ ) {
    DY . add ( new Line ( PY . get ( i ) . _2 , String . valueOf ( PY . get ( i ) . _1 ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ").replaceAll(" ▁ "," "" ) . replaceAll ( " " , "" ").replaceAll(" ▁ "," "" ) . replaceAll ( " " , ""