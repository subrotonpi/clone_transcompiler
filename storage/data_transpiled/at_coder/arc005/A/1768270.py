def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    sc = get_words ( )
    n = len ( brown.words ( ) )
    w = [ ]
    for i in range ( n ) :
        w.append ( sc.next ( ) )
    ans = 0
    for i in range ( n ) :
        if i == n - 1 :
            w [ i ] = w [ i ].decode ( 'utf-8' )
        if w [ i ] in [ 'TAKAHASHIKUN' , 'Takahashikun' , 'takahashikun' ] :
            ans += 1
    print ( ans )
