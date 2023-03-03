static String lines = FileUtil . readFileToString ( "b-large.txt" ) ;
int T = Integer . parseInt ( lines . get ( 0 ) ) ;
{
  List < String > sources = Lists . newArrayList ( ) ;
  for ( String line : lines2 ) {
    sources . add ( Collections . singletonList ( Double . parseDouble ( line ) ) ) ;
  }
  double rate = 0 ;
  List < String > tooCold = new ArrayList < > ( ) ;
  List < String > tooHoti = new ArrayList < > ( ) ;
  for ( String source : sources ) {
    if ( source . length ( ) > X ) tooHoti . add ( source ) ;
    else if ( source . length ( ) < X ) tooCold . add ( source ) ;
    else rate += source . length ( ) ;
  }
  Collections . sort ( tooCold , new Comparator < String > ( ) {
    @ Override public int compare ( String s , String s1 ) {
      return s . length ( ) - s . length ( ) ;
    }
  }
  ) ;
  Collections . sort ( tooHoti , new Comparator < String > ( ) {
    @ Override public int compare ( String s , String s1 ) {
      return - s . length ( ) ;
    }
  }
  ) ;
  int coldI = tooCold . size ( ) - 1 ;
  int hotI = tooHoti . size ( ) - 1 ;
  while ( coldI >= 0 && hotI >= 0 ) {
    String cold = tooCold . get ( coldI ) ;
    String hot = tooHoti . get ( hotI ) ;
    if ( cold . length ( ) * ( X - cold . length ( ) ) > hot . length * ( hot . length ( ) - X ) ) {
      rate += hot . length ( ) + hot . length ( ) * ( hot . length ( ) - X ) / ( X - cold . length ( ) ) ;
      hotI -- ;
      tooCold . get ( coldI ) . length -= hot . length ( ) * ( hot . length ( ) - X ) / ( X - cold . length ( ) ) ;
    }
    else {
      rate += cold . length ( ) + cold . length ( ) * ( X - cold . length ( ) ) / ( hot . length ( ) - X ) ;
      coldI -- ;
      tooHoti . get ( hotI ) . length -= cold . length ( ) * ( hot .