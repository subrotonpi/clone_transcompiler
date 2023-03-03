def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import brown
    from nltk.corpus import brown
    N = brown.count ( )
    if N % 400 == 0 :
        print ( 'YES' )
    elif N % 100 == 0 :
        print ( 'NO' )
    elif N % 4 == 0 :
        print ( 'YES' )
    else :
        print ( 'NO' )
