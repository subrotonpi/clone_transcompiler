def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    sc = get_scanner ( )
    n = sc.__next__ ( )
    a = sc.__next__ ( )
    b = sc.__next__ ( )
    if ( b - a ) % 2 == 0 :
        print ( 'Alice' )
    else :
        print ( 'Borys' )
