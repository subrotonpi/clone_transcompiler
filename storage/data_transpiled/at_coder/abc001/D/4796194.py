def main ( args ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    n = sc.next ( )
    arr = [ 0 ] * ( 12 * 24 + 1 )
    for t in sc.input ( ).split ( '-' ) :
        s = int ( t [ 0 ] )
        s = s / 100 * 60 + s % 100
        s = s - s % 5
        e = int ( t [ 1 ] )
        e = e / 100 * 60 + e % 100
        if e % 5 :
            e = e + ( 5 - e % 5 )
        arr [ s // 5 ] += 1
        arr [ e // 5 ] -= 1
    sum = 0
    for i in range ( 12 * 24 + 1 ) :
        sum += arr [ i ]
        arr [ i ] = sum
    start = - 1
    for i in range ( 12 * 24 + 1 ) :
        if arr [ i ] > 0 :
            start = i
            while i < 12 * 24 + 1 and arr [ i ] > 0 :
                i += 1
            end = i
            print ( '%04d' % ( start // 12 * 100 + start % 12 * 5 ) , end = end )
            print ( '-' , end = end )
            print ( '%04d' % ( end // 12 * 100 + end % 12 * 5 ) , end = end )
