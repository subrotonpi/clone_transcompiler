static final String solve ( ) {
  psyco . full ( ) ;
  final String sepInOutput = " " ;
  {
    final int result = Integer . parseInt ( fi . readLine ( ) ) ;
    return result ;
  }
  {
    final int result = Integer . parseInt ( fi . readLine ( ) ) ;
    return result ;
  }
  {
    final int result = Integer . parseInt ( fi . readLine ( ) ) ;
  }
  {
    final int result = Integer . parseInt ( fi . readLine ( ) ) ;
    return result ;
  }
  {
    final int i = 2 ;
    do {
      boolean flag = true ;
      for ( int base : result ) {
        if ( happyp ( i , base ) == 0 ) {
          System . out . println ( "dada: n = " + i + ", base = " + base ) ;
        }
        else if ( happyp ( i , base ) == - 1 ) {
          flag = false ;
          break ;
        }
      }
      if ( flag ) {
        return i ;
      }
      else {
        i ++ ;
      }
    }
    while ( true ) ;
  }
  {
    final int squareofdigits ( int n , base ) {
      int sum = 0 ;
      while ( n > 0 ) {
        final int r = n / base ;
        sum += r * r ;
      }
      return sum ;
    }
    private int happyp ( int n , int base , int mtry ) {
      final Set < Integer > set = new HashSet < Integer > ( ) ;
      set . add ( n ) ;
      int k = 1 ;
      while ( k < mtry ) {
        if ( n == 1 ) {
          return 1 ;
        }
        else {
          final int n = squareofdigits ( n , base ) ;
          if ( set . contains ( n ) ) {
            return - 1 ;
          }
          else {
            set . add ( n ) ;
          }
        }
        k ++ ;
      }
      return 0 ;
    }
    @ Override public String solution2str ( Solution solution ) {
      return solution . toString ( ) ;
    }
  }
  {
    final FileReader fi = new FileReader ( f ) ;
    final PrintStream fo ;
    if ( f2 == null ) {
      fo = System . out ;
    }
    else {
      fo = new PrintStream ( f2 ) ;
    }
    final int setup [ ] = readProblemSetup ( fi ) ;
    final int N = setup [ 0 ] ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      fo . printf ( "Case #%d:%s%n\n" , i , sepInOutput , solution2str ( solveCase ( readCase ( fi ) , setup ) ) ) ;
    }
  }
  