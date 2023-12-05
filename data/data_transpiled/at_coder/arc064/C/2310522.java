static final double [ ] [ ] G ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final double sx = Double . parseDouble ( input . nextLine ( ) ) ;
  final double sy = Double . parseDouble ( input . nextLine ( ) ) ;
  final double tx = Double . parseDouble ( input . nextLine ( ) ) ;
  final double ty = Double . parseDouble ( input . nextLine ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final double [ ] [ ] X = new double [ 1 ] [ N + 2 ] ;
  final double [ ] [ ] Y = new double [ N + 2 ] [ N + 2 ] ;
  final double [ ] R = new double [ N + 2 ] [ N + 2 ] ;
  System . arraycopy ( X , 0 , Y , 0 , N ) ;
  System . arraycopy ( Y , 0 , R , 0 , N ) ;
  return X ;
}
