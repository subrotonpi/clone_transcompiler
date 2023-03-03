static final int pairize ( List < Integer > L ) throws IOException {
  return Arrays . stream ( L . toArray ( new Integer [ L . size ( ) ] ) ) . mapToInt ( i -> new Integer ( L . get ( i ) ) ) . sum ( ) ;
}
