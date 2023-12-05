def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    sc = get_scanner ( )
    n = int ( sc.read ( ) )
    if n <= 59 :
        print ( 'Bad' )
    elif n <= 89 :
        print ( 'Good' )
    elif n <= 99 :
        print ( 'Great' )
    else :
        print ( 'Perfect' )
