public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> py = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    py . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int [ ] cnt = new int [ N + 1 ] ;
  Map < Integer , String > ids = new HashMap < > ( ) ;
  for ( int p = 0 ;
  p < py . size ( ) ;
  p ++ ) {
    cnt [ p ] ++ ;
    ids . put ( py . get ( p ) , String . format ( "%06d%06d" , p , cnt [ p ] ) ) ;
  }
  for ( final int y : py ) {
    System . out . println ( ids . get ( y ) ) ;
  }
}
