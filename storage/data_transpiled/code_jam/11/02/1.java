static final String getCommands ( ) {
  final String [ ] commands = new String [ commands . length ] ;
  for ( int i = 0 ;
  i < commands . length ;
  i ++ ) {
    commands [ i ] = commands [ i ] ;
  }
  /* make com command */
  if ( commands . length > 1 && commands [ commands . length - 1 ] . contains ( new Integer ( commands [ commands . length - 1 ] ) ) ) {
    commands [ commands . length - 2 ] = commands [ ( commands . length - 1 ) ] ;
    commands [ commands . length - 1 ] = commands [ commands . length - 2 ] ;
    commands [ commands . length - 1 ] = commands [ commands . length - 1 ] ;
    makecom ( commands , commands ) ;
  }
  /* run invoke */
  final List < String > command = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < invoke . length ;
  i ++ ) {
    commands . add ( invoke [ i ] ) ;
    command = makecom ( commands , commands ) ;
    for ( int k = 0 ;
    k < command . length - 1 ;
    k ++ ) {
      if ( killers . contains ( new Integer ( k ) ) ) {
        command . clear ( ) ;
        break ;
      }
    }
  }
  /* read input */
  final String [ ] strings = scanner . nextLine ( ) . split ( " " ) ;
  final int numCom = Integer . parseInt ( strings [ 0 ] ) ;
  final List < String > com = Arrays . asList ( strings [ 1 : numCom + 1 ] ) ;
  final int numKill = Integer . parseInt ( strings [ 1 + numCom ] ) ;
  final List < String > kill = Arrays . asList ( strings [ 2 + numCom : 2 + numCom + numKill ] ) ;
  final List < String > invoke = Arrays . asList ( strings [ strings . length - 1 ] ) ;
  final Map < String , String > coms = new HashMap < String , String > ( ) ;
  final Set < String > killers = new HashSet < String > ( ) ;
  for ( String c : com ) {
    coms . put ( new Integer ( c . substring ( 0 , c . indexOf ( '.' ) ) ) , c . substring ( 2 ) ) ;
    coms . put ( new Integer ( c . substring ( c . indexOf ( '.' ) + 1 ) ) , c . substring ( c . indexOf ( '.' ) + 1 ) ,