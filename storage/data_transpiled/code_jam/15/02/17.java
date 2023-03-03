static final Scanner fIn = new Scanner ( new File ( "file.in" ) ) ;
final PrintWriter fOut = new PrintWriter ( new BufferedWriter ( new FileWriter ( "file.out" ) ) ) ;
{
  final Scanner fIn = new Scanner ( new File ( "file.in" ) ) ;
  final Scanner fOut = new Scanner ( new File ( "file.out" ) ) ;
  final int solution = 0 ;
  final int min = Math . max ( plates ) ;
  for ( int i = 1 ;
  i <= Math . max ( plates ) ;
  i ++ ) {
    final int candidate = i + Math . pow ( plates , i ) - 1 ;
    if ( candidate < min ) {
      min = candidate ;
    }
  }
  return fIn . nextInt ( ) ;
}
