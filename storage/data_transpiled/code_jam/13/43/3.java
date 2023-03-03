static final String input = "Input a list of numbers" ;
final Scanner in = new Scanner ( System . in ) ;
final int num = in . nextInt ( ) ;
{
  final int N = in . nextInt ( ) ;
  final int [ ] ns = new int [ N ] ;
  {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ns [ i ] = 0 ;
      for ( int j = 0 ;
      j < ns . length ;
      j ++ ) {
        if ( in . nextInt ( ) > j ) {
          ns [ i ] = Math . max ( ns [ j ] + 1 , ns [ i ] ) ;
        }
      }
    }
    return Math . max ( ns [ num ] , ns [ num ] ) ;
  }
  {
    final int [ ] ns = new int [ N ] ;
    {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        ns [ i ] = 10000 ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          if ( in . nextInt ( ) < j ) {
            ns [ i ] = Math . max ( ns [ j ] + 1 , ns [ i ] ) ;
          }
        }
      }
    }
  }
  {
    final int [ ] ns = new int [ N ] ;
    {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        ns [ i ] = 0 ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          if ( in . nextInt ( ) < j ) {
            ns [ i ] = Math . max ( ns [ j ] + 1 , ns [ i ] ) ;
          }
        }
      }
    }
  }
  {
    final int [ ] li = new int [ N ] ;
    {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( li [ i ] < n ) {
          continue ;
        }
        if ( a [ i ] == 1 + inc ( Arrays . copyOfRange ( li , i , li . length ) ) && b [ i ] == 1 + dec ( Arrays . copyOfRange ( li , i + 1 , li . length ) ) ) {
          li [ i ] = n ;
          if ( max ( li ) == n ) {
            return li [ i ] ;
          }
        }
      }
    }
  }
}
