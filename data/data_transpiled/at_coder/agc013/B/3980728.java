public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] Edge = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    Edge [ a - 1 ] [ b ] = b - 1 ;
    Edge [ b - 1 ] [ a ] = a - 1 ;
  }
  boolean [ ] Used = new boolean [ N ] ;
  Arrays . fill ( Used , false ) ;
  List < Integer > Path = new ArrayList < Integer > ( 1 ) ;
  Path . add ( Edge [ 0 ] [ 0 ] + 1 ) ;
  Used [ 0 ] = true ;
  Used [ Edge [ 0 ] [ 0 ] ] = true ;
  boolean AFin = false , BFin = false ;
  int Anext = 0 , Bnext = Edge [ 0 ] [ 0 ] ;
  for ( int node : Edge [ 0 ] ) {
    if ( ! Used [ node ] ) {
      Anext = node ;
      Used [ Anext ] = true ;
      break ;
    }
  }
  else AFin = true ;
  for ( int node : Edge [ Bnext ] ) {
    if ( ! Used [ node ] ) {
      Bnext = node ;
      Used [ Bnext ] = true ;
      break ;
    }
  }
  else BFin = true ;
  while ( ! AFin || ! BFin ) {
    if ( ! AFin ) {
      Path . add ( 0 , Anext + 1 ) ;
      for ( int node : Edge [ Anext ] ) {
        if ( ! Used [ node ] ) {
          Anext = node ;
          Used [ Anext ] = true ;
          break ;
        }
      }
    }
    else AFin = true ;
    if ( ! BFin ) {
      Path . add ( Bnext + 1 ) ;
      for ( int node : Edge [ Bnext ] ) {
        if ( ! Used [ node ] ) {
          Bnext = node ;
          Used [ Bnext ] = true ;
          break ;
        }
      }
    }
    else BFin = true ;
  }
  System . out . println ( Path . size ( ) ) ;
  System . out . println ( Arrays . toString ( Path ) ) ;
}
