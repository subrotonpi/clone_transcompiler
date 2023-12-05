def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    Scanner ( ).run ( )
    N = len ( brown.corpus.brown.words )
    A = len ( brown.corpus.brown.words )
    B = len ( brown.corpus.brown.words )
    if ( B - A ) % 2 == 0 :
        print ( 'Alice' )
    else :
        print ( 'Borys' )
