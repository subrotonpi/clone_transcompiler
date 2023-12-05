def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    from nltk.corpus import brown
    from nltk.util import get_words
    N = len ( brown.symbols ( ) )
    M = len ( brown.symbols ( ) )
    map = { }
    for i in range ( M ) :
        map [ i - 1 ] += 1
        map [ i - 1 ] += 1
    for i in range ( N ) :
        print ( map [ i ] )
