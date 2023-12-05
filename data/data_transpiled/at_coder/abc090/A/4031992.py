def main ( ) :
    import sys
    from nltk.tokenize import tokenize
    sc = tokenize ( sys.stdin )
    ary = [ ]
    for i in range ( 3 ) :
        ary.append ( sc.next ( ) )
    print ( ary [ 0 ] [ 0 ] + ary [ 1 ] [ 1 ] + ary [ 2 ] [ 2 ] )
