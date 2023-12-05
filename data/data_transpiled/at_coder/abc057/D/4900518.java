public static int N ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  List < Integer > V = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) V . add ( Integer . parseInt ( input ) ) ;
  Collections . sort ( V , Collections . reverseOrder ( ) ) ;
  int [ ] AVERAGE = V . toArray ( ) ;
  System . out . println ( Arrays . toString ( AVERAGE ) / A ) ;
  int MIN = AVERAGE [ AVERAGE . length - 1 ] ;
  int MINUSE = 0 ;
  for ( int a : AVERAGE ) if ( a == MIN ) MINUSE ++ ;
  int MAXUSE = 0 ;
  for ( int a : V . toArray ( ) ) if ( a == MIN ) MAXUSE ++ ;
  int ALLUSE = 0 ;
  for ( int a : V ) if ( a == MIN ) ALLUSE ++ ;
  final int MAX = Integer . parseInt ( input ) ;
  if ( V . get ( 0 ) != MIN ) System . out . println ( Math . factorial ( ALLUSE ) / Math . factorial ( MINUSE ) / Math . factorial ( ALLUSE - MINUSE ) ) ;
  else {
    int ANS = 0 ;
    for ( int use = MINUSE ;
    use <= MAXUSE ;
    use ++ ) ANS += Math . factorial ( ALLUSE ) / Math . factorial ( use ) / Math . factorial ( ALLUSE - use ) ;
    System . out . println ( ANS ) ;
  }
  return ANS ;
}
