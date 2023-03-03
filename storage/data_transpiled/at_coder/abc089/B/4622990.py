def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    n = len ( brown.words ( ) )
    ans = 0
    G , W , P , Y = False , False , False , False
    for s in brown.words ( ) :
        if s == 'G' and not G :
            G = True
            ans += 1
        if s == 'P' and not P :
            P = True
            ans += 1
        if s == 'W' and not W :
            W = True
            ans += 1
        if s == 'Y' and not Y :
            Y = True
            ans += 1
    if ans == 3 :
        print ( 'Three' )
    elif ans == 4 :
        print ( 'Four' )
