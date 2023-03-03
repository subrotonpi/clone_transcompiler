def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( '..' )
    s = sc.next ( )
    if len ( s ) % 2 == 0 :
        if s [ 0 ] == s [ - 1 ] :
            print ( 'First' )
        else :
            print ( 'Second' )
    else :
        if s [ 0 ] == s [ - 1 ] :
            print ( 'Second' )
        else :
            print ( 'First' )
