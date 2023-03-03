def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    sc = get_words ( )
    n = len ( brown.words ( ) )
    score = [ ]
    ans = 0
    for i in range ( n ) :
        score.append ( get_words ( sc , i ) )
        if score [ i ] < 80 :
            ans += 80 - score [ i ]
    print ( ans )
