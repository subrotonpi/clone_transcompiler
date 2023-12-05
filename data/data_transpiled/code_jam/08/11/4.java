@ org . junit . experimental . theories . DataPoints public static void main ( String [ ] args ) throws IOException {
  Scanner entrada = new Scanner ( new File ( "A-large.in" ) ) ;
  PrintWriter saida = new PrintWriter ( new File ( "y.out" ) ) ;
  int casos = Integer . parseInt ( entrada . nextLine ( ) ) ;
  for ( int caso = 1 ;
  caso <= casos ;
  caso ++ ) {
    int numeros = Integer . parseInt ( entrada . nextLine ( ) ) ;
    String [ ] a = entrada . nextLine ( ) . split ( " " ) ;
    String [ ] b = entrada . nextLine ( ) . split ( " " ) ;
    int [ ] c = new int [ numeros ] ;
    int [ ] d = new int [ numeros ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      c [ i ] = Integer . parseInt ( a [ i ] ) ;
    }
    for ( int i = 0 ;
    i < b . length ;
    i ++ ) {
      d [ i ] = Integer . parseInt ( b [ i ] ) ;
    }
    Arrays . sort ( c , Integer . reverseOrder ( ) ) ;
    int resultado = 0 ;
    for ( int i = 0 ;
    i < d . length ;
    i ++ ) {
      resultado += d [ i ] * c [ i ] ;
    }
    saida . println ( "Case #" + caso + ": " + resultado ) ;
  }
  entrada . close ( ) ;
  saida . close ( ) ;
}
