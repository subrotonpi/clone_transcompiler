static final String getFilePath ( ) {
  String currDir = System . getProperty ( "user.dir" ) ;
  String srcfilename = currDir + File . separator + "A-large.in" ;
  String dstfilename = currDir + File . separator + "output.txt" ;
  /* solve the numbers */
  ArrayList < Double > results = new ArrayList < Double > ( ) ;
  int L = numbers . size ( ) ;
  int X = Integer . parseInt ( numbers . get ( 0 ) ) ;
  for ( int index = 1 ;
  index < L ;
  index ++ ) {
    double number = numbers . get ( index ) ;
    double x = ( double ) X ;
    ArrayList < Double > others = new ArrayList < Double > ( Arrays . asList ( numbers . subList ( 0 , index ) + numbers . subList ( index + 1 , numbers . size ( ) ) ) ) ;
    ArrayList < Double > othersMin = new ArrayList < Double > ( ) ;
    for ( Double otherMin : others ) {
      if ( otherMin <= number ) {
        othersMin . add ( otherMin ) ;
      }
    }
    int lMin = othersMin . size ( ) ;
    ArrayList < Double > othersMax = new ArrayList < Double > ( ) ;
    for ( Double otherMax : others ) {
      if ( otherMax > number ) {
        othersMax . add ( otherMax ) ;
      }
      x -= Double . parseDouble ( othersMin ) ;
      if ( x <= 0 ) {
        results . add ( 0d ) ;
      }
      else {
        double thresh = number ;
        boolean solved = false ;
        for ( int idx = 0 ;
        idx < othersMax . size ( ) ;
        idx ++ ) {
          double otherMax = othersMax . get ( idx ) ;
          if ( ( otherMax - thresh ) * ( lMin + idx + 1 ) < x ) {
            x -= ( otherMax - thresh ) * ( lMin + idx + 1 ) ;
            thresh = otherMax ;
          }
          else {
            double finalDouble = thresh + ( double ) x / ( lMin + idx + 1 ) ;
            results . add ( ( double ) finalDouble - number / X ) ;
            solved = true ;
            break ;
          }
        }
        if ( ! solved ) {
          double finalDouble = thresh + ( double ) x / L ;
          results . add ( ( double ) finalDouble - number / X ) ;
        }
      }
    }
    results . clear ( ) ;
    results . add ( 0d ) ;
    return results . toString ( ) ;
  }
  