static private boolean isEdgeExists ( Node node1 , Node node2 , List < List < Node >> edges ) {
  for ( List < Node > edge : edges ) {
    if ( node1 . contains ( edge ) && node2 . contains ( edge ) ) {
      return true ;
    }
  }
  return false ;
}
