def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    sc = get_words ( )
    n = len ( brown.words ( ) )
    input = [ ]
    yellow = 0
    for i in range ( n ) :
        input.append ( sc.next ( ) )
        if input [ i ] == 'Y' :
            yellow += 1
    if yellow > 0 :
        print ( 'Four' )
    else :
        print ( 'Three' )
