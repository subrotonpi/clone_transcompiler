def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import brown
    A , B , S = brown.symbols ( 'A, B, S' )
    ans = True
    for i in range ( A ) :
        if S [ i ] == '-' : ans = False
    if S [ A ] != '-' : ans = False
    for i in range ( A + 1 , len ( S ) ) :
        if S [ i ] == '-' : ans = False
    if ans :
        print ( 'Yes' )
    else :
        print ( 'No' )
