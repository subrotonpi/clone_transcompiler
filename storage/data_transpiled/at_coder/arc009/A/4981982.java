static final int N = readInt ( ) {
  final int N = readInt ( ) ;
  double sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = readInt ( ) ;
    final int b = readInt ( ) ;
    sum += a * b ;
  }
  System . out . println ( ( int ) ( sum * 1.05 ) ) ;
}
