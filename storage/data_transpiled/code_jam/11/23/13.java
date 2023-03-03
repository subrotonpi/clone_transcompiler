;
}
data = Arrays . asList ( l . split ( " " ) ) ;
BufferedWriter out = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
{
  int colornum = bestmc ;
  for ( int i = 1 ;
  i < rooms . length ;
  i ++ ) {
    colornum += i + 1 + ' ' ;
  }
  out . write ( "Case #" + ( case + 1 ) + ": " + colornum ) ;
  out . write ( colornum + "\n" ) ;
}
