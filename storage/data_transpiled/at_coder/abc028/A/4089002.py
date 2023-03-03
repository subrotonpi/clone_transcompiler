def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    n = get_scanner ( )
    if n < 60 :
        print ( 'Bad' )
    elif n < 90 :
        print ( 'Good' )
    elif n < 100 :
        print ( 'Great' )
    else :
        print ( 'Perfect' )
