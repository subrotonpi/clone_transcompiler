@ GwtIncompatible ( "java.util.BitSet" ) private static final java . util . BitSet getBitSet ( ) {
  class PriorityDictionary implements java . util . BitSet {
    private final java . util . BitSet heap ;
    private final java . util . BitSet set ;
    private final java . util . BitSet smallest ;
    private final java . util . BitSet smallest ;
    private final java . util . BitSet smallest ;
    private final java . util . BitSet last ;
    private final java . util . BitSet last ;
    private final java . util . BitSet last ;
    private final java . util . BitSet last ;
    private final java . util . BitSet last ;
    private final java . util . BitSet last ;
    private final java . util . BitSet last ;
    private final java . util . BitSet last = java . util . BitSet . ZERO ;
    private final java . util . BitSet last = java . util . BitSet . ZERO ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet last = last . set ;
    private final java . util . BitSet next = last . set ;
  }
  return new PriorityDictionary ( ) {
    @ Override public int size ( ) {
      return last . cardinality ( )