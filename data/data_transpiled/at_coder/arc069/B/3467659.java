static char getSpecies ( char sw , char ox , char swAdj ) {
  if ( ( sw == 'S' && ox == 'o' ) || ( sw == 'W' && ox == 'x' ) ) {
    return swAdj ;
  }
  else {
    return "SW" . charAt ( swAdj == 'S' ) ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  char [ ] ss = input ( ) ;
  for ( char pat : new char [ ] {
    'SS' , 'SW' , 'WS' , 'WW' }
    ) {
      char [ ] [ ] anss = new char [ N - 2 ] [ N ] ;
      for ( char i = 0 ;
      i < N - 1 ;
      i ++ ) {
        anss [ i ] = new char [ N - 1 ] ;
        for ( char j = 0 ;
        j < j ;
        j ++ ) {
          anss [ i ] [ j ] = getSpecies ( anss [ i ] , ss [ i ] , anss [ i - 1 ] ) ;
        }
        if ( ( getSpecies ( anss [ anss . length - 1 ] , ss [ anss . length - 1 ] , anss [ anss . length - 2 ] ) == anss [ 0 ] ) && ( getSpecies ( anss [ 0 ] , ss [ 0 ] , anss [ anss . length - 1 ] ) == anss [ 1 ] ) ) {
          System . out . println ( new String ( anss ) ) ;
          break ;
        }
      }
    }
    else {
      System . out . println ( - 1 ) ;
    }
    return 0 ;
  }
  