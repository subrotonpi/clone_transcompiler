def import sys , os , sys , glob , glob , patterns , patterns , default , config , verbose , args , ** kwargs ) :
    from collections import defaultdict
    sc = open ( glob , 'r' )
    dictplus = defaultdict ( list )
    dictminus = defaultdict ( list )
    N = sc.count ( ' ' )
    s1 = [ ]
    for i in range ( N ) :
        s1.append ( sc.read ( ) )
    M = sc.count ( ' ' )
    s2 = [ ]
    for i in range ( M ) :
        s2.append ( sc.read ( ) )
    sc.close ( )
    for i in range ( N ) :
        plus = 0
        plus += 1
        for k in range ( i + 1 , N ) :
            if s1 [ i ] == s1 [ k ] :
                plus += 1
        if s1 [ i ] in dictplus :
            if dictplus [ s1 [ i ] ] < plus :
                dictplus [ s1 [ i ] ] = plus
        else :
            dictplus [ s1 [ i ] ] = plus
    minus = 0
    for i in range ( M ) :
        minus = 0
        minus -= 1
        for k in range ( i + 1 , M ) :
            if s2 [ i ] == s2 [ k ] :
                minus -= 1
        if s2 [ i ] in dictminus :
            if dictminus [ s2 [ i ] ] > minus :
                dictminus [ s2 [ i ] ] = minus
        else :
            dictminus [ s2 [ i ] ] = minus
    ans = sys.maxsize
    for i in range ( N ) :
        sum1 = 0
        sum2 = 0
        for k in range ( M ) :
            sum1 = dictplus [ s1 [ i ] ]
            if s1 [ i ] == s2 [ k ] :
                sum2 = dictminus [ s2 [ k ] ]
                if - ( sum2 ) > sum1 :
                    sum1 = sum2
                else :
                    sum1 += sum2
                break
        if ans < sum1 :
            ans = sum1
    print ( ans )
