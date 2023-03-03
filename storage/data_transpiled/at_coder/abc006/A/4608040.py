def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    N = len ( brown.words ( ) )
    if N % 3 == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
