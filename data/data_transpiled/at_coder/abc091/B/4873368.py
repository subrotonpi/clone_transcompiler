def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_corpus
    from nltk.corpus import brown
    from nltk.util import get_corpus
    from nltk.corpus import brown
    N = len ( brown.corpus ( 's1' ) )
    S = brown.corpus ( 's2' )
    M = len ( brown.corpus ( 's3' ) )
    T = brown.corpus ( 's3' )
    tkhs = ''
    ans = 0
    score = 0
    for tkhs in S :
        score = 0
        for i in range ( N ) :
            if i == tkhs :
                score += 1
        for i in range ( M ) :
            if i == tkhs :
                score -= 1
        ans = max ( ans , score )
    print ( ans )
