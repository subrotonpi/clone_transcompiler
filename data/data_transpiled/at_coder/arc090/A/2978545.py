def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    from nltk.corpus import brown
    from nltk.util import get_words
    n = len ( brown.words ( ) )
    a1 = brown.words ( )
    a2 = brown.words ( )
    s1 = [ ]
    s2 = [ ]
    for i in range ( n ) :
        a1.append ( get_words ( i ) )
    for i in range ( n ) :
        a2.append ( get_words ( i ) )
    s1.append ( a1 [ 0 ] )
    s2.append ( a2 [ n - 1 ] )
    for i in range ( 1 , n ) :
        s1 [ i ] = s1 [ i - 1 ] + a1 [ i ]
    for i in range ( n - 2 , - 1 , - 1 ) :
        s2 [ i ] = s2 [ i + 1 ] + a2 [ i ]
    score = 0
    for i in range ( n ) :
        score = max ( score , s1 [ i ] + s2 [ i ] )
    print ( score )
