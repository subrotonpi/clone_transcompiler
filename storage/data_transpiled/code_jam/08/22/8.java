static public int [ ] primes ( int n ) throws IOException {
  final Scanner scanner = new Scanner ( System . in ) ;
  int nc ;
  int count = 1 ;
  while ( scanner . hasNextInt ( ) ) {
    final int a = scanner . nextInt ( ) ;
    final int b = scanner . nextInt ( ) ;
    final int p = scanner . nextInt ( ) ;
    final int out = solve ( a , b , p ) ;
    System . out . println ( "Case #" + count + ":" + out ) ;
    count ++ ;
  }
  if ( Class . isPrimitive ( ) ) {
    main ( ) ;
  }
  else {
    System . out . println ( "Case #" + count ) ;
  }
  return new int [ 2 ] ;
}
