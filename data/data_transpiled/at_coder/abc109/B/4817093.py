def main ( ) :
    import sys
    from nltk.corpus import word2string
    from nltk.corpus import word2string
    from nltk.corpus import word2string
    from nltk.corpus import word2string
    from nltk.corpus import word2string
    from nltk.corpus import word2string
    n = word2string.count ( '\n' )
    ans = 'Yes'
    wo = word2string.split ( '\n' )
    for i in range ( n ) :
        wo [ i ] = word2string.split ( '\n' )
        for j in range ( i ) :
            if wo [ j ] == wo [ i ] :
                ans = 'No'
    for i in range ( 1 , n ) :
        if wo [ i - 1 ] [ - 1 ] != wo [ i ] [ 0 ] :
            ans = 'No'
    print ( ans )
