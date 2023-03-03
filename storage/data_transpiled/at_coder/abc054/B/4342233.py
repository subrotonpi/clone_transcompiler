def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    sc = get_words ( )
    n = sc.count ( '\n' )
    m = sc.count ( '\n' )
    a = [ ]
    b = [ ]
    is_ans = False
    for i in range ( n ) :
        a.append ( sc.text ( ) )
    for i in range ( m ) :
        b.append ( sc.text ( ) )
    label :
        for i in range ( n - m + 1 ) :
            for j in range ( n - m + 1 ) :
                for k in range ( m ) :
                    s = a [ i + k ] [ j : j + m ]
                    if not ( s == b [ k ] ) :
                        break
                    if k >= m - 1 :
                        is_ans = True
                        break label
    print ( is_ans and 'Yes' or 'No' )
