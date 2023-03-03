static final String getLargeString ( ) throws FileNotFoundException {
  System . nanoTime ( ) ;
  System . setIn ( new FileInputStream ( "A-large.in" ) ) ;
  System . setOut ( new PrintStream ( "A-large.out" ) ) ;
  /* Work around the input string */
  int R = Integer . parseInt ( input ( ) ) ;
  int C = Integer . parseInt ( input ( ) ) ;
  char [ ] [ ] grid = new char [ R ] [ C ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) grid [ i ] = input . toCharArray ( ) ;
  char [ ] [ ] ee = new char [ C ] [ R ] ;
  for ( int j = 0 ;
  j < C ;
  j ++ ) for ( int i = 0 ;
  i < R ;
  i ++ ) if ( grid [ i ] [ j ] == '.' ) continue ;
  ee [ i ] [ j ] += '^' ;
  break ;
  for ( int i = R - 1 ;
  i >= 0 ;
  i -- ) if ( grid [ i ] [ j ] == '.' ) continue ;
  ee [ i ] [ j ] += 'v' ;
  break ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) for ( int j = 0 ;
  j < C ;
  j ++ ) if ( ee [ i ] [ j ] == '.' ) continue ;
  ee [ i ] [ j ] += '<' ;
  break ;
  for ( int j = C - 1 ;
  j >= 0 ;
  j -- ) if ( grid [ i ] [ j ] == '.' ) continue ;
  ee [ i ] [ j ] += '>' ;
  break ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) for ( int j = 0 ;
  j < C ;
  j ++ ) {
    if ( ee [ i ] [ j ] . length == 4 ) return "IMPOSSIBLE" ;
    if ( ee [ i ] [ j ] . contains ( grid [ i ] [ j ] ) ) ans ++ ;
  }
  return String . valueOf ( ans ) ;
  / * ▁ if ▁ ( Class . isAnnotationPresent ) ▁ {
    STRNEWLINE ▁ int ▁ T ▁ = ▁ Integer . parseInt ( input ( ) ) ;
    STRNEWLINE ▁ for ▁ ( int ▁ i ▁ = ▁ 0 ;
    ▁ i ▁ < ▁ T ;
    ▁ i + + ) ▁ System . out . println