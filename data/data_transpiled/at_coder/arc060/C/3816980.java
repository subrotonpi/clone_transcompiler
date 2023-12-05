public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* int hmd = -1;
  while (H[ctr+1][a]<b) {
  ctr++;
  }*/
  int vn = H [ ctr ] [ a ] ;
  if ( ( vn == b && ctr == 0 ) || ctr == - 1 ) {
    return 1 ;
  }
  / * ▁ 2 * * ctr ▁ + ▁ hmd ▁ = ▁ 2 * * ( ctr ▁ - ▁ 1 ) ;
  STRNEWLINE ▁ int ▁ N ▁ = ▁ Integer . parseInt ( input . nextLine ( ) ) ;
  STRNEWLINE ▁ int ▁ x ▁ = ▁ inpl ( ) . add ( 10 * * 10 ) ;
  STRNEWLINE ▁ int ▁ L ▁ = ▁ Integer . parseInt ( input . nextLine ( ) ) ;
  STRNEWLINE ▁ int [ ] [ ] ▁ H ▁ = ▁ new ▁ int [ N ] [ N ] ;
  STRNEWLINE ▁ int [ ] [ ] ▁ G ▁ = ▁ new ▁ int [ N ] [ N ] ;
  STRNEWLINE ▁ int ▁ b ▁ = ▁ 0 ;
  STRNEWLINE ▁ for ▁ ( int ▁ a ▁ = ▁ 0 ;
  ▁ a ▁ < ▁ N ;
  ▁ a + + ) ▁ {
    STRNEWLINE ▁ while ▁ ( x [ b + 1 ] - x [ a ] <= L ) ▁ {
      STRNEWLINE ▁ if ▁ ( b ▁ = = ▁ N - 1 ) ▁ {
        STRNEWLINE ▁ break ;
        STRNEWLINE ▁ }
        STRNEWLINE ▁ b ++ ;
        STRNEWLINE ▁ }
        STRNEWLINE ▁ G [ a ] = b ;
        STRNEWLINE ▁ }
        STRNEWLINE ▁ H [ 0 ] [ N ] ▁ = ▁ G [ 0 ] ;
        STRNEWLINE ▁ while ▁ ( G [ 0 ] [ N ] ▁ ! = ▁ N - 1 ) ▁ {
          STRNEWLINE ▁ G [ 0 ] [ N ] ▁ = ▁ G [ 0 ] ;
          STRNEWLINE ▁ }
          STRNEWLINE ▁ H [ N ] [ N ] ▁ = ▁ 10 * * ( N ▁ - ▁ 1 ) ;
          STRNEWLINE ▁ int ▁ Q ▁ = ▁ Integer . parseInt ( input . nextLine ( ) ) ;
          STRNEWLINE ▁ for ▁ ( int ▁ i ▁ = ▁ 0 ;
          ▁ i ▁ < ▁ Q ;
          ▁ i + + ) ▁ {
            STRNEWLINE ▁ int ▁ a ▁ = ▁ Integer . parseInt ( input . nextLine ( ) ) ;
            STRNEWLINE ▁ int ▁ b ▁ = ▁ Integer . parseInt ( input . nextLine ( ) ) ;
            STRNEWLINE ▁ System . out