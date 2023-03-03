def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    Scanner ( ).run ( )
    N = len ( brown.corpus.brown.words )
    if N == 100 :
        print ( 'Perfect' )
    elif N >= 90 :
        print ( 'Great' )
    elif N >= 60 :
        print ( 'Good' )
    else :
        print ( 'Bad' )
