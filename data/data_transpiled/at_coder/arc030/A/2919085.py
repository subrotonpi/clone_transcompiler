def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    words = get_words ( )
    n , k = len ( words ) , len ( words )
    print ( 'YES' if k <= n / 2 else 'NO' )
