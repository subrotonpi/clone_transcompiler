def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import brown
    from nltk.corpus import brown
    N = brown.count ( )
    A = brown.count ( )
    B = brown.count ( )
    brown.close ( )
    if N < A :
        print ( 'Broys' )
    if ( B - A ) % 2 == 0 :
        print ( 'Alice' )
    else :
        print ( 'Borys' )
