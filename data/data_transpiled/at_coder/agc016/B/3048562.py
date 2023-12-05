def main ( ) :
    import sys
    from random import randint
    from time import sleep
    sc = sys.stdin
    n = int ( sc.read ( ) )
    a = [ ]
    min = n
    max = 0
    for i in range ( n ) :
        a.append ( sc.read ( ) )
        if a [ i ] < min :
            min = a [ i ]
        if a [ i ] > max :
            max = a [ i ]
    if max - min >= 2 :
        print ( "No" )
        return
    if min == max :
        if min == 1 or min == n - 1 :
            print ( "Yes" )
            return
        if n / min >= 2 :
            print ( "Yes" )
            return
        print ( "No" )
    else :
        nmin = 0
        for ta in a :
            if ta == min :
                nmin += 1
        nmax = n - nmin
        if nmin < max and ( max - nmin ) * 2 <= nmax :
            print ( "Yes" )
        else :
            print ( "No" )
