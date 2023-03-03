def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    with open ( 'input.txt' , 'r' ) as f :
        N = len ( f.read ( ) )
        c = f.read ( )
    c1 = ''
    cnt1 = cnt2 = cnt3 = cnt4 = 0
    for i in range ( N ) :
        c1 = c [ i ]
        if c1 == '1' :
            cnt1 += 1
        elif c1 == '2' :
            cnt2 += 1
        elif c1 == '3' :
            cnt3 += 1
        elif c1 == '4' :
            cnt4 += 1
    num_cnt = [ cnt1 , cnt2 , cnt3 , cnt4 ]
    min = cnt1
    max = cnt1
    for i in num_cnt :
        max = max ( max , i )
        min = min ( min , i )
    print ( max , min )
