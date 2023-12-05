def main ( ) :
    import sys
    for n in range ( 1 , len ( sys.argv ) ) :
        t = [ ]
        sumA , sumB = 0 , 0
        for i in range ( n ) :
            t.append ( sys.argv [ n ] )
            sumB += t [ i ]
        ans = sys.argv [ n ]
        for i in range ( n ) :
            sumA += t [ i ]
            sumB -= t [ i ]
            if i == n - 1 :
                continue
            ans = min ( ans , abs ( sumA - sumB ) )
        print ( ans )
