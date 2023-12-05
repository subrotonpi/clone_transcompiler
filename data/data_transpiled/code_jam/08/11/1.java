private static int doTrial ( Scanner in ) {
  final int N = in . nextInt ( ) ;
  List < Integer > xN = new ArrayList < > ( ) ;
  List < Integer > yN = new ArrayList < > ( ) ;
  for ( String s : in . nextLine ( ) . split ( " " ) ) {
    xN . add ( in . nextInt ( ) ) ;
    yN . add ( in . nextInt ( ) ) ;
  }
  Collections . sort ( xN ) ;
  Collections . sort ( yN ) ;
  Collections . reverse ( xN ) ;
  int t = 0 ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    t += xN . get ( n ) * yN . get ( n ) ;
  }
  return t ;
}
