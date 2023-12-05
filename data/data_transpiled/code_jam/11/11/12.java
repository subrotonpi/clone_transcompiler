static HashMap < Integer , HashMap < Integer , Integer >> gcds = new HashMap < Integer , HashMap < Integer , Integer >> ( ) {
  private static final long serialVersionUID = 1L ;
  {
    int end = Math . max ( a , b ) ;
    int sor = Math . min ( a , b ) ;
    if ( gcds . containsKey ( end ) ) {
      if ( gcds . get ( end ) . containsKey ( sor ) ) {
        return gcds . get ( end ) . get ( sor ) ;
      }
    }
    int rem = end % sor ;
    if ( rem == 0 ) {
      if ( ! gcds . containsKey ( end ) ) {
        gcds . put ( end , new HashMap < Integer , Integer > ( ) ) ;
      }
      gcds . get ( end ) . put ( sor , sor ) ;
      return sor ;
    }
    else {
      int answer = gcd ( sor , rem ) ;
      if ( ! gcds . containsKey ( end ) ) {
        gcds . put ( end , new HashMap < Integer , Integer > ( ) ) ;
      }
      gcds . get ( end ) . put ( sor , answer ) ;
      return answer ;
    }
  }
  private static String solver ( int n , int pd , int pg ) {
    if ( pd == 0 ) {
      if ( pg == 100 ) {
        return "Broken" ;
      }
      else {
        return "Possible" ;
      }
    }
    if ( pg == 0 ) {
      if ( pd == 0 ) {
        return "Broken" ;
      }
      else {
        return "Broken" ;
      }
    }
    int minPlayed = 100 / gcd ( pd , 100 ) ;
    if ( minPlayed > n ) {
      return "Broken" ;
    }
    if ( pg == 100 && ! pd == 100 ) {
      return "Broken" ;
    }
    return "Possible" ;
  }
  private static long serialVersionUID = 1L ;
  {
    BufferedReader bufferedReader = new BufferedReader ( new FileReader ( "infile.txt" ) ) ;
    int cases = Integer . parseInt ( bufferedReader . readLine ( ) ) ;
    StringBuilder output = new StringBuilder ( ) ;
    for ( int c = 0 ;
    c < cases ;
    c ++ ) {
      Arrays . fill ( br . readLine ( ) , - 1 ) ;
      int answer = solver ( n , pd , pg ) ;
      output . append ( "Case #" + ( c + 1 ) + ": " + Integer . toString ( answer ) + "\n" ) ;
    }
    bufferedReader . close ( ) ;
    BufferedWriter bufferedWriter = new BufferedWriter ( new FileWriter ( "outfile.txt" ) ) ;
    bufferedWriter