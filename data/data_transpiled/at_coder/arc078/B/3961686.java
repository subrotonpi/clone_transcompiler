public static int [ ] [ ] dijkstra_stack ( int i ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] AB = new int [ N - 1 ] [ N ] ;
  for ( int j = 0 ;
  j < AB . length ;
  j ++ ) AB [ j ] [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final HashMap < Integer , HashSet < Integer >> G = new HashMap < > ( ) ;
  for ( int a = 0 ;
  a < AB . length ;
  a ++ ) AB [ j ] [ i ] = i ;
  for ( int b = 0 ;
  b < AB . length ;
  b ++ ) AB [ j ] [ i ] = i ;
  for ( int a = 0 ;
  a < AB . length ;
  a ++ ) AB [ a ] [ i ] = i ;
  for ( int b = 0 ;
  b < AB . length ;
  b ++ ) AB [ b ] [ i ] = i ;
  return new int [ ] [ ] {
    {
      - 1 }
      , {
        - 1 }
        , {
          - 1 }
        }
        ;
      }
      