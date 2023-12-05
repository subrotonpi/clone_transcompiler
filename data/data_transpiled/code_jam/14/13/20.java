static final double SCALEFACTOR = 2 ;
final double SCALEFACTOR2 = 0.8 ;
double p ;
double sum = 0 ;
double sum = 0 ;
double sum = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  sum = sum / ( i * i ) ;
  if ( sum > position ) {
    sum = Math . sqrt ( position * position + ( N - number ) * ( i - position ) * ( i - position ) ) / N ;
  }
  else {
    sum = Math . sqrt ( ( position - N / 2 ) * ( i + ( number - N / 2 ) * ( i - position ) ) * ( i - position ) * SCALEFACTOR2 ) / N * SCALEFACTOR2 ;
  }
  sum += 1 / N - ( 1 / N ) * SCALEFACTOR + ( sum * 2 * ( 1 / N ) * SCALEFACTOR ) ;
}
try {
  BufferedReader reader = new BufferedReader ( new FileReader ( "C.in" ) ) ;
  FileWriter f2 = new FileWriter ( "C.out" ) ;
  String line = reader . readLine ( ) ;
  String output = "" ;
  ArrayList < Integer > scores = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Integer . parseInt ( line ) ;
  i ++ ) {
    ArrayList < Integer > permutation = new ArrayList < > ( ) ;
    for ( String n : line . substring ( 2 + i * 2 ) . split ( "\\s" ) ) {
      permutation . add ( Integer . parseInt ( n ) ) ;
    }
    int score = 0 ;
    for ( int q = 0 ;
    q < permutation . size ( ) ;
    q ++ ) {
      score = score + sum ;
      sum += getProbability ( q , permutation . get ( q ) , permutation . size ( ) ) ;
    }
    scores . add ( score ) ;
  }
  median = new Double ( scores . get ( 60 ) ) . compareTo ( sum ) ;
  for ( int i = 0 ;
  i < scores . size ( ) ;
  i ++ ) {
    score = scores . get ( i ) ;
    output += "Case #" + ( i + 1 ) + ": " ;
    if ( score > median ) {
      output += "BAD" ;
    }
    else {
      output += "GOOD" ;
    }
    output += "\n" ;
  }
  System . out . println ( output ) ;
  f2 . write ( output ) ;
}
catch ( IOException e ) {
  e . printStackTrace ( ) ;
}
return sum ;
}
