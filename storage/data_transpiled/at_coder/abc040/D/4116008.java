public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  Edge [ ] edges = new Edge [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) edges [ i ] = new Edge ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Arrays . sort ( edges , new Comparator < Edge > ( ) {
    @ Override public int compare ( Edge o1 , Edge o2 ) {
      return - o1 . getRight ( ) ;
    }
  }
  ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  Query [ ] queries = new Query [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) queries [ i ] = new Query ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Arrays . sort ( queries , new Comparator < Query > ( ) {
    @ Override public int compare ( Query o1 , Query o2 ) {
      return - o1 . getRight ( ) ;
    }
  }
  ) ;
  Answer [ ] answers = new Answer [ q ] ;
  int [ ] parent = new int [ n ] ;
  int [ ] unionSize = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    parent [ i ] = i ;
  }
  / * ▁ find ▁ the ▁ first ▁ child ▁ of ▁ the ▁ first ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ first ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ second ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ second ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ child ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ of ▁ the ▁ child ▁ of ▁ the ▁ second ▁ of ▁ the ▁ child ▁ of ▁ the ▁ child ▁