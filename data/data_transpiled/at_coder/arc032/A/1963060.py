def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import brown
    from nltk.corpus import brown
    from nltk.corpus import brown
    score = 0
    n = brown.count ( )
    if n == 1 :
        print ( 'BOWWOW' )
        sys.exit ( )
    for i in range ( 0 , n ) :
        score += i
    for i in range ( 2 , n ) :
        if score % i == 0 :
            print ( 'BOWWOW' )
            sys.exit ( )
    print ( 'WANWAN' )
