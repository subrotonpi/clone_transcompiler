def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( '.txt' )
    ans = 0
    for i in range ( 12 ) :
        s = sc.next ( )
        if 'r' in s :
            ans += 1
    print ( ans )
