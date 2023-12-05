static final String getTestName ( ) throws Exception {
  final String target = "-sdu" ;
  if ( target . endsWith ( "." ) ) {
    System . out . println ( ">> " + target ) ;
  }
  else {
    System . out . println ( ">> " + target ) ;
  }
  final File f = new File ( target ) ;
  final String cpp = f . getName ( ) ;
  if ( ! f . exists ( ) ) throw new Exception ( "End of file" ) ;
  if ( DEBUG ) System . out . println ( "INPUT:" + target ) ;
  else {
    System . out . println ( "--verbose" ) ;
  }
  final int [ ] ints = map ( Integer . parseInt ( line ) , target ) ;
  final String cxx = f . getName ( ) ;
  if ( cxx != null ) {
    System . out . println ( "--verbose" ) ;
    System . out . println ( cxx ) ;
  }
  else {
    System . out . println ( "--verbose" ) ;
    System . out . println ( cxx ) ;
  }
  final String cxx = f . getName ( ) ;
  if ( DEBUG ) {
    System . out . println ( "Compiling " + cxx ) ;
  }
  else {
    System . out . println ( "--verbose" ) ;
  }
  final Options opts = new Options ( ) ;
  opts . setTarget ( target ) ;
  if ( opts . getFlag ( ) ) {
    System . out . println ( "--verbose" ) ;
    System . out . println ( cxx ) ;
  }
  final Options opts = new Options ( ) ;
  opts . setTarget ( target ) ;
  if ( opts . getFlag ( ) ) {
    System . out . println ( "--verbose" ) ;
    System . out . println ( "--verbose" ) ;
  }
  final Options opts = new Options ( ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( target ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  opts . setTarget ( cxx ) ;
  return cxx ;
}
